package com.devaj.antonio.localiza2;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {


//    String url= "http://maps.googleapis.com/maps/api/directions/json?origin="
//            + origin.latitude+","+origin.longitude+"&destination="
//            + destination.latitude+","+destination.longitude+"&sensor=false";

    @GET("/maps/api/directions/json")
    public void getJson(@Query("origin") String origin, @Query("destination") String destination, @Query("key") String key, Callback<DirectionResults> callback);
}
