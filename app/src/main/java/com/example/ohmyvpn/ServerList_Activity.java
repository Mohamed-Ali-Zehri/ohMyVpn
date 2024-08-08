package com.example.ohmyvpn;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ohmyvpn.Adapter.ServerListAdapter;
import com.example.ohmyvpn.Model.Servers;

import java.util.ArrayList;

public class ServerList_Activity extends AppCompatActivity {
    RecyclerView ServerRecyclerView;
    ArrayList<Servers> ServerList;
    ServerListAdapter serverListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_list);
        ServerRecyclerView = findViewById(R.id.ServerRV);



        ServerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ServerList = getServerList();
        if(ServerList != null){
            serverListAdapter = new ServerListAdapter(this,ServerList);
            ServerRecyclerView.setAdapter(serverListAdapter);

        }

    }

    private ArrayList<Servers> getServerList() {
        ArrayList<Servers> servers = new ArrayList<>();
        servers.add(new Servers("jpan",Utilies.getImageUrl(R.drawable.jpan),"jpan.ovpn","vpn","vpn"));
        servers.add(new Servers("korea",Utilies.getImageUrl(R.drawable.korea),"korea.ovpn","vpn","vpn"));
        servers.add(new Servers("usa",Utilies.getImageUrl(R.drawable.usa),"usa.ovpn","vpn","vpn"));
        return  servers;
    }
}