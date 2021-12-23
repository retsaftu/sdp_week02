package com.company;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements IPostOffice{
    private String name;
    private List<IMailUser> users;

    PostOffice(String name){
        setName(name);
        users = new ArrayList<>();
    }

    public void mailUser(IMailUser mailUser){
        this.users.add(mailUser);
    }
    public void notifycationToUser(String message){
        for(IMailUser mailUser: users){
            mailUser.notification(getName(),message);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
