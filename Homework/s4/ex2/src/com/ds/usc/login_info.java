package com.ds.usc;

public class login_info<username,password> implements Cloneable {
    public username user;
    public password pass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
