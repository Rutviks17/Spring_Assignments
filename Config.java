package Classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Dog dogDetails()
    {
        return new Dog();
    }
    @Bean
    public Cat catDetails()
    {
        return new Cat();
    }
}
