package hu.progmatic.spring_hangman_web_new.config;

import hu.progmatic.spring_hangman_web_new.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean() {
        return new Game();
    }


}
