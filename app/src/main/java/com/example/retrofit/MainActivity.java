package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Root> recyclerDataArrayList;
    private RecyclerViewAdapter recyclerViewAdapter;

    public static  final  String TAG="MainActivty";

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView= findViewById(R.id.recucle);
getdata();
    }
    public  void  getdata() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create()).build();
        api retrofitAPI = retrofit.create(api.class);
        Call<List<Root>> call = retrofitAPI.getdata();
        call.enqueue(new Callback<List<Root>>() {


            @Override
            public void onResponse(Call<List<Root>> call, Response<List<Root>> response) {
//                Log.e(TAG, "onResponse:server Response" + response.toString());
////                Log.e(TAG, "onResponse:server Response" + response.body().toString());
////             List<Root> roots=response.body();
////             for(Root R: roots){
////                 Log.d("state",R.getState());
////                 Log.d("login",R.getUser().getLogin());

//             }
                if (response.isSuccessful()) {

                    // on successful we are hiding our progressbar.


                    // below line is to add our data from api to our array list.
                    recyclerDataArrayList = (ArrayList<Root>) response.body();

                    // below line we are running a loop to add data to our adapter class.
                    for (int i = 0; i < recyclerDataArrayList.size(); i++) {
                        recyclerViewAdapter = new RecyclerViewAdapter(recyclerDataArrayList, MainActivity.this);

                        // below line is to set layout manager for our recycler view.
                        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);

                        // setting layout manager for our recycler view.
                        recyclerView.setLayoutManager(manager);

                        // below line is to set adapter to our recycler view.
                        recyclerView.setAdapter(recyclerViewAdapter);
                    }
                }



            }

            @Override
            public void onFailure(Call<List<Root>> call, Throwable t) {

            }


        });
    }

}