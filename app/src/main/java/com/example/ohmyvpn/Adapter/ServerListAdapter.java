package com.example.ohmyvpn.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ohmyvpn.Model.Servers;
import com.example.ohmyvpn.R;
import com.example.ohmyvpn.ServerList_Activity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ServerListAdapter extends RecyclerView.Adapter<ServerListAdapter.MyVieHolder>  {

    private Context context;
    private ArrayList<Servers> ServerList;


    // constructor


    public ServerListAdapter(Context context, ArrayList<Servers> serverList) {
        this.context = context;
        ServerList = serverList;
    }


    @NonNull
    @Override
    public MyVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.serverlayout,parent,false);
        return new MyVieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVieHolder holder, int position) {
        Servers servers=ServerList.get(position);
        holder.countryName.setText(ServerList.get(position).getServerCountry());
        Glide.with(context).load(servers.getFlagUrl()).into(holder.serverIcon);
    }

    @Override
    public int getItemCount() {
        return ServerList.size();

    }
    public class  MyVieHolder extends RecyclerView.ViewHolder{
        ImageView serverIcon,serverSignal;
        TextView countryName;
        public MyVieHolder(@NonNull View itemView) {
            super(itemView);
            serverIcon =itemView.findViewById(R.id.ServerIcon);
            serverSignal =itemView.findViewById(R.id.ServerSignal);
            countryName =itemView.findViewById(R.id.countryName);
        }
    }
}
