package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ProxySourcesClientService proxySourcesClientService = new ProxySourcesClientService();
        proxySourcesClientService.execute();
        RandomChoice randomChoice = new RandomChoice();
        randomChoice.proxy(new Random(),proxySourcesClientService);


    }
}
