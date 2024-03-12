package com.shreeram.languagetranslator.controller;

import com.shreeram.languagetranslator.model.LanguageTranslatorRequest;
import com.shreeram.languagetranslator.service.LanguageTranslatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageTranslatorController {

    private final LanguageTranslatorService translatorService;

    public LanguageTranslatorController(LanguageTranslatorService translatorService) {
        this.translatorService = translatorService;
    }

    @PostMapping("/translate")
    public ResponseEntity<String> translate(@RequestBody LanguageTranslatorRequest languageTranslatorRequest) {
        String translation = translatorService.translate(languageTranslatorRequest);
        return ResponseEntity.ok(translation);    }
}
