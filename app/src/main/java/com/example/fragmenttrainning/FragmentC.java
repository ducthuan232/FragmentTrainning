package com.example.fragmenttrainning;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.fragmenttrainning.databinding.FragmentBBinding;
import com.example.fragmenttrainning.databinding.FragmentCBinding;

public class FragmentC extends Fragment {
    FragmentCBinding viewBindingC;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        viewBindingC = FragmentCBinding.inflate(inflater,container,false);

        return viewBindingC.getRoot();
    }
}
