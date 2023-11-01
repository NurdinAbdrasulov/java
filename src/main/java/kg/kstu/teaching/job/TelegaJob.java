package kg.kstu.teaching.job;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class TelegaJob {

    @Value("${telegram.channel}")
    Long channelId;

    final TelegramBot telegramBot;

    @Scheduled(fixedRate = 5000)
    public void run() {

        SendResponse response = telegramBot.execute(new SendMessage(channelId, "Прошло 5 сек"));
        log.info(response.toString());
    }

}
