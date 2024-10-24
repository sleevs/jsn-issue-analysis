package br.com.jsn.dto;

public class ContributorDto {

    private String name;
    private String user;
    private String email;
    private Integer quantityCommit;

    public ContributorDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getQuantityCommit() {
        return quantityCommit;
    }

    public void setQuantityCommit(Integer quantityCommit) {
        this.quantityCommit = quantityCommit;
    }

    
    
}
