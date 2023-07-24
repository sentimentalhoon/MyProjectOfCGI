package Board;

public class Board {
    int uid;
    String writer;
    String title;
    String[] content;
    String regdate;
    int hits;

    public Board() {

    }

    public Board(int uid, String writer, String title, String[] content, String regdate, int hits) {
        this.uid = uid;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
        this.hits = hits;
    }

    /**
     * board 의 uid 값을 리턴한다.
     * 
     * @return
     */
    public int getUid() {
        return uid;
    }

    /**
     * board uid 를 설정한다.
     * 
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * board 의 작성자를 리턴한다.
     * 
     * @return
     */
    public String getWriter() {
        return writer;
    }

    /**
     * board 의 작성자를 설정한다.
     * 
     * @param writer
     */
    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * board 의 제목을 리턴한다.
     * 
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * board 제목을 설정한다.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * board 내용을 구해온다.
     * 
     * @return
     */
    public String[] getContent() {
        return content;
    }

    /**
     * board 내용을 설정한다. 한줄마다 배열로 저장한다.
     * 
     * @param content
     */
    public void setContent(String[] content) {
        this.content = content;
    }

    /**
     * board 의 작성일을 구해온다.
     * 
     * @return
     */
    public String getRegdate() {
        return regdate;
    }

    /**
     * board 의 작성일을 설정한다.
     * 
     * @param regdate
     */
    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    /**
     * board 의 읽은 수를 구해온다.
     * 
     * @return
     */
    public int getHits() {
        return hits;
    }

    /**
     * board 의 읽은 수를 설정한다.
     * 
     * @param hits
     */
    public void setHits(int hits) {
        this.hits = hits;
    }
}
