package com.example.cuizehui.estoredataservice.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuizehui.estoredataservice.MainActivity;
import com.example.cuizehui.estoredataservice.R;

public class ShopdataFragment extends Fragment {
    MainActivity mainActivity;
    public ShopdataFragment(MainActivity mainActivity) {
     this.mainActivity=mainActivity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopdata, container, false);
    }

}
