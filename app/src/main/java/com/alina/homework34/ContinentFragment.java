package com.alina.homework34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alina.homework34.databinding.FragmentContinentBinding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ContinentFragment extends Fragment  implements  onClick{

    private FragmentContinentBinding binding;
    private ArrayList<Continent> continentsList;
    private ContinentAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentContinentBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        loadData();
        adapter= new ContinentAdapter(continentsList);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentsList=new ArrayList<>();
        continentsList.add(new Continent("Азия","Кыргызстан,Казакстан,Корея, Кытай,Өзбекстан","https://flyclipart.com/thumb2/asia-clip-art-512467.png"));
        continentsList.add(new Continent("Европа","Франция,Италия,Германия ,Улуу Британия, Испания","https://avatars.mds.yandex.net/i?id=41c650c1008128f938b73b088491bde52be274f4-5877328-images-thumbs&n=13"));
        continentsList.add(new Continent("Африка","Алжир, Судан,Египед,Ливия,Нигер","https://avatars.mds.yandex.net/i?id=5a74d66daf829f5f28d832b6f6d9aca9ac3c11be-8312904-images-thumbs&n=13"));
        continentsList.add(new Continent("Австралия и Океания","Австралия","https://e7.pngegg.com/pngimages/924/228/png-clipart-heavy-machinery-crane-architectural-engineering-africa-001-orange-logo.png"));
        continentsList.add(new Continent("Америка","Канада,Бразилия,Перу,Аргентина,Колумбия","https://e7.pngegg.com/pngimages/258/506/png-clipart-world-map-globe-cartography-world-map-miscellaneous-globe.png"));

    }

    @Override
    public void onClick(int position) {
         Continent continent=continentsList.get(position);
         Bundle bundle= new Bundle();
         bundle.putSerializable("CONTINENT", continent);
        ContinentDetailFragment fragment=new ContinentDetailFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).addToBackStack(null).commit();

    }
}