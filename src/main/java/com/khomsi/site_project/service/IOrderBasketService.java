package com.khomsi.site_project.service;

import com.khomsi.site_project.entity.OrderBasket;
import com.khomsi.site_project.entity.User;

import java.util.List;

public interface IOrderBasketService {
    public List<OrderBasket> listOrderBasket(User user);
}
