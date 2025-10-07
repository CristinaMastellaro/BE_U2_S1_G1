package cristinamastellaro.BE_U2_S1_G1.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigClass {

    @Bean
    public int costoCoperti(@Value("${costo.coperto}") int costo) {
        return costo;
    }

    @Bean
    public boolean diversiFormati() {
        return true;
    }

    @Bean
    public Topping formaggio() {
        return new Topping(92, 0.69, "Formaggio");
    }

    @Bean
    public Topping pomodoro() {
        return new Topping(28, 0.99, "Pomodoro");
    }

    @Bean
    public Topping prosciutto() {
        return new Topping(35, 0.99, "Prosciutto");
    }

    @Bean
    public Topping cipolle() {
        return new Topping(22, 0.69, "Cipolle");
    }

    @Bean
    public Topping ananas() {
        return new Topping(24, 0.79, "Ananas");
    }

    @Bean
    public Topping salamino() {
        return new Topping(86, 0.99, "Salamino");
    }

    @Bean(name = "Margherita")
    public Pizza margherita() {
        return new Pizza(1104, 4.99, "Margherita");
    }

    @Bean(name = "Hawaiiana")
    public Pizza hawaiiana() {
        List<Topping> lista = new ArrayList<>();
        lista.add(prosciutto());
        lista.add(ananas());
        return new Pizza(1024, 6.49, "Hawaiiana", lista);
    }

    @Bean(name = "Diavola")
    public Pizza diavola() {
        List<Topping> lista = new ArrayList<>();
        lista.add(salamino());
        return new Pizza(1160, 5.99, "Diavola", lista);
    }

    @Bean(name = "Limonata")
    public Bibita limonata() {
        return new Bibita(128, 1.29, "Limonata", 0.33);
    }

    @Bean(name = "Acqua")
    public Bibita acqua() {
        return new Bibita(0, 1.29, "Acqua", 0.5);
    }

    @Bean(name = "Vino")
    public Bibita vino() {
        return new Bibita(607, 7.49, "Vino", 0.75, 13);
    }

    @Bean
    @Primary
    public List<Pizza> listaPizze() {
        List<Pizza> listaPizze = new ArrayList<>();
        listaPizze.add(margherita());
        listaPizze.add(hawaiiana());
        listaPizze.add(diavola());
        return listaPizze;
    }

    @Bean
    public List<Pizza> listaPizze2() {
        List<Pizza> listaPizze = new ArrayList<>();
        Pizza margheritaAggiunte = margherita();
        List<Topping> toppings = margheritaAggiunte.getToppings();
        toppings.addAll(List.of(salamino(), prosciutto()));
        margheritaAggiunte.setToppings(toppings);
        listaPizze.add(margheritaAggiunte);
        listaPizze.add(hawaiiana());
        listaPizze.add(margherita());
        listaPizze.add(margherita());
        return listaPizze;
    }

    @Bean
    @Primary
    public List<Topping> listaToppings() {
        return List.of(formaggio(), prosciutto(), cipolle(), ananas(), salamino());
    }

    @Bean
    @Primary
    public List<Bibita> listaBibite() {
        return List.of(limonata(), acqua(), vino());
    }

    @Bean
    public List<Bibita> listaBibite2() {
        return List.of(limonata(), acqua(), acqua());
    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, 20, false);
    }

    @Bean
    public Tavolo tavolo2() {
        return new Tavolo(2, 4, true);
    }

    @Bean
    public Tavolo tavolo3() {
        return new Tavolo(3, 2, false);
    }

    @Bean
    public Tavolo tavolo4() {
        return new Tavolo(4, 6, true);
    }

    @Bean
    public Tavolo tavolo5() {
        return new Tavolo(5, 2, true);
    }

//    @Bean(name = "Menu")
//    public Menu menu() {
//        List<Pizza> listaPizze = new ArrayList<>();
//        listaPizze.add(margherita());
//        listaPizze.add(hawaiiana());
//        listaPizze.add(diavola());
//
//        List<Topping> listaToppings = new ArrayList<>();
//        listaToppings.add(formaggio());
//        listaToppings.add(prosciutto());
//        listaToppings.add(cipolle());
//        listaToppings.add(ananas());
//        listaToppings.add(salamino());
//
//        List<Bibita> listaBibite = new ArrayList<>();
//        listaBibite.add(limonata());
//        listaBibite.add(acqua());
//        listaBibite.add(vino());
//        return new Menu(listaPizze, listaToppings, listaBibite, true);
//    }
}
