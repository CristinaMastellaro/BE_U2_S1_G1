package cristinamastellaro.BE_U2_S1_G1.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private int numOrdine;
    private List<Pizza> pizze;
    private List<Bibita> bibite;
    private Stato stato;
    private int numCoperti;
    private LocalTime oraOrdine;
    private int numTavolo;
    @Autowired
    private int costoCoperto;

    public Ordine(int numOrdine, List<Pizza> pizze, List<Bibita> bibite, Stato stato, int numCoperti, LocalTime oraOrdine, int numTavolo) {
        this.numOrdine = numOrdine;
        this.pizze = pizze;
        this.bibite = bibite;
        this.stato = stato;
        this.numCoperti = numCoperti;
        this.oraOrdine = oraOrdine;
        this.numTavolo = numTavolo;
    }

    public double importoTotale() {
        double tot = 0;
        for (Pizza p : pizze) {
            List<Topping> toppings = p.getToppings();
            // La pizza costa come una margherita con le varie aggiunte;
            tot += 4.99;
            if (!toppings.isEmpty()) {
                for (Topping t : toppings) {
                    tot += t.getPrezzo();
                }
            }
        }
        for (Bibita b : bibite) {
            tot += b.getPrezzo();
        }
        tot += costoCoperto * numCoperti;
        return tot;
    }

    public void stampaOrdine() {
        System.out.println("\nNumero ordine: " + numOrdine);
        System.out.println("Numero tavolo: " + numTavolo);
        System.out.println("Numero coperti: " + numCoperti);
        System.out.println("Ora di ordinazione: " + oraOrdine);
        System.out.println("\nPizze");
        pizze.forEach(p -> {
            System.out.println(p.getNomePizza());
            double totPizza = 0;
            for (Topping t : p.getToppings()) {
                totPizza += t.getPrezzo();
                System.out.println(t.getTopping() + ": " + t.getPrezzo() + "€");
            }
            System.out.println((4.99 + totPizza) + "€\n");
        });
        bibite.forEach(b -> {
            System.out.println(b.getNomeBibita());
            System.out.println(b.getPrezzo() + "€");
        });
        System.out.println("\nTotale: " + importoTotale() + "€");
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numOrdine=" + numOrdine +
                ", pizze=" + pizze +
                ", bibite=" + bibite +
                ", stato=" + stato +
                ", numCoperti=" + numCoperti +
                ", oraOrdine=" + oraOrdine +
                ", numTavolo=" + numTavolo +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
