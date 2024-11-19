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
@Table(name = "subscriptions")
public class Subscription extends AbstractModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private int followers;

    public Subscription() {
    }

    public Subscription(String name, String category, int followers) {
        this.name = name;
        this.category = category;
        this.followers = followers;
    }

    @Override
    public Long getId() {
        return super.getId(); // или просто return id; если id определен в классе Subscription
    }
}