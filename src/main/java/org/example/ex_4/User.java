package org.example.ex_4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private final List<Adress> addresses = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAddress(Adress newAdress) {
        addresses.add(newAdress);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Adress> getAddresses() {
        return addresses;
    }
}

