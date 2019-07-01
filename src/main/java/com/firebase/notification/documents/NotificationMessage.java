package com.firebase.notification.documents;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class NotificationMessage {
    public NotificationMessage() {
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    private Integer messageId;
    private String msgBody;
    private String phone;
    private String email;
    private Integer priority;

    public NotificationMessage(Integer messageId, String msgBody, String phone, String email, Integer priority) {
        this.messageId = messageId;
        this.msgBody = msgBody;
        this.phone = phone;
        this.email = email;
        this.priority = priority;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
