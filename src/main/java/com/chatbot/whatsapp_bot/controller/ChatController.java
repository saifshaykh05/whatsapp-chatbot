package com.chatbot.whatsapp_bot.controller;

import com.chatbot.whatsapp_bot.model.ChatRequest;
import com.chatbot.whatsapp_bot.model.ChatResponse;
import com.chatbot.whatsapp_bot.response.StandardApiResponse;
import com.chatbot.whatsapp_bot.service.ChatService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService chatService;
    @PostMapping("/send")
    public ResponseEntity<StandardApiResponse<ChatResponse>> chat(@RequestBody ChatRequest Request){
        String reply=chatService.getreply(Request);
        ChatResponse response=new ChatResponse(reply);
        StandardApiResponse<ChatResponse> stdapi= new StandardApiResponse("Message successfully send","success",response);
        return ResponseEntity.ok(stdapi);
    }
}
