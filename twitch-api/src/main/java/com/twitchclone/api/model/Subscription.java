package com.twitchclone.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscriptions")
public class Subscription extends AbstractModels {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}