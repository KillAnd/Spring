package com.skypro.test.ServiceBasket;

import com.skypro.test.ServiceBasket.Interfaces.ServiceBasketInterface;
import com.skypro.test.ServiceBasket.Interfaces.ServiceShop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBasketImpl implements ServiceShop {

    ServiceBasketInterface serviceBasketInterface;

    public ServiceBasketImpl(ServiceBasketInterface serviceBasketInterface) {
        this.serviceBasketInterface = serviceBasketInterface;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return serviceBasketInterface.add(id);
    }

    @Override
    public List<Integer> get() {
        return serviceBasketInterface.get();
    }

}
