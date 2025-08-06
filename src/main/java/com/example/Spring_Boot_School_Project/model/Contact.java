package com.example.Spring_Boot_School_Project.model;

public class Contact {

    private String name;
    private String email;
    private String message;
    private String mobileNum;
    private String subject;

    public Contact(String name, String email, String message, String mobileNum, String subject) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.mobileNum = mobileNum;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", message=" + message + ", mobileNum=" + mobileNum
                + ", subject=" + subject + "]";
    }

}
