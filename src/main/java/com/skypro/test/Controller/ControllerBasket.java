package com.skypro.test.Controller;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import com.skypro.test.ServiceBasket.Interfaces.ServiceShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class ControllerBasket {

    ServiceShop serviceShop;

    public ControllerBasket(ServiceShop serviceShop) {
        this.serviceShop = serviceShop;
    }

    @GetMapping("/add")
    public Set<String> add(@RequestParam Set<String> id) {
        return serviceShop.add(id);
    }

    @GetMapping("/get")
    public Set<String> get() {
        return serviceShop.get();
    }
}
