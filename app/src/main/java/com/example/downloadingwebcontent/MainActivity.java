package com.example.downloadingwebcontent;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadTask task = new DownloadTask();

        try{
            String result = task.execute("https://www.w3schools.com/css/css_grid_item.asp").get();
            Log.i("Result", result);

        }catch (InterruptedException e) {
            Log.i("Result", "Cannot get url");
            e.printStackTrace();
        }catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
