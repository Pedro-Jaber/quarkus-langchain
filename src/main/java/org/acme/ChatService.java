package org.acme;

import dev.langchain4j.model.openai.OpenAiChatModel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChatService {

    private final OpenAiChatModel model;

    public ChatService() {
        this.model = OpenAiChatModel.builder()
                .apiKey("")
                .modelName("gpt-3.5-turbo")
                .temperature(0.7)
                .build();
    }

    public String chat(String message) {
        return model.chat(message);
    }

}
