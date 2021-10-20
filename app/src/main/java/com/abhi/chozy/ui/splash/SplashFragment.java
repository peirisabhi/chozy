package com.abhi.chozy.ui.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhi.chozy.R;
import com.abhi.chozy.databinding.FragmentSplashBinding;

import org.jetbrains.annotations.NotNull;


public class SplashFragment extends Fragment {

    FragmentSplashBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSplashBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                binding.imageView4.setImageResource(R.drawable.logo2);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        NavDirections navDirections = SplashFragmentDirections.actionSplashFragmentToOnboardingFragment();
                        Navigation.findNavController(view).navigate(navDirections);
                    }
                }, 3000);

            }
        }, 3000);

    }


    private void step2(View view){

    }

}