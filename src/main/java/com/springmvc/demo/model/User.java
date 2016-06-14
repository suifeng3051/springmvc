package com.springmvc.demo.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by whd@zizizizizi.com on 2016/6/6.
 */
public class User {
    @NotNull
    @Size(min=3,max=20)
    private String name;
    @NotNull
    @Size(min=6,max=20)
    private String password;
    @NotNull
    @Size(min=3,max=20)
    private String accountNo;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
