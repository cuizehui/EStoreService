package com.example.cuizehui.estoredataservice.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuizehui.estoredataservice.MainActivity;
import com.example.cuizehui.estoredataservice.R;


public class OrderDataFragment extends Fragment {

  MainActivity mainActivity;

    public OrderDataFragment(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity=mainActivity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_data, container, false);
    }

}
