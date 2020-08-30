package com.zhazhahui.web;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhaYongchao
 * @PackageName com.zhazhahui.web
 * @Description
 * @create 2020-07-19 17:21
 */
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {

        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
