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

import org.jetbrains.annotations.NotNull;


public class SplashFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }


    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


//                Intent intent = new Intent(requireActivity(), OnboardingActivity.class);
//                startActivity(intent);
//                getActivity().finish();

                NavDirections navDirections = SplashFragmentDirections.actionSplashFragmentToOnboardingFragment();
                Navigation.findNavController(view).navigate(navDirections);

            }
        }, 1000);

    }
}