package com.twitchclone.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "users")
public class User extends AbstractModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String username;
    private String password;
    private String position;
    private String role;

    @Override
    public Long getId() {
        return super.getId();
    }
}