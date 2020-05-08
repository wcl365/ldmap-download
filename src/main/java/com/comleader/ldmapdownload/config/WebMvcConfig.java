package com.comleader.ldmapdownload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName WebMvcConfig
 * @Description: WebMvcConfig配置类(设置地图资源静态路径)
 * @Author zhanghang
 * @Date 2020/4/14
 * @Version V1.0
 **/
@Configuration
@PropertySource(value = {"classpath:config/download-map.properties"}, encoding = "UTF-8")
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Value("${file.mapImgPath}")
    private String mapImgPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file:/"+ mapImgPath +"/");
        System.out.println("END >> file:/"+ mapImgPath +"/");
    }

}
