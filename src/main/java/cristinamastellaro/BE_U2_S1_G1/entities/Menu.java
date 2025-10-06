package cristinamastellaro.BE_U2_S1_G1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Menu {
    private List<Pizza> pizza;
    private List<Topping> toppings;
    private List<Bibita> bibite;

    @Override
    public String toString() {
        String pizze = "";
        for (Pizza pizzaS : pizza) {
            pizze += pizzaS + "\n";
        }

        String toppingss = "";
        for (Topping topping : toppings) {
            toppingss += topping + "\n";
        }

        String bibiteTot = "";
        for (Bibita bibita : bibite) {
            bibiteTot += bibita + "\n";
        }

        return "\n\nMenu\n\nPizza\n" + pizze + "\n\nAggiunte\n" + toppingss + "\n\nBibite\n" + bibiteTot;
//        return "Menu{" +
//                "pizza=" + pizza +
//                ", toppings=" + toppings +
//                ", bibite=" + bibite +
//                '}';
    }
}
