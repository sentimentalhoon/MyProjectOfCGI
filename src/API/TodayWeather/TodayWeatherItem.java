package API.TodayWeather;

public class TodayWeatherItem {
    private String pty;
    private String reh;
    private String rn1;
    private String t1h;
    private String uuu;
    private String vvv;
    private String vec;
    private String wsd;

    public TodayWeatherItem() {
    }

    public TodayWeatherItem(String pty, String reh, String rn1, String t1h, String uuu, String vvv, String vec,
            String wsd) {
        this.pty = pty;
        this.reh = reh;
        this.rn1 = rn1;
        this.t1h = t1h;
        this.uuu = uuu;
        this.vvv = vvv;
        this.vec = vec;
        this.wsd = wsd;
    }

    /** 현재의 강수형태를 구해온다. */
    public String getPty() {
        return pty;
    }

    /** 강수형태를 설정한다. */
    public void setPty(String pty) {
        this.pty = pty;
    }

    /** 현재의 습도를 구해온다. */
    public String getReh() {
        return reh;
    }

    /** 습도를 설정한다. */
    public void setReh(String reh) {
        this.reh = reh;
    }

    /** 1시간 강수량을 구해온다. */
    public String getRn1() {
        return rn1;
    }

    /** 1시간 강수량을 설정한다. */
    public void setRn1(String rn1) {
        this.rn1 = rn1;
    }

    /** 기온을 구해온다. */
    public String getT1h() {
        return t1h;
    }

    /** 기온을 설정한다. */
    public void setT1h(String t1h) {
        this.t1h = t1h;
    }

    /** 동서바람 성분을 구해온다. */
    public String getUuu() {
        return uuu;
    }

    /** 동어바람 성분을 설정한다. */
    public void setUuu(String uuu) {
        this.uuu = uuu;
    }

    /** 남북바람 성분을 구해온다. */
    public String getVvv() {
        return vvv;
    }

    /** 남북바람 성분을 설정한다. */
    public void setVvv(String vvv) {
        this.vvv = vvv;
    }

    /** 풍향을 구해온다. */
    public String getVec() {
        return vec;
    }

    /** 풍향을 설정한다. */
    public void setVec(String vec) {
        this.vec = vec;
    }

    /** 풍속을 구해온다. */
    public String getWsd() {
        return wsd;
    }

    /** 풍속을 설정한다. */
    public void setWsd(String wsd) {
        this.wsd = wsd;
    }
}
