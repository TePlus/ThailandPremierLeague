package com.teplus.thaipremierleague;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ClubsinfoActivity extends Fragment {


    public static ClubsinfoActivity newInstance() {
        return new ClubsinfoActivity();
    }


    public ClubsinfoActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_clubs_info, container, false);

        return view;
    }
}