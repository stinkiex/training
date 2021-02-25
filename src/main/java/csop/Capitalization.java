package csop;

public class Capitalization {
    double p; //Сумма вклада;
    double year;
    double r; //Проценты годовые;
    double pe; // Итог;

    public Capitalization(double p, double years, double r) {
        this.p = p;
        this.year = years;
        this.r = r;
        this.pe = Math.pow(p, ((r + 1) * year));
    }

    public static void main(String[] args) {
        Capitalization capitalization = new Capitalization(1600, 3, 3.2);
        System.out.println(capitalization.toString());
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getYears() {
        return year;
    }

    public void setYears(double years) {
        this.year = years;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPe() {
        return pe;
    }

    public void setPe(double pe) {
        this.pe = pe;
    }

    @Override
    public String toString() {
        return "Капитализация{" +
                "вклад=" + p +
                ", кол-во лет=" + year +
                ", процент=" + r +
                ", получится=" + pe +
                '}';
    }
}
