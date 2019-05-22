package com.nonexistentware.recipesapp.Model;

public class RecipeItem {
    public String imageLink;
    public String categoryId;
    public String description;

    public RecipeItem() {
    }

    public RecipeItem(String imageLink, String categoryId, String recipeName) {
        this.imageLink = imageLink;
        this.categoryId = categoryId;
        this.description = recipeName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
