package cristinamastellaro.BE_U2_S1_G1;

import cristinamastellaro.BE_U2_S1_G1.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class Runner1 implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    @Qualifier("listaPizze2")
    private List<Pizza> pizze;
    @Autowired
    @Qualifier("listaBibite2")
    private List<Bibita> bibite;
    @Autowired
    @Qualifier("tavolo2")
    private Tavolo tavolo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menu + "\n\n");
        Ordine ordine = new Ordine(1, pizze, bibite, Stato.SERVITO, 3, LocalTime.of(12, 45), tavolo.getNumTavolo());
        ordine.stampaOrdine();
    }
}
