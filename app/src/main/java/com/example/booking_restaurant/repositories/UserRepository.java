package com.example.booking_restaurant.repositories;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.booking_restaurant.models.User;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;


public class UserRepository extends BaseRepository {
    private static final String TAG = "UserRepository";

    public UserRepository() {
        this.db = FirebaseFirestore.getInstance();
        this.coRef = db.collection("user");
    }


    public void AddUser(String userId, String role){
        User user = new User(userId, role);
        db.collection("user").add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });

    }

    public void getRole(String userId, OnDataFetchedListener listener){
        Query query = coRef.whereEqualTo("userId", userId);
        query.get()
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()) {

                        QuerySnapshot querySnapshot = task.getResult();
                        if(querySnapshot != null && !querySnapshot.isEmpty()) { // Sửa điều kiện kiểm tra null ở đây

                            String userRole;

                            userRole = querySnapshot.getDocuments().get(0).getString("role");

                            if(userRole != null) {
                                listener.onDataFetched(userRole);
                            } else {
                                listener.onDataFetched(null);
                            }

                        }

                    }
                });
    }
}
