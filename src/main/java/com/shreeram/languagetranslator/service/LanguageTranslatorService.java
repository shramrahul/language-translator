package com.shreeram.languagetranslator.service;

import com.shreeram.languagetranslator.model.LanguageTranslatorRequest;
import org.springframework.stereotype.Service;

@Service
public class LanguageTranslatorService {

    private final OpenAiService openAiService;

    public LanguageTranslatorService(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    public String translate(LanguageTranslatorRequest request){
        return openAiService.translate(request.getText(), request.getLanguage());
    }
}
