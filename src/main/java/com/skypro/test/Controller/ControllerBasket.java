package com.skypro.test.Controller;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import com.skypro.test.ServiceBasket.Interfaces.ServiceShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerBasket {

    ServiceShop serviceShop;

    public ControllerBasket(ServiceShop serviceShop) {
        this.serviceShop = serviceShop;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
        return serviceShop.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return serviceShop.get();
    }
}
