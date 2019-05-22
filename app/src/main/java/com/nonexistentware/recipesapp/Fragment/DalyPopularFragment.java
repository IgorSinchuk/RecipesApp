package com.nonexistentware.recipesapp.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nonexistentware.recipesapp.R;


public class DalyPopularFragment extends Fragment {

    private static DalyPopularFragment INSTANCE = null;

    public DalyPopularFragment() {
    }

    public static DalyPopularFragment getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DalyPopularFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_daly_popular, container, false);
    }
}
