package com.example.retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface api {
    // as we are making get request so we are displaying
    // GET as annotation.
    // and inside we are passing last parameter for our url.https://api.github.com/repositories/19438/issues
    @Headers("Content-Type:application/json")
    @GET("/repositories/19438/issues")

    // as we are calling data from array so we are calling
    // it with array list and naming that method as getAllCourses();
    Call<List<Root>> getdata();
}
