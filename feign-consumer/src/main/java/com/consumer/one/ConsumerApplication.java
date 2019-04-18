package com.consumer.one;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启Spring Cloud Feign 功能
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
	/**
	 * 设置全局日志级别
	 * NONE:不记录任何记录 ；
	 * BASIC： 仅记录请求方法 ；
	 * HEADERS： 在BASIC 基础上还会记录请求头和相应头信息；
	 * FULL ：记录所有请求与相应明细 包括头信息 请求体 元数据等。
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
