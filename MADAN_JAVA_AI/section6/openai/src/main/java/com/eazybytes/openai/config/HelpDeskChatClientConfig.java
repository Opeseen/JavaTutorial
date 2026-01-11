package com.eazybytes.openai.config;

import com.eazybytes.openai.advisors.TokenUsageAuditAdvisor;
import com.eazybytes.openai.tools.TimeTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.advisor.api.Advisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.util.List;

@Configuration
public class HelpDeskChatClientConfig {

  @Value("classpath:/promptTemplate/helpDeskSystemPromptTemplate.st")
  Resource systemPromptTemplate;

  @Bean("helpDeskChatClient")
  public ChatClient chatClient(
      ChatClient.Builder chatClientBuilder,
      ChatMemory chatMemory,
      TimeTools timeTools
  ){
    Advisor memoryAdvisor = MessageChatMemoryAdvisor.builder(chatMemory).build();
    Advisor logegrAdvisor = new SimpleLoggerAdvisor();
    Advisor tokenUsageAdvisor = new TokenUsageAuditAdvisor();
    return chatClientBuilder
        .defaultSystem(systemPromptTemplate)
        .defaultTools(timeTools)
        .defaultAdvisors(List.of(logegrAdvisor,
            memoryAdvisor, tokenUsageAdvisor))
        .build();
  }
}
