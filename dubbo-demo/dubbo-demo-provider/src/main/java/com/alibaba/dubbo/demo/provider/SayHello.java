package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

import java.net.URL;

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
 * @Date Created in 2018年02月01日 14:38
 * @since 1.0
 */
@SPI("A")
public interface SayHello {

    @Adaptive({"A","B"})
    void sayHello(URL url);

}
