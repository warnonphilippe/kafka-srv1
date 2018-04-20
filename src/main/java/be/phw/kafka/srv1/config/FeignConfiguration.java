package be.phw.kafka.srv1.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "be.phw.kafka.srv1")
public class FeignConfiguration {

}
