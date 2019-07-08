package com.example.myjetpack;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class DataModel extends BaseObservable {
    String text1,text2;
    Context context;
    public DataModel(){

    }

    public DataModel(String text1,String text2) {
    this.text1=text1;
    this.text2=text2;
    }

    public void DataModel(String text1,String text2){
        this.text1=text1;
        this.text2=text2;
    }
    @Bindable
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
        notifyPropertyChanged(BR.myAdapter);
    }
    @Bindable
    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
        notifyPropertyChanged(BR.myAdapter);
    }
}
