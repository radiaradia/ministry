package com.example.ministery.Model;


public class User {

    private String userId; //id of user generated by Firebase Auth
    private String username;
    private String email;
    private int nbrArticlesTotal = 0; //Never decrement !!!!!
    private boolean hasSignaledProduct=false;


    public User(String userId, String username, String email)
    {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public User() {

    }

    public boolean isHasSignaledProduct() {
        return hasSignaledProduct;
    }

    public void setHasSignaledProduct(boolean hasSignaledProduct) {
        this.hasSignaledProduct = hasSignaledProduct;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNbrArticlesTotal (int nb) { this.nbrArticlesTotal = nb; }

    public int getNbrArticlesTotal() { return this.nbrArticlesTotal; }

    public void incNbrArticlesTotal()
    {
        this.nbrArticlesTotal++;
    }
}
