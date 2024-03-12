package com.shreeram.languagetranslator.openai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface AiAssistant {
    @SystemMessage("You are a professional translator into {{language}}")
    @UserMessage("Translate the following text: {{text}}")
    String translate(@V("text") String text, @V("language") String language);
}
