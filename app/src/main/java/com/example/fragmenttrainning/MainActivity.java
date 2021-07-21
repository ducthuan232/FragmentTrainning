package com.example.fragmenttrainning;

import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.fragmenttrainning.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity   {
    FragmentManager fragmentManager = getFragmentManager();
    ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(viewBinding.getRoot());
        viewBinding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDialog fragmentDialog = new FragmentDialog();
                fragmentDialog.show(getFragmentManager(),"dialog");
            }
        });
    }


}