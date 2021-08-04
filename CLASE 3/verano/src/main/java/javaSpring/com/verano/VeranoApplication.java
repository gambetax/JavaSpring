package javaSpring.com.services;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"javaSpring.com.services"})
public class VeranoApplication {

    public static void main(String[] args) {

        //factory().sensar();
      
        SpringApplication.run(VeranoApplication.class, args);

    }

}
