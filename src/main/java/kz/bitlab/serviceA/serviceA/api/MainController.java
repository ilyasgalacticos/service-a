package kz.bitlab.serviceA.serviceA.api;

import kz.bitlab.serviceA.serviceA.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class MainController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<String> getItems(){
        return itemService.getItems();
    }
}