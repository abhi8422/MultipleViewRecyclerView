package com.example.multipleviewrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Model> list=new ArrayList<>();

    public RecyclerAdapter(ArrayList<Model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType){
            case 0:view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_date,parent,false);
            return new DateViewHolder(view);
            case 1:view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);
                return new InfoViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Model model=list.get(position);
        switch (model.getModeltype()){
            case "Date":((DateViewHolder)holder).date.setText(model.getDate());
            break;
            case "Desc":((InfoViewHolder)holder).name.setText(model.getName());
                        ((InfoViewHolder)holder).desc.setText(model.getDesc());
                        break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        String type=list.get(position).getModeltype();
        switch (type) {
            case "Date":
                return 0;
            case "Desc":
                return 1;
            default:
                return -1;
        }
    }

    public class DateViewHolder extends RecyclerView.ViewHolder{
        TextView date;
        public DateViewHolder(@NonNull View itemView) {
            super(itemView);
            date=itemView.findViewById(R.id.txt_date);
        }
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder{
        TextView name,desc;
        public InfoViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txt_name);
            desc=itemView.findViewById(R.id.txt_desc);
        }
    }
}
