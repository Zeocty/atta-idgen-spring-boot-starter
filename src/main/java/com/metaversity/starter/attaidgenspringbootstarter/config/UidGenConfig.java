package com.metaversity.starter.attaidgenspringbootstarter.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: uidgen配置类
 * @Title: UidGenConfig
 * @Package com.metaversity.attaidgenspringbootstater.config
 * @Author: Zeocty
 * @Copyright zeocty@gmail.com
 * @CreateTime: 2023/4/26 15:00
 */
@ComponentScan(basePackages = {"com.metaversity.starter.attaidgenspringbootstarter"})
//@Configuration(proxyBeanMethods = false)
//// 当存在某个类时，此自动配置类才会生效
//@ConditionalOnClass(value = {HelloService.class})
// 导入我们自定义的配置类,供当前类使用
@EnableConfigurationProperties(value = {UidGenProperties.class})
//@EnableConfigurationProperties(value = )
//// 只有非web应用程序时此自动配置类才会生效
//@ConditionalOnWebApplication
//判断atta.config.flag的值是否为“true”， matchIfMissing = true：没有该配置属性时也会正常加载
@MapperScan(value = {"com.metaversity.starter.attaidgenspringbootstarter.worker.dao"})
//@ConditionalOnProperty(prefix = "atta.config", name = "flag", havingValue = "true", matchIfMissing = true)
public class UidGenConfig {
}
