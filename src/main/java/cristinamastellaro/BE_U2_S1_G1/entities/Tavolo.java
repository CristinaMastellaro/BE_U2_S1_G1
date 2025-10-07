package cristinamastellaro.BE_U2_S1_G1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    private int numTavolo;
    private int numPersoneMax;
    private boolean occupato;

    public Tavolo(int numTavolo, int numPersoneMax, boolean occupato) {
        this.numTavolo = numTavolo;
        this.numPersoneMax = numPersoneMax;
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numTavolo=" + numTavolo +
                ", numPersoneMax=" + numPersoneMax +
                ", occupato=" + occupato +
                '}';
    }
}
