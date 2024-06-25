package com.skypro.test.ServiceBasket;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class ServiceImpl implements ServiceBasketInterface {


    private final List<Integer> basket = new ArrayList<>();

    @Override
    public List<Integer> add(List<Integer> id) {
        basket.addAll(id);
        return basket;
    }

    @Override
    public List<Integer> get() {
        return basket;
    }

}
