package Game.BH.Tetris;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programma per realizzare il gioco Tetris, con regole facilitate. I pezzi non
 * cadranno come nel gioco vero, ma verranno solamente posizionati e a un certo
 * punto fermati dall'utente. L'argomento principale di studio è la
 * scomposizione in sottoprogrammi e la gestione di eccezioni personalizzate
 * create da noi.
 *
 * @author damiano
 */
public class D4mnAsciiTetris {

    /**
     * Variabile globale campo. Una matrice di booleani che contiene
     * l'informazione binaria per sapere se una cella è occupata da un pixel di
     * un blocco oppure no. è GLOBALE perchè ci servirà accedere a questa
     * variabile da vari metodi. Non è ancora istanziata perchè la dimensione
     * verrà inserita dall'utente.
     */
    public static boolean[][] campo;
    // variabili di grandezza minima del campo:
    public static final int MIN_ROW = 6;
    public static final int MIN_COL = 8;
    // variabili di grandezza massima dei pezzi:
    public static final int MAX_ROW_PEZZO = 3;
    public static final int MAX_COL_PEZZO = 3;
    // variabile per gestire la generazione casuale dei pezzi:
    public static final double PIXEL_PROBABILITY = .6;
    public static int punti = 0;
    public static int counterBlocchi = 0;
    public static String nome;
    public static Scanner scanner = new Scanner(System.in);
    public static boolean[][] next;

    public static void clearConsole() {

    }

    /**
     * @param args the command line arguments
     */
    public static void gameStart() {

        presentazione();

        System.out.print("Nome giocatore? ");
        nome = scanner.next();
        try {
            initCampo();
        } catch (CampoPiccoloException e) {
            System.out.println(e);
            System.exit(0);
        }
        boolean[][] pezzo;
        next = generaPezzo();
        stampaCampo();

        boolean finePartita = false;

        while (!finePartita) {

            pezzo = next;
            next = generaPezzo();

            // vettore contenente le coordinate x e y dell'angolo sinistro del pezzo nel campo
            int[] pos = new int[2];
            try {
                // pos_x è dato dal metodo spawnaPezzo
                pos[0] = spawnaPezzo(pezzo);
                // pos_y è 0 in partenza, se il pezzo è stato spawnato lo è stato nella prima fila in alto
                pos[1] = 0;
                clearConsole();
                stampaCampo();
                char mossa;
                do {
                    mossa = menu();
                    try {
                        pezzo = doMossa(mossa, pos, pezzo);
                        clearConsole();
                        stampaCampo();
                    } catch (MossaImpossibileException e) {
                        System.out.println(e);
                    }
                } while (mossa != 'o' && mossa != 'X');
                if (mossa == 'X') {
                    finePartita = true;
                } else {
                    punti += calcolaPunti(pezzo);
                    counterBlocchi++;
                    pulisciCampo();

                }
            } catch (ImpossibileSpawnareException e) {
                System.out.println(e);
                finePartita = true;
            }
        }

    }

    /**
     *
     * @param pezzo
     * @return
     */
    public static int calcolaPunti(boolean[][] pezzo) {
        int punteggioPezzo = 0;
        for (int r = 0; r < pezzo.length; r++) {
            for (int c = 0; c < pezzo[0].length; c++) {
                if (pezzo[r][c] == true) {
                    punteggioPezzo++;
                }
            }
        }
        return punteggioPezzo;
    }

    /**
     *
     * @param pezzo
     * @param sensoOrario
     * @return
     */
    public static boolean[][] ruotaPezzo(boolean[][] pezzo, boolean sensoOrario) {
        // creo un nuovo pezzo con il numero di righe e colonne invertite.
        boolean newPezzo[][] = new boolean[pezzo[0].length][pezzo.length];
        if (sensoOrario) {
            // le colonne del pezzo diventano le righe invertite del newPezzo
            for (int colonnaP = 0; colonnaP < pezzo[0].length; colonnaP++) {
                for (int rigaP = pezzo.length - 1, rigaNP = 0; rigaP >= 0; rigaP--, rigaNP++) {
                    newPezzo[colonnaP][rigaNP] = pezzo[rigaP][colonnaP];
                }
            }
        } else {
            // le righe del pezzo diventano le colonne invertite del newPezzo
            for (int rigaP = 0; rigaP < pezzo.length; rigaP++) {
                for (int colonnaP = pezzo[0].length - 1, colonnaNP = 0; colonnaP >= 0; colonnaP--, colonnaNP++) {
                    newPezzo[colonnaNP][rigaP] = pezzo[rigaP][colonnaP];
                }
            }
        }
        return newPezzo;
    }

    /**
     *
     */
    public static void pulisciCampo() {
        int counterPulite = 0;
        for (int row = campo.length - 1; row >= 0; row--) {
            int counterPiene = 0;
            for (int col = 0; col < campo[row].length; col++) {
                if (campo[row][col] == true) {
                    counterPiene++;
                }
            }

            if (counterPiene == campo[row].length) {
                counterPulite++;
                punti += counterPulite * campo[row].length;
                for (int col = 0; col < campo[row].length; col++) {
                    campo[row][col] = false;
                }
                clearConsole();
                stampaCampo();
                System.out.println();

                // scalo tutti i blocchi in giù di uno step
                for (int r = row; r >= 0; r--) {
                    for (int c = 0; c < campo[row].length; c++) {
                        if (r > 0) {
                            campo[r][c] = campo[r - 1][c];
                        } else {
                            campo[r][c] = false;
                        }
                    }
                }
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(D4mnAsciiTetris.class.getName()).log(Level.SEVERE, null, ex);
                }
                clearConsole();
                stampaCampo();
                System.out.println();

                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(D4mnAsciiTetris.class.getName()).log(Level.SEVERE, null, ex);
                }
                row++;
            }
        }
    }

    /**
     *
     * @param mossa
     * @param pos_xy
     * @param pezzo
     * @return
     * @throws MossaImpossibileException
     */
    public static boolean[][] doMossa(char mossa, int[] pos_xy, boolean[][] pezzo) throws MossaImpossibileException {
        int counterMovibili;
        switch (mossa) {
            case 'a': // muovi sinistra
                // procedo per righe sul pezzo per trovare gli estremi sinistri di ogni riga e vedere se è possibile spostarli a destra.
                // scorro una riga, se una cella è piena vedo se il campo è libero per muoverla e incremento un contatore.
                // Se il contatore raggiunge il numero di righe significa che è possibile muovere tutto il pezzo.
                // altrimenti lancio un eccezione
                counterMovibili = 0;
                for (int row = 0; row < pezzo.length; row++) {
                    boolean first = true;
                    for (int col = 0; col < pezzo[0].length; col++) {
                        if (pezzo[row][col] == true && first) {
                            first = false;
                            if (campo[pos_xy[1] + row][pos_xy[0] + col - 1] == false) {
                                counterMovibili++;
                            }
                        }
                    } // se è finito questo for e first è rimasto true, significa che non c'erano celle piena in questa riga: aumento il counter.
                    if (first) {
                        counterMovibili++;
                    }
                }
                // verifico che tutte le righe siano spostabili e sposto il pezzo, altrimenti lancio eccezione.
                if (counterMovibili == pezzo.length) {
                    for (int row = 0; row < pezzo.length; row++) {
                        for (int col = 0; col < pezzo[0].length; col++) {
                            if (pezzo[row][col] == true) {
                                campo[pos_xy[1] + row][pos_xy[0] + col - 1] = true;
                                campo[pos_xy[1] + row][pos_xy[0] + col] = false;

                            }
                        }
                    }
                    // ho mosso il pezzo: modifico la posizione del pezzo:
                    pos_xy[0]--;
                } else {
                    throw new MossaImpossibileException();
                }
                break;
            case 'w': // muovi su
                // procedo per colonne sul pezzo per trovare gli estremi superiori di ogni colonna e vedere se è possibile spostarli in alto.
                // scorro una colonna, se una cella è piena vedo se il campo è libero per muoverla e incremento un contatore.
                // Se il contatore raggiunge il numero di righe significa che è possibile muovere tutto il pezzo.
                // altrimenti lancio un eccezione
                counterMovibili = 0;
                for (int col = pezzo[0].length - 1; col >= 0; col--) {
                    boolean first = true;
                    for (int row = 0; row < pezzo.length; row++) {

                        if (pezzo[row][col] == true && first) {
                            first = false;
                            if (campo[pos_xy[1] + row - 1][pos_xy[0] + col] == false) {
                                counterMovibili++;
                            }
                        }
                    } // se è finito questo for e first è rimasto true, significa che non c'erano celle piena in questa riga: aumento il counter.
                    if (first) {
                        counterMovibili++;
                    }
                }
                // verifico che tutte le righe siano spostabili e sposto il pezzo, altrimenti lancio eccezione.
                if (counterMovibili == pezzo[0].length) {
                    for (int col = pezzo[0].length - 1; col >= 0; col--) {
                        for (int row = 0; row < pezzo.length; row++) {
                            if (pezzo[row][col] == true) {
                                campo[pos_xy[1] + row - 1][pos_xy[0] + col] = true;
                                campo[pos_xy[1] + row][pos_xy[0] + col] = false;

                            }
                        }
                    }
                    // ho mosso il pezzo: modifico la posizione del pezzo:
                    pos_xy[1]--;
                } else {
                    throw new MossaImpossibileException();
                }
                break;
            case 's': // muovi giu
                // procedo per colonne sul pezzo per trovare gli estremi inferiori di ogni colonna e vedere se è possibile spostarli in basso.
                // scorro una colonna, se una cella è piena vedo se il campo è libero per muoverla e incremento un contatore.
                // Se il contatore raggiunge il numero di righe significa che è possibile muovere tutto il pezzo.
                // altrimenti lancio un eccezione
                counterMovibili = 0;
                for (int col = pezzo[0].length - 1; col >= 0; col--) {
                    boolean first = true;
                    for (int row = pezzo.length - 1; row >= 0; row--) {

                        if (pezzo[row][col] == true && first) {
                            first = false;
                            if (campo[pos_xy[1] + row + 1][pos_xy[0] + col] == false) {
                                counterMovibili++;
                            }
                        }
                    } // se è finito questo for e first è rimasto true, significa che non c'erano celle piena in questa riga: aumento il counter.
                    if (first) {
                        counterMovibili++;
                    }
                }
                // verifico che tutte le righe siano spostabili e sposto il pezzo, altrimenti lancio eccezione.
                if (counterMovibili == pezzo[0].length) {
                    for (int col = pezzo[0].length - 1; col >= 0; col--) {
                        for (int row = pezzo.length - 1; row >= 0; row--) {
                            if (pezzo[row][col] == true) {
                                campo[pos_xy[1] + row + 1][pos_xy[0] + col] = true;
                                campo[pos_xy[1] + row][pos_xy[0] + col] = false;

                            }
                        }
                    }
                    // ho mosso il pezzo: modifico la posizione del pezzo:
                    pos_xy[1]++;
                } else {
                    throw new MossaImpossibileException();
                }
                break;
            case 'd': // muovi destra
                // procedo per righe sul pezzo per trovare gli estremi destri di ogni riga e vedere se è possibile spostarli a destra.
                // scorro una riga, se una cella è piena vedo se il campo è libero per muoverla e incremento un contatore.
                // Se il contatore raggiunge il numero di righe significa che è possibile muovere tutto il pezzo.
                // altrimenti lancio un eccezione
                counterMovibili = 0;
                for (int row = 0; row < pezzo.length; row++) {
                    boolean first = true;
                    for (int col = pezzo[0].length - 1; col >= 0; col--) {
                        if (pezzo[row][col] == true && first) {
                            first = false;
                            if (campo[pos_xy[1] + row][pos_xy[0] + col + 1] == false) {
                                counterMovibili++;
                            }
                        }
                    } // se è finito questo for e first è rimasto true, significa che non c'erano celle piena in questa riga: aumento il counter.
                    if (first) {
                        counterMovibili++;
                    }
                }
                // verifico che tutte le righe siano spostabili e sposto il pezzo, altrimenti lancio eccezione.
                if (counterMovibili == pezzo.length) {
                    for (int row = 0; row < pezzo.length; row++) {
                        for (int col = pezzo[0].length - 1; col >= 0; col--) {
                            if (pezzo[row][col] == true) {
                                campo[pos_xy[1] + row][pos_xy[0] + col + 1] = true;
                                campo[pos_xy[1] + row][pos_xy[0] + col] = false;

                            }
                        }
                    }
                    // ho mosso il pezzo: modifico la posizione del pezzo:
                    pos_xy[0]++;
                } else {
                    throw new MossaImpossibileException();
                }
                break;
            case 'k': // ruota in senso antiorario
                // creo il pezzo girato
                boolean pezzoGiratoA[][] = ruotaPezzo(pezzo, false);
                try {
                    sostituisciPezzo(pos_xy, pezzo, pezzoGiratoA);
                    pezzo = pezzoGiratoA;
                } catch (MossaImpossibileException excA) {
                    throw excA;
                }
                break;
            case 'l': // ruota in senso orario
                boolean pezzoGiratoO[][] = ruotaPezzo(pezzo, true);
                try {
                    sostituisciPezzo(pos_xy, pezzo, pezzoGiratoO);
                    pezzo = pezzoGiratoO;
                } catch (MossaImpossibileException excO) {
                    throw excO;
                }
                break;
            case 'o': // ferma il pezzo
                // non faccio niente, il pezzo viene fermato dove è.
                break;
            case 'X': // esci
                // non faccio niente, il main si occupa di terminare la partita
                break;
        }
        return pezzo;
    }

    public static void sostituisciPezzo(int[] pos_xy, boolean[][] pezzo, boolean[][] pezzoGirato) {
        // pulisco il campo dal vecchio pezzo:
        for (int row = 0; row < pezzo.length; row++) {
            for (int col = 0; col < pezzo[0].length; col++) {
                if (pezzo[row][col] == true) {
                    campo[pos_xy[1] + row][pos_xy[0] + col] = false;
                }
            }
        }
        // vedo se il pezzo girato ci sta nel campo alla stessa posizione di prima (mantenendo fisso l'angolo in alto a sinistra)
        int counterMovibili = 0;
        for (int row = 0; row < pezzoGirato.length; row++) {
            for (int col = 0; col < pezzoGirato[0].length; col++) {
                if (pezzoGirato[row][col] == true) {
                    // se la cella del pezzo girato è piena devo verificare che il campo in quella pos sia vuoto.
                    if (campo[pos_xy[1] + row][pos_xy[0] + col] == false) {
                        counterMovibili++;
                    }
                } else {
                    counterMovibili++; // se la cella del pezzo girato è vuota non ci interessa come sia il campo in quella pos.
                }
            }
        }
        // se il pezzo girato ci sta, lo disegno. Se no lancio un'eccezione di mossa impossibile e ridisegno il pezzo non girato.
        if (counterMovibili == MAX_ROW_PEZZO * MAX_COL_PEZZO) {
            for (int row = 0; row < pezzoGirato.length; row++) {
                for (int col = 0; col < pezzoGirato[0].length; col++) {
                    if (pezzoGirato[row][col] == true) {
                        campo[pos_xy[1] + row][pos_xy[0] + col] = pezzoGirato[row][col];
                    }
                }
            }
        } else {
            for (int row = 0; row < pezzoGirato.length; row++) {
                for (int col = 0; col < pezzoGirato[0].length; col++) {
                    if (pezzo[row][col] == true) {
                        campo[pos_xy[1] + row][pos_xy[0] + col] = pezzo[row][col];
                    }
                }
            }
            throw new MossaImpossibileException();
        }
    }

    /**
     *
     * @return
     */
    public static char menu() {
        System.out.print("Fai la tua mossa: ← (a), ↑ (w), ↓ (s), → (d), ↺ (k), ↻ (l), ferma (o), esci (X). ");
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        char mossa = 'a';
        while (!ok) {
            mossa = sc.next().charAt(0);
            if (mossa != 'a' && mossa != 'w' && mossa != 's' && mossa != 'd' && mossa != 'k' && mossa != 'l' && mossa != 'X' && mossa != 'o') {
                System.out.print("Input errato. Reinserire la mossa: ");
            } else {
                ok = true;
            }
        }
        return mossa;
    }

    /**
     *
     * @param pezzo
     * @return
     * @throws ImpossibileSpawnareException
     */
    public static int spawnaPezzo(boolean[][] pezzo) throws ImpossibileSpawnareException {
        // controllo che esista uno spazio libero di grandezza NxM dove N e M sono le dimensioni del pezzo
        // controllo nelle prime M file da sinistra verso destra.
        for (int pos_x = 0; pos_x <= campo[0].length - MAX_COL_PEZZO; pos_x++) {
            // conto le celle libere in modo da poter sapere se il pezzo è spawnabile a partire da pos_x
            // se è ok, [pos_x][0] diventerà l'angolo in alto a sinistra del posto in cui viene spawnato il pezzo
            int counterLibere = 0;
            for (int x = pos_x; x < pos_x + MAX_COL_PEZZO; x++) {
                for (int y = 0; y < MAX_ROW_PEZZO; y++) {
                    if (campo[y][x] == false) {
                        counterLibere++;
                    }
                }
            }
            // se il conto delle celle libere corrisponde al numero di celle del pezzo allora si spawna qui:            
            if (counterLibere == pezzo[0].length * pezzo.length) {
                for (int x = pos_x; x < pos_x + MAX_COL_PEZZO; x++) {
                    for (int y = 0; y < MAX_ROW_PEZZO; y++) {
                        campo[y][x] = pezzo[y][x - pos_x];
                    }
                }
                return pos_x;
            }
        }
        throw new ImpossibileSpawnareException();
    }

    /**
     * Metodo per generare i pezzi del tetris. Possiamo creare pezzi totalmente
     * in modo casuale, o sceglierli la un "dizionario" di pezzi predefiniti. Io
     * creo pezzi casuali, seguendo questa regola: creo un quadratino in una
     * posizione casuale della matrice pezzo. Poi aggiungo quadratini nelle
     * altre celle in modo casuale ma solo se sono adiacenti a pixel già
     * generati. Così da non creare pezzi "diagonali".
     *
     * @return
     */
    public static boolean[][] generaPezzo() {
        boolean pezzo[][] = new boolean[MAX_ROW_PEZZO][MAX_COL_PEZZO];

        // genero la prima cella in una posizione random
        //int primo = 0;
        int primo = (int) (Math.random() * MAX_ROW_PEZZO * MAX_COL_PEZZO);
        int counter = 0;
        for (int i = 0; i < MAX_ROW_PEZZO; i++) {
            for (int j = 0; j < MAX_COL_PEZZO; j++) {
                if (primo == counter) {
                    pezzo[i][j] = true;
                }
                counter++;
            }
        }

        // scorro tutte le altre celle per vedere se renderle parte del pezzo o no.
        for (int i = 0; i < MAX_ROW_PEZZO; i++) {
            for (int j = 0; j < MAX_COL_PEZZO; j++) {
                if (pixelAdiacente(i, j, pezzo)) {
                    if (Math.random() < PIXEL_PROBABILITY) {
                        pezzo[i][j] = true;
                    }
                }
            }
        }
        //stampaPezzo(pezzo);
        return pezzo;
    }

    /**
     * Metodo per verificare che un pixel all'interno di un pezzo possa
     * diventare effettivamente un pixel. Verifica la cella in posizione
     * [riga][colonna] di pezzo[][] sia adiacente a un pixel già generato.
     *
     * @param riga la posizione riga del pixel che si vuole generare
     * @param colonna la posizione colonna del pixel che si vuole generare
     * @param pezzo il pezzo all'interno del quale si vuole controllare la
     * posizione
     * @return true se un pixel in posizione [riga][colonna] può essere generato
     */
    public static boolean pixelAdiacente(int riga, int colonna, boolean[][] pezzo) {
        // controllo tutte le celle adiacenti alla posizione passata
        switch (riga) {
            case 0:
                if (pezzo[riga + 1][colonna] == true) {
                    return true;
                }
                break;
            case MAX_ROW_PEZZO - 1:
                if (pezzo[riga - 1][colonna] == true) {
                    return true;
                }
                break;
            default:
                if (pezzo[riga + 1][colonna] == true || pezzo[riga - 1][colonna] == true) {
                    return true;
                }
        }
        switch (colonna) {
            case 0:
                if (pezzo[riga][colonna + 1] == true) {
                    return true;
                }
                break;
            case MAX_COL_PEZZO - 1:
                if (pezzo[riga][colonna - 1] == true) {
                    return true;
                }
                break;
            default:
                if (pezzo[riga][colonna + 1] == true || pezzo[riga][colonna - 1] == true) {
                    return true;
                }
        }
        return false;
    }

    /**
     * Metodo per inizializzare il campo di gioco. Richiede all'utente di
     * inserire la grandezza del campo e lo crea vuoto.
     */
    public static void initCampo() throws CampoPiccoloException {
        Scanner init = new Scanner(System.in);
        System.out.print("Inserire grandezza campo.\nNumero di righe: ");
        int R = init.nextInt();
        System.out.print("Numero di colonne: ");
        int C = init.nextInt();
        if (R < MIN_ROW || C < MIN_COL) {
            throw new CampoPiccoloException();
        }

        // Se la grandezza inserita è buona, creo il campo e inizializzo tutte le celle libere
        campo = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                campo[i][j] = false;
            }
        }
    }

    /**
     * Il metodo per stampare il campo di gioco. Non riceve nessun parametro
     * perchè il campo di gioco è globale possiamo accedere in qualunque
     * momento.
     */
    public static void stampaCampo() {

        System.out.print("  ┌─");
        for (int c = 0; c < campo[0].length; c++) {
            System.out.print("──");
        }
        System.out.println("─┐  ");
        System.out.print(" *│┌");
        for (int c = 0; c < campo[0].length; c++) {
            System.out.print("──");
        }
        System.out.print("┐│* ");
        System.out.println("\tPlayer\t\t" + nome);

        System.out.print(" *││");
        for (int c = 0; c < campo[0].length; c++) {
            System.out.print(c == campo[0].length / 2 - 4 ? "D4MN T E T R I S" : "  ");
            if (c == campo[0].length / 2 - 4) {
                c += 7;
            }
        }
        System.out.println("││* "); //◣◢ al posto degli asterischi

        System.out.print(" *│├");
        for (int c = 0; c < campo[0].length; c++) {
            System.out.print("──");
        }
        System.out.print("┤│* ");
        System.out.println("\tScore\t\t" + punti);

        boolean printingNext = false;
        int counterRowNext = 0;
        for (int r = 0; r < campo.length; r++) { //CIAO DAMI
            System.out.print(" *││");
            for (int c = 0; c < campo[r].length; c++) {
                System.out.print(campo[r][c] ? "██" : " .");
            }
            System.out.print("││* ");
            if (r == 3) {
                printingNext = true;
            }
            if (r == 1) {
                System.out.println("\tBlocks\t\t" + counterBlocchi);
            } else if (printingNext) {
                if (counterRowNext == (int) ((float) next[0].length / 2 - 0.1)) {
                    System.out.print("\tNext\t\t");
                } else {
                    System.out.print("\t\t\t");
                }
                stampaRigaPezzo(counterRowNext, next);
                System.out.println();
                counterRowNext++;
                if (counterRowNext >= MAX_ROW_PEZZO) {
                    printingNext = false;
                }
            } else if (r == MAX_ROW_PEZZO + 4) {
                /* qui si può aggiungere qualcosa all'interfaccia. */
                // in tal caso bisognerebbe incrementare il numero minimo di righe.
                System.out.println("\t");
            } else {
                System.out.println();
            }

        }
        System.out.print("──┴┴");
        for (int c = 0; c < campo[1].length; c++) {
            System.out.print("──");
        }
        System.out.print("┴┴──\n////////");
        for (int c = 0; c < campo[1].length; c++) {
            System.out.print("//");
        }
        System.out.println();
    }

    public static void stampaRigaPezzo(int riga, boolean[][] pezzo) {
        for (int c = 0; c < pezzo[0].length; c++) {
            System.out.print(pezzo[riga][c] ? "██" : " .");
        }
    }

    /**
     * Metodo per stampare un pezzo.
     *
     * @param pezzo la matrice di boolean che rappresenta il pezzo.
     */
    public static void stampaPezzo(boolean[][] pezzo) {
        for (int r = 0; r < pezzo.length; r++) {
            for (int c = 0; c < pezzo[0].length; c++) {
                System.out.print(pezzo[r][c] ? "██" : " .");
            }
            System.out.println();
        }
    }

    private static void presentazione() {
        String righePresentazione[] = {"             Welcome to TETRIS            ", "██████  ██████  ██████  ██████  ██  ██████", "  ██    ████      ██    ██  ██  ██  ██    ", "  ██    ██        ██    ████    ██      ██", "  ██    ██████    ██    ██  ██  ██  ██████", "", "                  by D4MN                 "};
        /*
        System.out.println("             Welcome to TETRIS            ");
        System.out.println("██████  ██████  ██████  ██████  ██  ██████");
        System.out.println("  ██    ████      ██    ██  ██  ██  ██    ");
        System.out.println("  ██    ██        ██    ████    ██      ██");
        System.out.println("  ██    ██████    ██    ██  ██  ██  ██████");
        System.out.println();
        System.out.println("                  by D4MN                 ");
         */
        for (String riga : righePresentazione) {
            try {
                System.out.println(riga);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(D4mnAsciiTetris.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

class CampoPiccoloException extends RuntimeException {

    public CampoPiccoloException() {
        super("Il campo è troppo piccolo.");
    }
}

class ImpossibileSpawnareException extends RuntimeException {

    public ImpossibileSpawnareException() {
        super("Impossibile generare nuovi blocchi. La partita termina.");
    }
}

class MossaImpossibileException extends RuntimeException {

    public MossaImpossibileException() {
        super("Impossibile effettuare questa mossa. Il blocco urta altri blocchi.");
    }
}