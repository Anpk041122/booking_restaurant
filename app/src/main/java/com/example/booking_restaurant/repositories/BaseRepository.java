package com.example.booking_restaurant.repositories;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class BaseRepository {
    protected FirebaseFirestore db;
    protected CollectionReference coRef;
    public interface OnDataFetchedListener<T> {
        void onDataFetched(T data);
    }
}
