package kylinno.legal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * EurekaClientApplication.java
 * <p/>
 * Copyright 2018 北京律智通科技有限公司
 * <p/>
 * <p/>
 * 下一代律所管理SaaS系统
 *
 * @author shuf@kylinno.com
 * @date 19/09/18.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
