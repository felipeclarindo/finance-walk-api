package com.example.finance_walk_api.model;

public class Category {
    private Long id;
    private String name;
    private String icon;

    public Category(Long id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", icon=" + icon + "]";
    }
}