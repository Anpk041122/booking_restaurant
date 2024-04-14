package com.example.booking_restaurant.views.fragment_admins;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.booking_restaurant.R;
import com.example.booking_restaurant.views.activities.AdminActivity;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CatergoryAdminFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CatergoryAdminFragment extends Fragment {

    private static final String ARG_PARAM1 = "userId";
    private static final String ARG_PARAM2 = "role";

    private String userId;
    private String role;


    public CatergoryAdminFragment() {

    }


    public static CatergoryAdminFragment newInstance(String userId, String role) {
        CatergoryAdminFragment fragment = new CatergoryAdminFragment();
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
        View view =  inflater.inflate(R.layout.fragment_catergory_admin, container, false);


        return view;
    }
}