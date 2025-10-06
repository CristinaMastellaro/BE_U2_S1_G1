package cristinamastellaro.BE_U2_S1_G1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1G1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeU2S1G1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeU2S1G1Application.class);

        System.out.println(ctx.getBean("menu"));


    }
}
