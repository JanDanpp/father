package com.miu.dao;

import com.miu.entity.EntityTest;

public class DaoTest {

    public String showDao(){
        //传建EntityTest对象
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntityTest()+"我是Dao";
    }
}
