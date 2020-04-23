package com.example.globalmatic.Services;

import com.example.globalmatic.Model.Idea;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IdeaService {
    @GET("ideas")
    Call<List<Idea>> getIdeas();


}
