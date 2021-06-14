package com.example.androidlabs;

public class Message {

    private String message;
    boolean isSent;
    boolean isRecevied;
    private MessageType type;
    private long id;

    public Message(String message, MessageType type){
        setMessage(message);
        setType(type);
        setId(id);
    }

    public Message(long id, String message, MessageType type) {
        setId(id);
        setMessage(message);
        setType(type);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }
}