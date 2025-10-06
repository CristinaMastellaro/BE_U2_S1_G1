package cristinamastellaro.BE_U2_S1_G1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public Topping formaggio() {
        return new Topping(92, 0.69, "Formaggio");
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

    @Bean(name = "Menu")
    public Menu menu() {
        List<Pizza> listaPizze = new ArrayList<>();
        listaPizze.add(margherita());
        listaPizze.add(hawaiiana());
        listaPizze.add(diavola());

        List<Topping> listaToppings = new ArrayList<>();
        listaToppings.add(formaggio());
        listaToppings.add(prosciutto());
        listaToppings.add(cipolle());
        listaToppings.add(ananas());
        listaToppings.add(salamino());

        List<Bibita> listaBibite = new ArrayList<>();
        listaBibite.add(limonata());
        listaBibite.add(acqua());
        listaBibite.add(vino());
        return new Menu(listaPizze, listaToppings, listaBibite, true);
    }
}
