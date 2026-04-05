# WhatsApp Chatbot (Spring Boot)

## 📌 Project Description

This is a simple WhatsApp chatbot backend simulation built using Spring Boot.
It receives user messages via REST API and returns appropriate responses based on predefined logic.

---

## 🚀 Features

* Responds to basic messages like **hi, hello, bye**
* Structured **Standard API Response**
* Uses **ResponseEntity** for HTTP status handling
* Logging implemented using **SLF4J**
* Clean layered architecture (Controller, Service, Model)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

---

## 📡 API Details

### Endpoint:

POST `/chat/send`

### Request:

```json
{
  "message": "hi"
}
```

### Response:

```json
{
  "status": "success",
  "message": "Message successfully sent",
  "data": {
    "reply": "hello"
  }
}
```

---

## 🧠 How it Works

* Controller receives the request
* Service processes the message using conditional logic
* Response is wrapped in a standard API format
* ResponseEntity is used to return status + data

---

## 🎯 Conclusion

This project demonstrates basic REST API development, structured response handling, and logging in Spring Boot.

---
