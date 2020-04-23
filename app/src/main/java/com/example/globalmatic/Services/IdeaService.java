package com.example.globalmatic.Services;

import com.example.globalmatic.Model.Idea;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IdeaService {
    @GET("ideas")
    Call<List<Idea>> getIdeas();

    @GET("ideas/{id}")
    Call<Idea> getIdea(@Path("id") int id);


}
