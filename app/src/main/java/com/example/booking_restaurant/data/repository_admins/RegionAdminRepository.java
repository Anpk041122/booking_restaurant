package com.example.booking_restaurant.data.repository_admins;

import android.util.Log;

import com.example.booking_restaurant.data.models.Region;
import com.example.booking_restaurant.data.models.Restaurant;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class RegionAdminRepository extends BaseAdminRepository{
    private static final String TAG = "REGION_ADMIN_REPOSITORY";

    public RegionAdminRepository(){
        this.db = FirebaseFirestore.getInstance();
        this.coRef = db.collection("region");
    }

    public void AddRegion(Region region){
        coRef.add(region);
    }

    public void GetRegion(OnDataFetchedListener listener){
        coRef.get().addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                List<Region> _region = new ArrayList<>();
                for (QueryDocumentSnapshot document : task.getResult()) {
                    _region.add(document.toObject(Region.class));
                }

                listener.onDataFetched(_region);
            } else {
                Log.e(TAG, "get list restaurant failed");
            }
        });
    }
}
