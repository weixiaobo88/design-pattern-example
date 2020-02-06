package com.example.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer instance = null;
    private List<String> servers = null;

    private LoadBalancer() {
        servers = new ArrayList<String>();
    }

    public static LoadBalancer getInstance() {
        if(instance == null) {
            instance = new LoadBalancer();
        }

        return instance;
    }

    public void addServer(String server) {
        servers.add(server);
    }

    public void removeServer(String server) {
        servers.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int index = random.nextInt(servers.size());
        return (String)servers.get(index);
    }
}
