package com.carry.service;


import com.carry.dao.BaiduNewsDao;
import com.carry.pojo.BaiduNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BaiDuNewsServiceImpl implements BaiDuNewsService{

    @Autowired
    BaiduNewsDao baiduNewsDao;
    @Override
    @Transactional
    public void save(BaiduNews baiduNews) {
        baiduNewsDao.save(baiduNews);
    }
}
