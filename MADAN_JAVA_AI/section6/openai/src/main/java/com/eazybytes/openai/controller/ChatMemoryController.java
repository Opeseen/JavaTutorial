package com.eazybytes.openai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.ai.chat.memory.ChatMemory.CONVERSATION_ID;

@RestController
@RequestMapping("/api")
public class ChatMemoryController {

  public final ChatClient chatClient;

  public ChatMemoryController(@Qualifier("chatMemoryChatClient") ChatClient chatClient){
    this.chatClient = chatClient;
  }

  @GetMapping("/chat-memory")
  public ResponseEntity<String> chatMemory(@RequestHeader("username") String username,
                                           @RequestParam("message") String message){
    return new ResponseEntity<>(
        chatClient.prompt().user(message)
            .advisors(advisorSpec -> advisorSpec.param(CONVERSATION_ID, username))
            .call().content()
        , HttpStatus.OK
    );
  }

}
