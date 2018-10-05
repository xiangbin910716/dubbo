package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>TODO</p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jixd
 * @version 1.0
 * @Date Created in 2018年01月31日 17:07
 * @since 1.0
 */
public class ExtendLoaderTest {

    public static void main(String[] args) {

//        Set<String> supportedExtensions = ExtensionLoader.getExtensionLoader(Protocol.class).getSupportedExtensions();
//        System.out.println(supportedExtensions);


        SayHello sayHello = ExtensionLoader.getExtensionLoader(SayHello.class).getAdaptiveExtension();
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("CHO","A");
        URL url = new URL("dubbo","127.0.0.1",8089,paramMap);
        sayHello.sayHello(url);
    }

}
