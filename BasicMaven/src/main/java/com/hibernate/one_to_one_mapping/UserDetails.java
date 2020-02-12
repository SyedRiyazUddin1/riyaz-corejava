package com.hibernate.one_to_one_mapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
public class UserDetails {

    @Id
    private int userId;
    @Column
    private String userName, address;

//    @OneToOne
//    private Vehicle vehicle;

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }


    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    @OneToMany
    private List<Vehicle> vehicle = new ArrayList<Vehicle>();



    public UserDetails(int userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }

//    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
