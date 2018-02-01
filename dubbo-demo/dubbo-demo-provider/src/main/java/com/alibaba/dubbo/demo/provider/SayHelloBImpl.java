package com.alibaba.dubbo.demo.provider;


import com.alibaba.dubbo.common.URL;

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
 * @Date Created in 2018年02月01日 14:53
 * @since 1.0
 */
public class SayHelloBImpl implements SayHello{

    @Override
    public void sayHello(URL url) {
        System.out.println("hello B");
    }
}
