package com.firebase.notification.requests;

public class NotificationMessageRequest {
    private String msgBody;
    private String phone;
    private String email;
    private Integer priority;

    public NotificationMessageRequest(String msgBody, String phone, String email, Integer priority) {
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
