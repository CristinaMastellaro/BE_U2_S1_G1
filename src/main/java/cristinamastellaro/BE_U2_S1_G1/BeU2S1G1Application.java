package cristinamastellaro.BE_U2_S1_G1;

import cristinamastellaro.BE_U2_S1_G1.entities.Bibita;
import cristinamastellaro.BE_U2_S1_G1.entities.Pizza;
import cristinamastellaro.BE_U2_S1_G1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1G1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeU2S1G1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeU2S1G1Application.class);

        System.out.println("\n\nMenu\n\n");

        Pizza margherita = ctx.getBean("Margherita", Pizza.class);
        Pizza hawaiiana = ctx.getBean("Hawaiiana", Pizza.class);
        Pizza diavola = ctx.getBean("Diavola", Pizza.class);
        System.out.println("Pizza\n");
        System.out.println(margherita);
        System.out.println(hawaiiana);
        System.out.println(diavola);

        Topping formaggio = ctx.getBean("formaggio", Topping.class);
        Topping prosciutto = ctx.getBean("prosciutto", Topping.class);
        Topping cipolle = ctx.getBean("cipolle", Topping.class);
        Topping ananas = ctx.getBean("ananas", Topping.class);
        Topping salamino = ctx.getBean("salamino", Topping.class);
        System.out.println("\n\nAggiunte\n");
        System.out.println(formaggio);
        System.out.println(prosciutto);
        System.out.println(cipolle);
        System.out.println(ananas);
        System.out.println(salamino);

        Bibita limonata = ctx.getBean("Limonata", Bibita.class);
        Bibita acqua = ctx.getBean("Acqua", Bibita.class);
        Bibita vino = ctx.getBean("Vino", Bibita.class);
        System.out.println("\n\nBibite\n");
        System.out.println(limonata);
        System.out.println(acqua);
        System.out.println(vino);


    }
}
