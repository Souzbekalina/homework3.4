package com.alina.homework34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alina.homework34.databinding.FragmentContinentDetailBinding;
import com.bumptech.glide.Glide;

public class ContinentDetailFragment extends Fragment {

     private FragmentContinentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentContinentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Continent continentResult= (Continent) getArguments().getSerializable("CONTINENT");
        binding.tv1fragment.setText(continentResult.getName());
        binding.tv2fragment.setText(continentResult.getCountry());
        Glide.with(binding.img2fragment).load(continentResult.getPicture()).into(binding.img2fragment);
    }
}