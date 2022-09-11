package com.example.bruno;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
//import androidx.navigation.fragment.NavHostFragment;

//import com.example.bruno.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    View v;
    Button Meetings;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        v = inflater.inflate(R.layout.fragment_second, container,false);
        Meetings = v.findViewById(R.id.button3);
        Meetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AppCompatActivity) v.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ThirdFragment()).commit();
            }
        });
        return v;
    }
}


