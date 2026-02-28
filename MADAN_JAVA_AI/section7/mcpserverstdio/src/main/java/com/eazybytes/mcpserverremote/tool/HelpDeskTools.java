package com.eazybytes.mcpserverremote.tool;

import com.eazybytes.mcpserverremote.entity.HelpDeskTicket;
import com.eazybytes.mcpserverremote.model.TicketRequest;
import com.eazybytes.mcpserverremote.service.HelpDeskTicketService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HelpDeskTools {
  private static final Logger logger = LoggerFactory.getLogger(HelpDeskTools.class);
  private final HelpDeskTicketService service;

  @Tool(name = "createTicket", description = "Create the support ticket")
  String createTicket(@ToolParam(description = "Details to create a support ticket")
                      TicketRequest ticketRequest){
    logger.info("Creating support ticket with details: {}", ticketRequest);
    HelpDeskTicket savedTicket = service.createTicket(ticketRequest);
    logger.info("Ticket created successfully. Ticket ID: {}, Username: {}", savedTicket.getId(), savedTicket.getUsername());
    return "Ticket #" + savedTicket.getId() + " created successfully for user " + savedTicket;
  }

  @Tool(description = "Fetch the status of the tickets based on a given username")
  List<HelpDeskTicket> getTicketStatus(@ToolParam(description =
      "Username to fetch the status of the help desk tickets") String username) {
    logger.info("Fetching tickets for user: {}", username);
    List<HelpDeskTicket> tickets =  service.getTicketsByUsername(username);
    logger.info("Found {} tickets for user: {}", tickets.size(), username);
    return tickets;
  }
}