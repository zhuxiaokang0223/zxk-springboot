package com.zxk.springboot.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @Description: Base64
 * @Author: zhuxiaokang
 * @CreateDate: 2019/7/30 10:59
 * @Version: 1.0
 */
public class Base64Util {

    /**
     * OAuth2 编码
     * @param clientId  客户端id
     * @param clientSecret 客户端密码
     */
    public static String encoder(String clientId, String clientSecret) throws UnsupportedEncodingException {
        String text = clientId + ":" + clientSecret;
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] textByte = text.getBytes("UTF-8");
        String encodedText = encoder.encodeToString(textByte);
        return encodedText;
    }

    /**
     * 解码
     * @param encoderStr  编码后的字符串
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String decoder(String encoderStr) throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encoderStr), "UTF-8");
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        String clientId = "asdfdsfds";
        String clientSecret = "ggerewr42134";
        // 编码
        String encoderStr = encoder(clientId, clientSecret);
        System.err.println("编码：" + encoderStr);
        // 解码
        String decoderStr = decoder(encoderStr);
        System.err.println("解码：" + decoderStr);
    }
}
