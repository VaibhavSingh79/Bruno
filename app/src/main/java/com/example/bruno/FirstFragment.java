package com.example.bruno;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {

//    private FragmentFirstBinding binding;
    View v;
    Button login;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

       v = inflater.inflate(R.layout.frag_l, container, false);

       login = v.findViewById(R.id.button);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ((AppCompatActivity) v.getContext()).getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SecondFragment()).commit();
           }
       });
       return v;

    }


}