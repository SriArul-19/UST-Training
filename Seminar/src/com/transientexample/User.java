package com.transientexample;

import java.io.Serializable;

public class User implements Serializable 
{
    String username;
    transient String password;  // not serialized

    public User(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }
}
