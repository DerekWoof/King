package com.king;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Rafal on 2017-10-24.
 */
@Configuration
@ComponentScan(basePackages = "com.king")
@PropertySource(value = "classpath:app.properties")
public class AppConfig {


}
