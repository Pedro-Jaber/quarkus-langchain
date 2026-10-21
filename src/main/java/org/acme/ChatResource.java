package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class ChatResource {

    @Inject
    ChatService chatService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String chat(String message) {
        return chatService.chat(message);
    }

}
