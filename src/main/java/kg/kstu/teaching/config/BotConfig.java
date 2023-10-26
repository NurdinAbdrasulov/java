package kg.kstu.teaching.config;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BotConfig {

    @Value("${telegram.BotToken}")
    private String botToken;


    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(botToken);
    }

}
