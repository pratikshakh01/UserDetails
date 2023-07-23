package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details") //wanting specific name or else skip this line
public class UserDetails {

    @Id
    private String userId;
    private String userName;
    private String userAddress;
    private String userPhone;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }


    public UserDetails() {
    }
    public UserDetails(String userId, String userName, String userAddress, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

}
