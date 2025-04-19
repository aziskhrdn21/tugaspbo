/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

public class User extends LibraryEntity {
    String name;
    String email;

    public User(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }
    
    public String getName() { return name; }
    public String getEmail() { return email; }
    
    @Override
    public String getDetails() {
        return "User [ID=" + getId() + ", Name=" + name + ", Email=" + email + "]";
    }
}
