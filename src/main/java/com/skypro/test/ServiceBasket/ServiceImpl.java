package com.skypro.test.ServiceBasket;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import com.skypro.test.ServiceBasket.Interfaces.ServiceShop;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class ServiceImpl implements ServiceBasketInterface {


    private final Set<String> basket = new HashSet<>();

    @Override
    public Set<String> add(Set<String> id) {
        basket.addAll(id);
        return basket;
    }

    @Override
    public Set<String> get() {
        return basket;
    }

}
