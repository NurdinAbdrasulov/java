package kg.kstu.teaching.listener;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class BotListener {
    TelegramBot bot;

    @Bean
    void updateListener() {
        bot.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                Message message = update.message();
                if (message == null || !Objects.equals(message.chat().id(), message.from().id()))
                    return;

                Long chatId = message.chat().id();
                try {
                    var responseMessage = switch (message.text()){
                        case "/start" -> "Курс Java ИВТ";
                        case "/do" -> "Команда /do";
                        default -> "неизвестная команда";
                    };

                    SendResponse response = bot.execute(new SendMessage(chatId, responseMessage));
                    log.info(response.toString());

                } catch (RuntimeException e) {
                    log.error(e.getMessage(), e);
                    bot.execute(new SendMessage(chatId, e.getMessage()));
                }
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }
}

