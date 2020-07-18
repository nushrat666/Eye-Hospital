package com.mononsoft.bangladesheyehospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by Md Mehadi Hasan on 7/7/2020.
 * Email: bdmehadih@gmail.com
 * Website: www.mehadih.me
 * Project Name: Bangladesh Eye Hospital
 */
public class MainFragment extends Fragment {

    private static final String TAG = "MainFragment";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

}
