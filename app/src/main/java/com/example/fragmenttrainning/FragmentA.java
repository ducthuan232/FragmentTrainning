package com.example.fragmenttrainning;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmenttrainning.databinding.FragmentABinding;

public class FragmentA extends Fragment {
    FragmentABinding viewBindingA;
    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        viewBindingA = FragmentABinding.inflate(inflater,container,false);
        View view = viewBindingA.getRoot();
        return view;
    }
}
