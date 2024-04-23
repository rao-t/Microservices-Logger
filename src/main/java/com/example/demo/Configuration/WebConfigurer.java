package com.example.demo.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Interceptor.CartInterceptor;
import com.example.demo.Interceptor.UserInterceptor;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/users/**");
        registry.addInterceptor(new CartInterceptor()).addPathPatterns("/cart/**");
    }
}

