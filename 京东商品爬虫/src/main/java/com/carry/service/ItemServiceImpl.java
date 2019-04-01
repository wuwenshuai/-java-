package com.carry.service;

import com.carry.dao.ItemDao;
import com.carry.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemDao itemDao;
    @Override
    @Transactional
    public void save(Item item) {
        itemDao.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {
        Example<Item> example = Example.of(item);
        List<Item> items = itemDao.findAll(example);
        return items;
    }
}
