package com.alina.homework34;

import androidx.recyclerview.widget.RecyclerView;

import com.alina.homework34.databinding.ItemContinentBinding;
import com.bumptech.glide.Glide;


public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super (binding.getRoot());
        this.binding=binding;
    }
    void bind(Continent continent){
        binding.tvName.setText(continent.getName());
        binding.tvCountry.setText(continent.getCountry());
        Glide.with(binding.imgOne).load(continent.getPicture()).into(binding.imgOne);
    }
}
