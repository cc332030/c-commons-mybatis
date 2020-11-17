package com.c332030.mybatis.plugin;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;

import lombok.extern.slf4j.Slf4j;


/**
 * <p>
 * Description: AbstractInterceptor
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Slf4j
public abstract class AbstractInterceptor implements Interceptor {

    protected Properties properties;

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
