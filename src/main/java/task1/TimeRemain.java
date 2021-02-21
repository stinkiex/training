package task1;

public class TimeRemain {
    private int hh;
    private int mm;
    private int ss;

    public TimeRemain(int ss) {
        this.hh = ss / 3600;
        this.mm = (ss - hh * 3600) / 60;
        this.ss = ss - hh * 3600 - mm * 60;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }


    @Override
    public String toString() {
        return "TimeRemain{" + hh + "ч " + mm + "мин " + ss + "сек}";
    }
}
