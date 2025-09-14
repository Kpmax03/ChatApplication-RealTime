package com.chat.realtime.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    private String id;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String userName;

}
