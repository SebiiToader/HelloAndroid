package com.example.helloandroid.w8example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PersonApi {

    @GET("/rwxGoogle/HelloAndroid/week8-examples/{fileName}")
    Call<List<User>> getPersons(@Path("fileName") String jsonToFetch);
}
