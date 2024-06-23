package com.skypro.test.ServiceBasket;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import com.skypro.test.ServiceBasket.Interfaces.ServiceShop;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ServiceBasketImpl implements ServiceShop {

    ServiceBasketInterface serviceBasketInterface;

    public ServiceBasketImpl(ServiceBasketInterface serviceBasketInterface) {
        this.serviceBasketInterface = serviceBasketInterface;
    }

    @Override
    public Set<String> add(Set<String> id) {
        return serviceBasketInterface.add(id);
    }

    @Override
    public Set<String> get() {
        return serviceBasketInterface.get();
    }

}
