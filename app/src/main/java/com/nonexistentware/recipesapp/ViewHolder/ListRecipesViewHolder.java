package com.nonexistentware.recipesapp.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.nonexistentware.recipesapp.Interface.ItemClickListener;
import com.nonexistentware.recipesapp.R;

public class ListRecipesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ItemClickListener itemClickListener;

    public ImageView recipe;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public ListRecipesViewHolder(@NonNull View itemView) {
        super(itemView);
        recipe = itemView.findViewById(R.id.image_recipe);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition());
    }
}
