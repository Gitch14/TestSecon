package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProxySourcesClientService
{
    private final ObjectMapper objectMapper = new ObjectMapper();

    public ProxySourcesClientService()
    {
    
    }
    

    public List<Proxy> execute(){

            List<Proxy> langList = null;

        try {
            langList = objectMapper.readValue(
                    new File("D:\\untitled3\\src\\main\\resources\\Proxy.json"),
                    new TypeReference<List<Proxy>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       // langList.forEach(x -> System.out.println(x.toString()));

        return langList;
        }

}

