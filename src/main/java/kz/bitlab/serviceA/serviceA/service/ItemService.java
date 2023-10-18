package kz.bitlab.serviceA.serviceA.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    public List<String> getItems(){
        return Arrays.asList("Iphone", "XIAOMI", "NOKIA", "MEIZU");
    }

}
