package cristinamastellaro.BE_U2_S1_G1.entities;

public class Topping extends ElMenu {
    private String topping;

    public Topping(int calorie, double prezzo, String topping) {
        super(calorie, prezzo);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return topping + "\nCalorie: " + calorie + ", prezzo: " + prezzo + "€";
//        return "Toppings{" +
//                "topping='" + topping + '\'' +
//                ", calorie=" + calorie +
//                ", prezzo=" + prezzo +
//                '}';
    }
}
