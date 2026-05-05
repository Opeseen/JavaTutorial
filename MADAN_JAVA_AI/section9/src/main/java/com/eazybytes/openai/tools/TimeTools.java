package com.eazybytes.openai.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class TimeTools {
  private static final Logger logger = LoggerFactory.getLogger(TimeTools.class);

  @Tool(name = "getCurrentLocalTIme", description = "Get the current time in the user's timezone")
  String getCurrentLocalTIme(){
    logger.info("Returning the current time in the user's timezone");
    return LocalTime.now().toString();
  }

  @Tool(name = "getCurrentTIme", description = "Get the current time in the specified timezone")
  String getCurrentTIme(@ToolParam(description = "Value representing the timezone") String timezone){
    logger.info("Returning the current time in the timezone {}", timezone);
    return LocalTime.now(ZoneId.of(timezone)).toString();
  }
}
