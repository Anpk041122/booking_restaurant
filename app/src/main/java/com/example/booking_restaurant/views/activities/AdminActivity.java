package com.example.booking_restaurant.views.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.booking_restaurant.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AdminActivity extends AppCompatActivity {
    private MaterialToolbar topAppBar;
    private ShapeableImageView shapeableImageView;
    private NavigationView navigationView;
    private FirebaseAuth mAuth;
    public static final int NAV_USER_ADMIN = R.id.navUserAdmin;
    public static final int NAV_CATEGORY_ADMIN = R.id.navCategoryAdmin;
    public static final int NAV_TABLE_ADMIN = R.id.navTableAdmin;
    public static final int NAV_BILL_ADMIN = R.id.navBillAdmin;
    public static final int NAV_LOGOUT_ADMIN = R.id.navLogoutAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        navigationView = (NavigationView) findViewById(R.id.navigationMenuAdmin);
        topAppBar = (MaterialToolbar) findViewById(R.id.topAppBarAdmin);
        setSupportActionBar(topAppBar);

        topAppBar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                navigationView.setVisibility(View.VISIBLE);
            }
        });


        handleCloseNavigation();
        setListenerItemNavigation();
    }

    public void setListenerItemNavigation()
    {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == NAV_USER_ADMIN){

                } else if (itemId == NAV_CATEGORY_ADMIN) {

                } else if (itemId == NAV_TABLE_ADMIN) {

                } else if (itemId == NAV_BILL_ADMIN){

                } else if (itemId == NAV_LOGOUT_ADMIN) {
                    handleNavLogout();
                } else {
                    setCLoseNavigtion();
                }
                return true;
            }
        });
    }

    public void handleCloseNavigation(){

        shapeableImageView = (ShapeableImageView) findViewById(R.id.navigationCloseAdmin);


        shapeableImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setCLoseNavigtion();
            }
        });
    }


    public void setCLoseNavigtion(){
        navigationView.setVisibility(View.GONE);
    }

    private void handleNavLogout() {
        mAuth.signOut()

    }

}