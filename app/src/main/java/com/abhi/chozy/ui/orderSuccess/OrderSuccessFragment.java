package com.abhi.chozy.ui.orderSuccess;

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
import com.abhi.chozy.databinding.FragmentOrderSuccessBinding;

import org.jetbrains.annotations.NotNull;


public class OrderSuccessFragment extends Fragment {

    FragmentOrderSuccessBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentOrderSuccessBinding.inflate(inflater,container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections navDirections = OrderSuccessFragmentDirections.actionOrderSuccessFragmentToNavigationHome();
                Navigation.findNavController(binding.getRoot()).navigate(navDirections);
            }
        });
    }
}