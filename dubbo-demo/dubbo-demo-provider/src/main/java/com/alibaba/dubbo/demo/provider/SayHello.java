package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;


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
@SPI("B")
public interface SayHello {

    @Adaptive("CHO")
    void sayHello(URL url);


}
