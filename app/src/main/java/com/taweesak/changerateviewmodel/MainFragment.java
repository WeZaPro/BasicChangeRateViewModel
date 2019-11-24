package com.taweesak.changerateviewmodel;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainFragment extends Fragment {
    private SharedViewModel viewModel;
    private EditText editText;
    private Button button;
    private TextView textView;
    private String textValue;

    private Double valueRate;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        editText = v.findViewById(R.id.editText);
        button = v.findViewById(R.id.btn);
        textView = v.findViewById(R.id.txtView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueRate = Double.valueOf(editText.getText().toString());

                viewModel.setText(valueRate);
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        viewModel.getText().observe(getViewLifecycleOwner(), new Observer<Double>() {
            @Override
            public void onChanged(Double aDouble) {
                textView.setText(""+aDouble);
            }


        });
    }
}
