package cristinamastellaro.BE_U2_S1_G1.entities;

public class Bibita extends ElMenu {
    private String nomeBibita;
    private double quantitaInL;
    private int percentualeAlcolica;

    public Bibita(int calorie, double prezzo, String nomeBibita, double quantitaInL) {
        super(calorie, prezzo);
        this.nomeBibita = nomeBibita;
        this.quantitaInL = quantitaInL;
    }

    public Bibita(int calorie, double prezzo, String nomeBibita, double quantitaInL, int percentualeAlcolica) {
        this(calorie, prezzo, nomeBibita, quantitaInL);
        this.percentualeAlcolica = percentualeAlcolica;
    }

    public String getNomeBibita() {
        return nomeBibita;
    }

    public void setNomeBibita(String nomeBibita) {
        this.nomeBibita = nomeBibita;
    }

    public double getQuantitaInL() {
        return quantitaInL;
    }

    public void setQuantitaInL(double quantitaInL) {
        this.quantitaInL = quantitaInL;
    }

    public int getPercentualeAlcolica() {
        return percentualeAlcolica;
    }

    public void setPercentualeAlcolica(int percentualeAlcolica) {
        this.percentualeAlcolica = percentualeAlcolica;
    }

    @Override
    public String toString() {
        String alcol = "";
        if (percentualeAlcolica != 0) alcol += ", " + percentualeAlcolica + "%";
        return nomeBibita + "(" + quantitaInL + "l" + alcol + ")" + "\nCalorie: " + calorie + ", prezzo: " + prezzo + "€";
//        return "Bibita{" +
//                "nomeBibita='" + nomeBibita + '\'' +
//                ", quantitaInL=" + quantitaInL +
//                ", percentualeAlcolica=" + percentualeAlcolica +
//                ", calorie=" + calorie +
//                ", prezzo=" + prezzo +
//                '}';
    }
}
