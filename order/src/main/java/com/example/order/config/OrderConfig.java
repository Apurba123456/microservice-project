package com.example.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class OrderConfig {
@Bean
 RestTemplate getRestTemplate()
{
	return new RestTemplate();
	}
}
