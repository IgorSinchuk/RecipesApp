package com.nonexistentware.recipesapp.Model;

public class CategoryItem {
    public String name;
    public String imageLink;
    public String description;

    public CategoryItem() {
    }

    public CategoryItem(String name, String imageLink, String description) {
        this.name = name;
        this.imageLink = imageLink;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getDesciption() {
        return description;
    }

    public void setDesciption(String desciption) {
        this.description = desciption;
    }
}
