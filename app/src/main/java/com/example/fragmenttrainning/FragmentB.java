package com.example.fragmenttrainning;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.fragmenttrainning.databinding.FragmentBBinding;

public class FragmentB extends Fragment {
    FragmentBBinding viewBindingB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        viewBindingB = FragmentBBinding.inflate(inflater,container,false);

        return viewBindingB.getRoot();
    }
}
