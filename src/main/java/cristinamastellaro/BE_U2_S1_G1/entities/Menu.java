package cristinamastellaro.BE_U2_S1_G1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Component
public class Menu {
    @Autowired
    private List<Pizza> pizza;
    @Autowired
    private List<Topping> toppings;
    @Autowired
    private List<Bibita> bibite;
    @Autowired
    private boolean diversiFormati;

    public Menu(List<Pizza> pizza, List<Topping> toppings, List<Bibita> bibite) {
        this.pizza = pizza;
        this.toppings = toppings;
        this.bibite = bibite;
    }

    @Override
    public String toString() {
        String pizze = "";
        for (Pizza pizzaS : pizza) {
            pizze += pizzaS + "\n";
        }

        String formati = "";
        if (diversiFormati) {
            formati += "\nFormati pizza\n";
            formati += "\nBattuta: 3€";
            formati += "\nFamiglia: 5€\n";
        }

        String toppingss = "";
        for (Topping topping : toppings) {
            toppingss += topping + "\n";
        }

        String bibiteTot = "";
        for (Bibita bibita : bibite) {
            bibiteTot += bibita + "\n";
        }

        return "\n\nMenu\n\nPizza\n\n" + pizze + formati + "\n\nAggiunte\n\n" + toppingss + "\n\nBibite\n\n" + bibiteTot;
//        return "Menu{" +
//                "pizza=" + pizza +
//                ", toppings=" + toppings +
//                ", bibite=" + bibite +
//                '}';
    }
}
