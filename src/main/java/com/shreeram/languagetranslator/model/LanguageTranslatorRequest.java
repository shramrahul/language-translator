package com.shreeram.languagetranslator.model;

import lombok.Data;

@Data
public class LanguageTranslatorRequest {
    private String language;
    private String text;
}
