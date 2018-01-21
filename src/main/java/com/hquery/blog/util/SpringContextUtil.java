package com.hquery.blog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author hquery.huang
 * 2018/1/21 17:45
 */
public class SpringContextUtil implements ApplicationContextAware {

    private static Logger logger = LoggerFactory.getLogger(SpringContextUtil.class);

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext != null) {
            logger.warn("SpringContextUtils中的ApplicationContext被覆盖, 原有ApplicationContext为:" + applicationContext);
        }
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        assertContextInjected();
        return applicationContext;
    }

    public static Object getBean(String name) {
        assertContextInjected();
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) {
        assertContextInjected();
        return applicationContext.getBean(requiredType);
    }

    private static void assertContextInjected() {
        if (applicationContext == null) {
            throw new RuntimeException("applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextUtils,同时set lazy-init is false.");
        }
    }
}
