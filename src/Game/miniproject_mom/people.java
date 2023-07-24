package Game.miniproject_mom;

public class people {
	
	private String name;
	
	private int hp;
	
	private String attack;
	
	private String critical;

	
	public people() {
	}
	
	public people(String name, int hp, String attack, String critical) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.critical = critical;
	}
	public people(String name, int hp, String attack) {
		super();
		this.name = name;
		this.hp = hp;
		this.critical = critical;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getCritical() {
		return critical;
	}

	public void setCritical(String critical) {
		this.critical = critical;
	}
	
	public String thunderLightening() {
		
		String thunderLightening = 
		   "			             zeeeeee-\r\n"
		  + "			            z$$$$$$\"\r\n"
		  + "			           d$$$$$$\"\r\n"
		  + "			          d$$$$$P\r\n"
		  + "			         d$$$$$P\r\n"
		  + "			        $$$$$$\"\r\n"
		  + "			      .$$$$$$\"\r\n"
		  + "			     .$$$$$$\"\r\n"
		  + "			    4$$$$$$$$$$$$$\"\r\n"
		  + "			   z$$$$$$$$$$$$$\"\r\n"
		  + "			   \"\"\"\"\"\"\"3$$$$$\"\r\n"
		  + "			         z$$$$P\r\n"
		  + "			        d$$$$\"\r\n"
		  + "			      .$$$$$\"\r\n"
		  + "			     z$$$$$\"\r\n"
		  + "			    z$$$$P\r\n"
		  + "			   d$$$$$$$$$$\"\r\n"
		  + "			  *******$$$\"\r\n"
		  + "			       .$$$\"\r\n"
		  + "			      .$$\"\r\n"
		  + "			     4$P\"\r\n"
		  + "			    z$\"\r\n"
		  + "			   zP\r\n"
		  + "			  z\"\r\n"
		  + "			 /   '\r\n"
		  + "			\r\n"
		  + "			[드라카이나]가 [썬더라이트닝 -500 ]를 시전했다! \r\n"
		  + "			Critical!!!\r\n";
		
		return thunderLightening;
	}
	public String fireRage() {
		
		String fireRage = 
		  "                                                 /===-_---~~~~~~~~~------____\r\n"
		+ "                                                |===-~___                _,-'\r\n"
		+ "                 -==\\\\                         `//~\\\\   ~~~~`---.___.-~~\r\n"
		+ "             ______-==|                         | |  \\\\           _-~`\r\n"
		+ "       __--~~~  ,-/-==\\\\                        | |   `\\        ,'\r\n"
		+ "    _-~       /'    |  \\\\                      / /      \\      /\r\n"
		+ "  .'        /       |   \\\\                   /' /        \\   /'\r\n"
		+ " /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /          \\/'\r\n"
		+ "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`\r\n"
		+ "                  \\_|      /        _)   ;  ),   __--~~\r\n"
		+ "                    '~~--_/      _-~/-  / \\   '-~ \\\r\n"
		+ "                   {\\__--_/}    / \\\\_>- )<__\\      \\\r\n"
		+ "                   /'   (_/  _-~  | |__>--<__|      |\r\n"
		+ "                  |0  0 _/) )-~     | |__>--<__|      |\r\n"
		+ "                  / /~ ,_/       / /__>---<__/      |\r\n"
		+ "                 o o _//        /-~_>---<__-~      /\r\n"
		+ "                 (^(~          /~_>---<__-      _-~\r\n"
		+ "                ,/|           /__>--<__/     _-~\r\n"
		+ "             ,//('(          |__>--<__|     /                  .----_\r\n"
		+ "            ( ( '))          |__>--<__|    |                 /' _---_~\\\r\n"
		+ "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\\r\n"
		+ "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||\r\n"
		+ "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'\r\n"
		+ "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/\r\n"
		+ "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~\r\n"
		+ "   ;'( ')/ ,)(                              ~~~~~~~~~~\r\n"
		+ "  ' ') '( (/\r\n"
		+ "    '   '  `n\r\n"
		+ "            \r\n"
		+ ""
		+ "			 [드라카이나]가 [분노의화염-300] 를 시전했다! \r\n";
		
		return fireRage ;
	}
	public String druidAttack() {
		String druid = 
		  "			⠀⠀⠀⣰⣟⠲⠤⣤⣤⣤⠶⢖⣲⣶⡶⢶⣶⣖⡲⠶⣤⣤⣤⡤⠖⡛⣆⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⡏⣿⣷⣄⠀⡟⢡⡶⠛⠉⠁⠀⠀⠈⠉⠛⢶⡌⠻⠀⣠⣾⣿⢹⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⡇⢹⣿⣿⠆⣠⠞⢁⣀⣠⣤⡴⢦⣤⣄⣀⡈⠳⣄⢰⣿⣿⣟⢸⡄⠀⠀\r\n"
		+ "			⠀⠀⠀⢻⣤⡻⠁⡸⢃⠜⠋⠉⠉⣠⠀⠐⣄⠉⠉⠙⠢⡘⢧⡙⣿⣣⡿⠀⠀⠀\r\n"
		+ "			⠀⠀⢀⣾⡷⠁⠊⠀⠀⠤⠖⠋⠉⠑⡀⢀⠊⠉⠙⠲⠤⠀⠀⠑⠀⢾⣷⡄⠀⠀\r\n"
		+ "			⠀⠀⣴⡿⠃⠀⡀⣀⡴⠁⣤⠶⠚⠋⠀⠀⠙⠓⠶⣤⠈⢦⣀⢀⠀⠘⢿⣦⠀⠀\r\n"
		+ "			⢀⣾⠏⠀⣰⡟⢰⢏⣀⡐⠁⠀⠀⠀⠀⠀⠀⠀⡀⠈⢂⣀⡙⡆⢻⣆⠀⠹⣷⡀\r\n"
		+ "			⣼⡏⠀⠀⣿⣧⠸⠀⠻⣏⠟⣾⣄⠀⠀⠀⠀⣠⣷⠻⣹⠟⠀⠇⣼⣷⡀⠀⢹⣷\r\n"
		+ "			⣿⣰⠀⠀⣿⣿⡇⠀⠀⠉⠉⢹⣿⠀⠀⠀⠀⣿⡏⠉⠉⠀⠀⢸⣿⣿⠁⠀⣆⣿\r\n"
		+ "			⢻⢿⣠⠀⠀⣿⣯⠁⠀⠀⢀⡞⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠊⣽⣿⠁⠀⡀⡿⡟\r\n"
		+ "			⠈⢸⣿⡆⡀⠈⢿⣇⡀⠀⡼⢰⠀⠀⠀⠀⠀⠀⡏⢧⠀⢀⣸⡿⠃⢀⢰⣿⡗⠀\r\n"
		+ "			⠀⠈⢿⢿⣿⣦⡈⠻⢿⣄⡁⡾⠀⠀⠀⠀⠀⠀⢷⢈⣠⡿⠟⢁⣴⣿⡿⡻⠁⠀\r\n"
		+ "			⠀⠀⠀⠈⠻⠟⢿⣶⣤⣿⢇⢳⡀⠀⠀⠀⠀⢀⡞⡸⣿⣤⣶⡿⠻⠟⠁⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⣘⣿⣒⣂⠙⠛⢷⡾⠛⠋⢐⣒⣿⣓⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⠀⠚⣧⣖⣀⣀⣬⣧⣀⣀⣲⣽⠃⠒⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠳⢤⣄⣠⡤⠾⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "										\r\n"
		+ "			[영웅이]가 [야생의영혼-500] 을 시전했다!\r\n"
		+ "			 Critical!!!\r\n"
		+ "          공격력 2배!!! \r\n ";
		return druid;
	}
	public String warlockAttack() {
		String warlock =
		  "⠀⠀⠀⠉⠀⠀⠀⢧⣄⠀⠒⠫⢖⠆⠄⠀⠐⡈⢑⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "⠀⢂⠀⡂⠀⠀⠀⠀⠉⣄⡀⠀⠀⠨⠈⢂⠀⠘⢜⠆⢱⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "⠀⢀⢃⣟⣭⣭⣲⠄⠀⠾⢿⠷⠖⠤⣈⠀⠀⢀⠤⢃⠏⠄⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "⢀⡞⠘⠺⢙⠓⠉⠈⠀⠀⠆⠀⠀⠀⠈⣦⡔⠁⡔⠁⠀⠰⣯⢂⠀⠀⠀⠀⠀⠀\r\n"
		+ "⢸⣆⠀⠐⡎⠀⠀⠸⠔⠒⠀⠀⠀⠀⠘⡐⠀⣸⠐⢈⠠⢏⡌⠺⡀⠀⠀⠀⠀⠀\r\n"
		+ "⠈⠌⠓⠀⠺⣖⠀⠰⣶⣟⣿⠆⠀⠀⢰⠃⠠⠁⡰⠁⡠⢊⠇⠀⠈⠢⡀⠀⠀⠀\r\n"
		+ "⠀⠈⠳⡄⠿⠊⠢⡀⠉⠉⠁⠀⢀⣴⣿⡟⢀⠈⢀⠜⢀⠏⠀⠀⠀⠀⠈⢿⣿⣷\r\n"
		+ "⢠⠎⣉⠿⠀⣄⢀⠏⠂⣤⡤⠶⠿⠿⠛⢡⠀⠡⣄⠀⣼⠀⠀⠀⠀⠀⠀⠀⠻⣿\r\n"
		+ "⢸⡇⢶⠀⡈⠕⠃⣤⡀⢹⣧⠀⠀⠀⠀⠀⠀⠄⠈⠁⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "⠀⠙⢮⣗⡢⠄⣠⣜⡷⠟⠁⠂⠀⠀⠀⠀⡇⠘⠄⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "⠀⠀⠈⠽⠦⠖⠋⠁⠀⠄⠀⠀⠀⠀⠀⠖⠁⠀⠀⠤⠌⠀⠹⠄⠀⠀⠀\r\n"
		+ "\r\n"
		+ "			[미녀]가 [거부할수없는유혹-500] 을 시전했다!\r\n"
		+ "			 Critical!!!\r\n"
		+ "			공격력 2배!!! \r\n";
		return warlock;
	}
	public String paladinAttack() {
		String paladin = 
		  "			 _________________________ \r\n"
		+ "			|<><><>     |  |    <><><>|\r\n"
		+ "			|<>         |  |        <>|\r\n"
		+ "			|           |  |          |\r\n"
		+ "			|  (______ <\\-/> ______)  |\r\n"
		+ "			|  /_.-=-.\\| \" |/.-=-._\\  | \r\n"
		+ "			|   /_    \\(o_o)/    _\\   |\r\n"
		+ "			|    /_  /\\/ ^ \\/\\  _\\    |\r\n"
		+ "			|      \\/ | / \\ | \\/      |\r\n"
		+ "			|_______ /((( )))\\ _______|\r\n"
		+ "			|      __\\ \\___/ /__      |\r\n"
		+ "			|--- (((---'   '---))) ---|\r\n"
		+ "			|           |  |          |\r\n"
		+ "			|           |  |          |\r\n"
		+ "			:           |  |          :     \r\n"
		+ "			 \\<>        |  |       <>/      \r\n"
		+ "			  \\<>       |  |      <>/       \r\n"
		+ "			   \\<>      |  |     <>/       \r\n"
		+ "			    `\\<>    |  |   <>/'         \r\n"
		+ "			      `\\<>  |  |  <>/'         \r\n"
		+ "			        `\\<>|  |<>/'         \r\n"
		+ "			          `-.  .-`           \r\n"
		+ " 		            '--'\r\n"
		+ "			\r\n"
		+ "			[영웅이]가 [빛의 심판-500] 을 시전했다!\r\n"
		+ "			 Critical!!!\r\n"
		+ "          공격력 2배!!!\r\n ";
		return paladin;
	}
	public String HumanAttack() {
		String human =
	      "			⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣶⠶⠶⣶⣤⣤⡀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⢀⣴⠾⠛⠉⠀⢠⣾⣴⡾⠛⠻⣷⣄⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⢶⣶⣶⣿⣁⠀⠀⠀⠀⢸⣿⠏⢀⣤⣶⣌⠻⣦⡀⠀⠀⠀\r\n"
		+ "			⠀⠀⣴⡟⠁⢉⣙⣿⣦⡀⠀⢸⡏⣴⠟⢡⣶⣿⣧⡹⣷⡀⠀⠀\r\n"
		+ "			⠀⣼⠏⢀⣾⠟⠛⠛⠻⣿⡆⠀⠀⢿⣄⠀⠙⠉⠹⣷⡸⣷⠀⠀\r\n"
		+ "			⢠⣿⠀⢸⡿⢿⠇⠀⠀⣾⠇⠀⣀⣈⠻⢷⣤⣤⣤⡾⠃⢹⣇⠀\r\n"
		+ "			⢸⣿⠀⢸⣧⣀⣀⣠⣾⢋⣴⢿⣿⡛⠻⣶⣤⣉⠁⠀⠀⠀⣿⠀\r\n"
		+ "			⠈⣿⠀⠀⠙⠛⠛⠋⠁⣼⣯⣀⣿⠿⠶⠟⠉⠛⢷⣄⠀⠀⣿⡇\r\n"
		+ "			⠀⣿⠀⠀⠀⠀⠀⠀⠀⣿⡏⠉⠁⠀⠀⢀⣴⢶⣄⢻⡇⠀⢸⡇\r\n"
		+ "			⠀⢻⣇⠀⠀⠀⠀⠀⢠⡿⢀⣀⢠⣾⠷⣾⣧⡶⠿⠟⠁⠀⣾⡇\r\n"
		+ "			⠀⠈⣿⣧⡀⠀⠀⣠⣿⣷⠟⢻⣿⣷⡾⠛⠉⠀⠀⠀⠀⢀⣿⠀\r\n"
		+ "			⠀⠀⢹⣿⢻⣦⡀⠉⠛⠛⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀\r\n"
		+ "			⠀⠀⠀⠛⠀⠈⠻⠷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠟⠀⠀\r\n"
		+ "			⢰⣖⣻⢫⣭⣭⣭⠭⠭⠭⠭⠭⢭⢹⣛⣒⡢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⣾⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⢸⠸⠛⠛⠿⣷⣭⣭⣽⣿⠷⣶⣶⣶⣤⣤⣤⢄\r\n"
		+ "			⣿⣏⡀⡾⣿⣿⣿⣿⣿⣿⣿⣿⣸⡄⠀⠀⠀⣸⣿⣿⣿⣷⣿⠎⣿⣿⣿⣿⣿⣿\r\n"
		+ "			⣿⣿⣶⢡⢺⣿⣿⣿⣿⣿⣿⣿⣿⢸⣐⣒⣾⢞⣻⣿⣿⣷⠷⠿⠿⠏⠉⠛⠛⠛\r\n"
		+ "⠸		⢯⣿⣜⣒⣒⣒⣚⣛⣛⣛⣛⣛⣸⣛⣯⠵⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			 Critical!!!\r\n"
		+ "          공격력 2배!!! \r\n"
		+ "			[영웅이]가 [용감무쌍-50] 을 시전했다!\r\n";
		return human;
	}
	public String umbAttack() {
		String umbrella = 
		  "			              _________\r\n"
		+ "			           ,=',        ``````````--------,,,,,,,,,____\r\n"
		+ "			,;;;;;;;;;;|= ;                                   ____)\r\n"
		+ "			;;         '=._______,,,,,,,,--------'''''''''''''\r\n"
		+ "			`'''\r\n"
		+ "			\r\n"
		+ "			[영웅이]가 [우산공격-100] 을 시전했다! \r\n";
		return umbrella;
	}
	public String gaunAttack() {
		String gauntlet = 
		  "                        _    ,-,    _\r\n"
		+ "                 ,--, /: :\\/': :`\\/: :\\\r\n"
		+ "                |`;  ' `,'   `.;    `: |\r\n"
		+ "                |    |     |  '  |     |.\r\n"
		+ "                | :  |     |     |     ||\r\n"
		+ "                | :. |  :  |  :  |  :  | \\\r\n"
		+ "                 \\__/: :.. : :.. | :.. |  )\r\n"
	    + "                      `---',\\___/,\\___/ /'\r\n"
	    + "                           `==._ .. . /'\r\n"
	    + "                                `-::-'\r\n"
		+ "			\r\n"
		+ "			[영웅이]가 [건틀릿주먹-200] 을 시전했다!\r\n ";
		return gauntlet;
	}
	public String lightAttack() {
		String lightsaver = 
		  "			⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀ ⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠠⠀⠀⠀⡇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠈⠳⣴⣿⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠒⠒⠒⠒⠒⢺⢿⣿⢗⠒⠒⠒⠒⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⠀⠁⣸⣿⣦⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⠀⢀⣾⡟⠋⢹⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⢀⣿⡟⣴⣶⡄⣿⣧⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⢰⣿⣿⣧⢻⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠈⢻⣿⣿⣷⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⢸⠿⣿⣿⣿⣿⣿⣿⣦⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⣾⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⣿⣏⣻⣿⣿⣿⣿⣿⠋⣿⣿⣿⣿⣿⠙⣿⣷⣶⣤⣤⡄\r\n"
		+ "			⠀⠀⠀⠀⢻⢇⣿⣿⣿⣿⣿⠹⠀⢹⣿⣿⣿⡇⠀⢟⣿⣿⡿⠋⠀\r\n"
		+ "			⠀⠀⠀⠀⢘⣼⣿⣿⣿⣿⣿⡆⠀⢸⣿⠛⣿⡇⠀⢸⡿⠋⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣦⣈⠻⠴⠟⣁⣴⣿⣿⠗⠀⠀⠀\r\n"
		+ "			⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⢀⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⠀⣾⣿⡏⠀⠹⣿⠿⠿⠿⠿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⢰⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠀⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⣰⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		+ "			⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀\r\n"
		+ "						\r\n"
		+ "			[영웅이]가 [광선검어택-300] 을 시전했다! \r\n";
		return lightsaver;
	}
	public String swordAttack() {
		String skull = 
		  "			                              .___.\r\n"
		+ "			          /)               ,-^     ^-.\r\n"
		+ "			         //               /           \\\r\n"
		+ "			.-------| |--------------/  __     __  \\-------------------.__\r\n"
		+ "			|WMWMWMW| |>>>>>>>>>>>>> | />>\\   />>\\ |>>>>>>>>>>>>>>>>>>>>>>:>\r\n"
		+ "			`-------| |--------------| \\__/   \\__/ |-------------------'^^\r\n"
		+ "			         \\\\               \\    /|\\    /\r\n"
		+ "			          \\)               \\   \\_/   /\r\n"
		+ "			                            |       |\r\n"
		+ "			                            |+H+H+H+|\r\n"
		+ "			                            \\       /\r\n"
		+ "			                             ^-----^\r\n"
		+ "						\r\n"
		+ "			[영웅이]가 [해골검어택-250] 을 시전했다!\r\n ";
		return skull ;
	}
	
	
	
}
