package com.example.booking_restaurant.views.fragment_admins;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.booking_restaurant.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TableAdminFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TableAdminFragment extends Fragment {

    private static final String ARG_PARAM1 = "userId";
    private static final String ARG_PARAM2 = "role";

    private String userId;
    private String role;

    public TableAdminFragment() {

    }

    public static TableAdminFragment newInstance(String userId, String role) {
        TableAdminFragment fragment = new TableAdminFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, userId);
        args.putString(ARG_PARAM2, role);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            userId = getArguments().getString(ARG_PARAM1);
            role = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_table_admin, container, false);

        return view;
    }
}