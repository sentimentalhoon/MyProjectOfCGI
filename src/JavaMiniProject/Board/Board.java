package JavaMiniProject.Board;

public class Board {
    int uid;
    String writer;
    String title;
    String[] content;
    String regdate;
    int hits;

    public Board(){

    }
    
    public Board(int uid, String writer, String title, String[] content, String regdate, int hits) {
        this.uid = uid;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
        this.hits = hits;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
