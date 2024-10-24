package br.com.jsn.dto;

import java.util.List;

public class ResponseDto {
    
    private String user;
    private String repository;
    private List<IssueDto> issues;
    private List<ContributorDto> contributors;

    public ResponseDto(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

   

}
