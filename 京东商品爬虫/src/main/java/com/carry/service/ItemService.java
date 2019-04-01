package com.carry.service;

import com.carry.pojo.Item;

import java.util.List;

public interface ItemService {

    /**
     * 保存商品
     */
    void save(Item item);
    /**
     * 查询商品
     */
    List<Item> findAll(Item item);
}
