package com.hquery.blog.util;

import com.hquery.blog.constant.Constants;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * @author hquery.huang
 * 2018/1/22 21:42
 */
public class SecurityUtil {

    public static void main(String[] args) throws Exception {
        System.out.println(encoderByMd5("admin"));
    }

    /**
     * 利用MD5进行加密
     * 　　* @param str  待加密的字符串
     * 　　* @return  加密后的字符串
     * 　　* @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
     * 　　* @throws UnsupportedEncodingException
     */
    public static String encoderByMd5(String str) throws Exception {
        //计算方法MD5
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密字符串
        return base64en.encode(md5.digest(str.getBytes(Constants.CHARSET_UTF8)));
    }

    /**
     * 检查密码
     * @param inputPassword 用户输入的密码
     * @param dbPassword 数据库存储的密码
     * @return
     * @throws Exception
     */
    public static Boolean checkoutPassword(String inputPassword, String dbPassword) throws Exception {
        if (!StringUtil.areNotEmpty(inputPassword, dbPassword)) {
            return false;
        }
        return encoderByMd5(inputPassword).equals(dbPassword);
    }

}
