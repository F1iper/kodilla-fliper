package spring.kurs.javasolutions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.kurs.javasolutions.config.Config;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order1 = (IOrder) context.getBean("inna");
        order1.printOrder();


    }
}