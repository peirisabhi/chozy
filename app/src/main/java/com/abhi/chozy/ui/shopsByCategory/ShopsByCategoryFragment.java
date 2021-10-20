package com.abhi.chozy.ui.shopsByCategory;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhi.chozy.R;
import com.abhi.chozy.databinding.FragmentShopsByCategoryBinding;

import org.jetbrains.annotations.NotNull;


public class ShopsByCategoryFragment extends Fragment {

    FragmentShopsByCategoryBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentShopsByCategoryBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.shop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections navDirections = ShopsByCategoryFragmentDirections.actionShopsByCategoryFragmentToShopFragment();
                Navigation.findNavController(binding.getRoot()).navigate(navDirections);
            }
        });
    }
}