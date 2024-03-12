package com.shreeram.languagetranslator.service;

import com.shreeram.languagetranslator.openai.AiAssistant;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    private final AiAssistant aiAssistant;

    public OpenAiService(AiAssistant aiAssistant) {
        this.aiAssistant = aiAssistant;
    }

    public String translate(String text, String language) {
        return aiAssistant.translate(text, language);
    }
}
