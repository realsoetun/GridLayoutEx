package com.example.gridlayout.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gridlayout.R;
import com.example.gridlayout.ShopData;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopViewHolder> {

    private Context mContext;
    private List<ShopData> shopList;

    public ShopAdapter(Context mContext, List<ShopData> shopList) {
        this.mContext = mContext;
        this.shopList = shopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View shopView= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ShopViewHolder(shopView);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder,final int position) {
        holder.btn1.setText(Integer.toString(shopList.get(position).getShopDiscount())+"% OFF");

        if (shopList.get(position).getItemType().equals("new")){
            holder.btn2.setText(shopList.get(position).getItemType());
        }else {
            holder.btn2.setVisibility(View.INVISIBLE);
        }
        holder.imageView.setImageResource(shopList.get(position).getShopImage());
        holder.name.setText(shopList.get(position).getShopName());
        holder.category.setText(shopList.get(position).getShopCategory());
        holder.rating.setRating(shopList.get(position).getShopRating());

        holder.price2.setText(Integer.toString(shopList.get(position).getShopPrice())+" Ks");
        double discount=(double) shopList.get(position).getShopDiscount();
        double dprice=shopList.get(position).getShopPrice()-(shopList.get(position).getShopPrice()*(discount)/100);
        int dpriceint=(int) Math.round(dprice);
        holder.price1.setText(Integer.toString(dpriceint)+"Ks");

    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }
}



class ShopViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    RatingBar rating;
    TextView name,category,price1,price2;
    Button btn1,btn2;

    public ShopViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.itemImage);
        name=itemView.findViewById(R.id.itemName);
        category=itemView.findViewById(R.id.itemCategory);
        rating=itemView.findViewById(R.id.itemRating);
        price1=itemView.findViewById(R.id.itemPrice1);
        price2=itemView.findViewById(R.id.itemPrice2);
        btn1=itemView.findViewById(R.id.btn1);
        btn2=itemView.findViewById(R.id.btn2);
    }
}

