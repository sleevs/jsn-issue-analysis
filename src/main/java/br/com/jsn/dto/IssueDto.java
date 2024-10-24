package br.com.jsn.dto;

import java.util.List;

public class IssueDto {

    private String title;
    private String author;
    private List<String> labels;
   

    public IssueDto(){

    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public List<String> getLabels() {
        return labels;
    }


    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    
    
}
