package com.example.myjetpack;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.myjetpack.databinding.LayoutBinding;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyviewHolder> {
    public List<DataModel> datalist;
    Context context;
    public RecyclerAdapter(List<DataModel>datalist,Context ctx){
        this.datalist=datalist;
        this.context=ctx;
    }
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutBinding binding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.layout,parent,false);
        return new MyviewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyviewHolder holder, int position) {
            DataModel datamodel=datalist.get(position);
        holder.layoutBinding.setModel(datamodel);
        holder.bind(datamodel);
    }



    @Override
    public int getItemCount() {
        return datalist.size();
    }
    public class MyviewHolder extends ViewHolder{
        public LayoutBinding layoutBinding;
        public MyviewHolder(LayoutBinding layoutBinding){
            super(layoutBinding.getRoot());
            this.layoutBinding=layoutBinding;

        }
        public void bind(Object object){
            layoutBinding.setVariable(BR.model,object);
            layoutBinding.executePendingBindings();

        }
    }
}
