package com.eazybytes.enumeration;

public class TaskUtil {
  public static int getEstimatedCompletionTime(PriorityEnum priority){
    return switch (priority){
      case LOW -> 7;
      case MEDIUM -> 5;
      case HIGH -> 3;
      case PriorityEnum.URGENT -> 1;
    };
  }
}
