package com.example.crudtwitter;
import java.util.Date;

public class Tweet {
    public String id;
    public String user;
    public String message;
    public Date createdAt;
    public String language;
    public String source;

    public Tweet() {
    }

    public Tweet(String id, String user, String message) {
        this.id = id;
        this.user = user;
        this.message = message;
    }

    public Tweet(String id, String user, String text, Date createdAt, String language, String source) {
        this.id = id;
        this.user = user;
        this.message = text;
        this.createdAt = createdAt;
        this.language = language;
        this.source = source;
    }

    public String getId() { return this.id; }

    public String getUser() { return this.user; }
    public void setUser(String user) { this.user = user; }

    public String getMessage() { return this.message; }
    public void setMessage(String text) { this.message = text; }

    public Date getCreatedAt() {return this.createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getSource() { return this.source; }
    public void setSource(String source) { this.source = source;}

    @Override
    public String toString() {
        return message + "-- from: " + source + " -- lang: " + language;
    }
}

