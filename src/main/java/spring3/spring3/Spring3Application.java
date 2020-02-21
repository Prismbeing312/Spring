package spring3.spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring3.spring3.configurations.Config;
import spring3.spring3.entities.*;

@SpringBootApplication
public class Spring3Application {

    public static void main(String[] args) { SpringApplication.run(Spring3Application.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Climber climber = context.getBean("getClimber", Climber.class);

        System.out.println(climber);
        System.out.println(climber.getSessionContext());
        System.out.println(climber.getType());
        climber.setSession(context.getBean("getSession2", ClimbmingSession2.class));

        System.out.println(climber);
    }

}
