package cristinamastellaro.BE_U2_S1_G1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Pizza extends ElMenu {
    private String nomePizza;
    private String mozzarella;
    private String pomodoro;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(int calorie, double prezzo, String nomePizza) {
        super(calorie, prezzo);
        this.nomePizza = nomePizza;
        this.mozzarella = "mozzarella";
        this.pomodoro = "pomodoro";
    }

    public Pizza(int calorie, double prezzo, String nomePizza, List<Topping> toppings) {
        this(calorie, prezzo, nomePizza);
        this.toppings.addAll(toppings);
    }

    @Override
    public String toString() {
        String toppingsList = "";
        if (!toppings.isEmpty()) {
            for (Topping topping : toppings) {
                toppingsList += ", " + topping.getTopping().toLowerCase();
            }
        }
        toppingsList += ")";
        return nomePizza + " (" + mozzarella + ", " + pomodoro + toppingsList + "\nCalorie: " + calorie + ", prezzo: " + prezzo + "€";
    }

//    "Pizza{" +
//                "nomePizza='" + nomePizza + '\'' +
//                ", mozzarella='" + mozzarella + '\'' +
//                ", pomodoro='" + pomodoro + '\'' +
//                ", toppings=" + toppings +
//                ", calorie=" + calorie +
//                ", prezzo=" + prezzo +
//                '}';
}
