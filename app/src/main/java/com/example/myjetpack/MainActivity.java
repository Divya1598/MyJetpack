package com.example.myjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myjetpack.databinding.ActivityMainBinding;
import com.example.myjetpack.databinding.LayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;
    List<DataModel> datalist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //LinearLayoutManager linearVertical = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        //binding.rvvv.setLayoutManager(linearVertical);
        List<DataModel> datalist = new ArrayList<>();
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        datalist.add(new DataModel("Team1", "Hello"));
        RecyclerAdapter adapter=new RecyclerAdapter(datalist,this);
        binding.setMyAdapter(adapter);



    }

}
