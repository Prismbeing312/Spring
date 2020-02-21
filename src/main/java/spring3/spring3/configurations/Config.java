package spring3.spring3.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring3.spring3.entities.*;

@Configuration
@ComponentScan("spring3.spring3")
@PropertySource("classpath:climberProp.properties")
public class Config {

    @Bean
    public Session getSession(){
        return new ClimbingSession();
    }

    @Bean
    public Sport getClimber(){
        return new Climber(getSession(), "Jake", 24);
    }

    @Bean
    public Session getSession2(){
        return new ClimbmingSession2();
    }

    @Bean
    public Sport getClimber2(){
        return new Climber(getSession2(), "Omer", 23);
    }
}
