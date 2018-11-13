package com.baizhi;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class App {
    public static void  main(String[] args){
        SpringApplication.run(App.class,args);
    }

        @Bean
        public HttpMessageConverters fastjsonHttpMessageConverter(){
            System.out.println("aaaaaaaa");
        //定义一个转换消息的对象
            FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
     //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
            FastJsonConfig fastJsonConfig = new FastJsonConfig();
            fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
    //在转换器中添加配置信息
            fastConverter.setFastJsonConfig(fastJsonConfig);
            HttpMessageConverter<?> converter = fastConverter;
            return new HttpMessageConverters(converter);
        }


}
