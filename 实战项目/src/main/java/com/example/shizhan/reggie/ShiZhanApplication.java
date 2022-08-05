package com.example.shizhan.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j // 1、省略类的get set方法 2、加上注解之后可以直接使用log这个变量
@SpringBootApplication
@ServletComponentScan  // 扫描到创建好的loginCheckFilter
@EnableTransactionManagement
public class ShiZhanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiZhanApplication.class, args);
        log.info("项目启动成功");//输出日志
        log.info("自动装配成功");
    }

}
