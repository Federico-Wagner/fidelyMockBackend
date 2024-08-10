package com.example.fidely.service;

public class ServerTweaks {
    static int DEFAULT_SERVER_DELAY = 500;
    public static void simulateServerDelay() {
        simulateServerDelay(DEFAULT_SERVER_DELAY);
    }
    public static void simulateServerDelay(int delay) {
        try {
            Thread.sleep(delay);
        }catch (Exception e){
            System.out.println("error al simulat delay");
        }
    }
}
