package com.byjus.stackoverflow.entities;

import java.util.Date;

public abstract class UserAccount implements UserInterface {
    
    UUID uuid;
    String name;

    String phoneNumber;
    String email;

    Date joinedOn;
}
