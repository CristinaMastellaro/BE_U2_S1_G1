package cristinamastellaro.BE_U2_S1_G1.entities;

public abstract class ElMenu {
    protected int calorie;
    protected double prezzo;

    public ElMenu(int calorie, double prezzo) {
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "ElMenu{" +
                "calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
