package com.robi.aplikasistudiomusikpangkalpinang.api;

import com.robi.aplikasistudiomusikpangkalpinang.model.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
