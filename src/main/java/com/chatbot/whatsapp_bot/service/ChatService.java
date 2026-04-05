package com.chatbot.whatsapp_bot.service;

import com.chatbot.whatsapp_bot.model.ChatRequest;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class ChatService {
    private static final Logger logger= LoggerFactory.getLogger(ChatService.class);
    public String getreply(ChatRequest chatRequest){
        if(chatRequest.getMessage() == null){
            logger.info("message is null");
            return "please write something..";
        }
        String messageupdate= chatRequest.getMessage().toLowerCase().trim();
        System.out.println(messageupdate);
        switch (messageupdate){
            case "hi" :
                return "hello";
            case "hello":
                return "hii";
            case "how are you":
                return "I am fine. what about you?";
            case "thanks":
                return "you are welcome";

            case "thank you":
                return "my pleasure";

            case "who are you":
                return "I am a chatbot built using Spring Boot";

            case "what is your name":
                return "I am your assistant bot";

            case "help":
                return "I can respond to greetings and basic questions";

            case "good morning":
                return "Good morning! Have a great day";

            case "good night":
                return "Good night! Take care";

            case "what are you doing":
                return "I am here to help you";

            case "how old are you":
                return "I am just created, so very young";

            case "where are you from":
                return "I live inside your Spring Boot application";

            default:
                logger.info("undefined message");
                return "i can't understand your words";
        }
    }
}
