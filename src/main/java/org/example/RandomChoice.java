package org.example;

import java.util.Random;

public class RandomChoice {

    public Proxy proxy(Random random, ProxySourcesClientService proxySourcesClientService){
        proxySourcesClientService.execute();
        int randNetwork = random.nextInt(proxySourcesClientService.execute().size());
        System.out.println(proxySourcesClientService.execute().get(randNetwork));
        return proxySourcesClientService.execute().get(randNetwork);
    }
}
