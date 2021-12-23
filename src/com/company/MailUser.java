package com.company;

public class MailUser implements IMailUser{
    private String name;
    MailUser(String name){
        setName(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public void notification(String postName, String message){
        System.out.println(name+" get message: "+message+" from "+postName);
    }
}
