package com.example.globalmatic.Services;

import retrofit2.Call;
import retrofit2.http.GET;

//this interface receives messages on our landing page
public interface MesageService {
    //define methods on this interface that corresponds to the endpoints on the web service

    @GET("messages") //this means tell retrofit  when we call the method getMessages(); we should match it to a HTTP GET request to this url path
    Call<String> getMessages();
  }
