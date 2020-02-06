package com.example.designpattern.singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1;
        balancer1 = LoadBalancer.getInstance();

        balancer1.addServer("Server1");
        balancer1.addServer("Server2");
        balancer1.addServer("Server3");
        balancer1.addServer("Server4");

        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
