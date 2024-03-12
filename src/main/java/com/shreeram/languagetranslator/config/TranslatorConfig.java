package com.shreeram.languagetranslator.config;

import com.shreeram.languagetranslator.openai.AiAssistant;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.time.Duration.ofSeconds;

@Configuration
public class TranslatorConfig {

    @Bean
    public ChatLanguageModel model() {
        return OpenAiChatModel.builder()
                .apiKey("demo")
                .timeout(ofSeconds(60))
                .build();
    }

    @Bean
    public AiAssistant aiAssistant(ChatLanguageModel model) {
        return AiServices.create(AiAssistant.class, model);
    }
}
