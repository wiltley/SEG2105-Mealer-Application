package com.example.mealerapplication.data;
import com.example.mealerapplication.data.model.Address;
import com.example.mealerapplication.data.model.CreditCard;
import com.google.firebase.auth.FirebaseUser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


// CLIENT SIDE GENERAL USER

public class User {

    private String username;
    private String ID;
    private String email;
    private String fName;
    private String lName;
    Address address;
    CreditCard creditCard;
    FirebaseUser user;

    public User(){

    }

    public User(FirebaseUser user) {
        //Changed the way how we're going to initialize things
    }

    public String getID(){
        return ID;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void handleMessageFromServer(){

    }

    /*public void permissable(Permission p){

    }*/


}
