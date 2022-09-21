package com.dicraft.oss.utils;

import java.util.Map;

/**
 * @author: DiCraft
 * @Date: 2022/9/21 14:53
 * @package: com.dicraft.oss.utils
 * @Version: 1.0
 * @Decsription: 字符串常用工具类
 */
public class StringUtils {

    /**
     * 判断是否为空字符
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        return str==null || "".equals(str);
    }


    /**
     * 将MAP转换成一个xml格式，格式为<xml><key>value</key>...</xml>
     * @param params
     * @return
     */
    public static String mapToXml(Map<String, String> params){
        StringBuffer sb = new StringBuffer("<xml>");
        for(String key:params.keySet()){
            sb.append("<")
                    .append(key).append(">")
                    .append(params.get(key))
                    .append("</").append(key).append(">");
        }

        sb.append("</xml>");
        return sb.toString();
    }
}
