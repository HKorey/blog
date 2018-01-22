package com.hquery.blog.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author hquery.huang
 * 2018/1/22 21:46
 */
public class StringUtil {

    /**
     * 一个为空，返回false
     * @param values
     * @return
     */
    public static boolean areNotEmpty(String ... values) {

        if (values != null && values.length != 0) {
            int len = values.length;
            for (int i = 0; i < len; i++) {
                if (StringUtils.isBlank(values[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
