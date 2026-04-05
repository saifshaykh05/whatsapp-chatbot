package com.chatbot.whatsapp_bot.response;

public class StandardApiResponse<T> {
    private String message;
    private String Status;
    private T data;

    public StandardApiResponse(String message, String status, T data) {
        this.message = message;
        Status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return Status;
    }

    public T getData() {
        return data;
    }
}
