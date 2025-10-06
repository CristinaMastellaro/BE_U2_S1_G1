package cristinamastellaro.BE_U2_S1_G1.entities;

import java.util.ArrayList;
import java.util.List;

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

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public String getMozzarella() {
        return mozzarella;
    }

    public void setMozzarella(String mozzarella) {
        this.mozzarella = mozzarella;
    }

    public String getPomodoro() {
        return pomodoro;
    }

    public void setPomodoro(String pomodoro) {
        this.pomodoro = pomodoro;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
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
