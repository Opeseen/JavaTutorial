package com.eazybytes.openai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.ai.chat.memory.ChatMemory.CONVERSATION_ID;

@RestController
@RequestMapping("/api/tools")
public class TimeController {

  public final ChatClient chatClient;

  public TimeController(@Qualifier("timeChatClient") ChatClient chatClient){
    this.chatClient = chatClient;
  }

  @GetMapping("/local-time")
  public ResponseEntity<String> localTIme(
      @RequestHeader("username") String username,
      @RequestParam("message") String message){
    String answer = chatClient.prompt()
        .advisors(advisorSpec -> advisorSpec.param(CONVERSATION_ID, username))
        .user(message)
        .call().content();
    return new ResponseEntity<>(answer, HttpStatus.OK);
  }

}
