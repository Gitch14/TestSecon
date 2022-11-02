import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProxySourcesClientService implements ProxySourcesClient
{
    private final ObjectMapper objectMapper = new ObjectMapper();

    public ProxySourcesClientService()
    {
    
    }
    
    @Override
    public Proxy getProxy() {
        List<Proxy> proxyList = new ArrayList<>();
        try {
            URL url = this.getClass().getClassLoader().getResource("D:\\VPNv1\\src\\main\\resources\\Proxy.json");
            if (url != null) {
                File file = new File(url.toURI());
                proxyList.addAll(List.of(objectMapper.readValue(file, Proxy[].class)));
                file = new File(url.toURI());
            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }


        Random random = new Random();
        int randProxy = random.nextInt(proxyList.size());

        return new Proxy(proxyList.get(randProxy));
    }
}

