package kg.kstu.teaching.config;

import com.pengrad.telegrambot.TelegramBot;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BotConfig {

    @Value("${telegram.BotToken}")
    String botToken;


    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(botToken);
    }

}
