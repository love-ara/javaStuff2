package data.model;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime creationDate = LocalDateTime.now();
    private String author;
    private int id;

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Entry(){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
