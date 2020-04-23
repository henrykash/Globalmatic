package com.example.globalmatic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.globalmatic.Services.MesageService;
import com.example.globalmatic.Services.ServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        MesageService taskService = ServiceBuilder.buildService(MesageService.class); //this acts as implementation to
        // the interface that maps to our RESTFUL endpoints , we can use this to make those calls i.e GET


        Call<String> call = taskService.getMessages(); //asyncronous task that RETFOFIT manages for us

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> request, Response<String> response) { //method which handles success scenario
                ((TextView)findViewById(R.id.message)).setText(response.body());
            }

            @Override
            public void onFailure(Call<String> request, Throwable t) {
                ((TextView)findViewById(R.id.message)).setText("Request Failed"); //method which handles failure scenario
            }
        });

    }

    public void GetStarted(View view){
        Intent intent = new Intent(this, IdeaListActivity.class);
        startActivity(intent);
    }
}
