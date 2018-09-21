package kylinno.legalwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * MovieApplication.java
 * <p/>
 * Copyright 2018 北京律智通科技有限公司
 * <p/>
 * <p/>
 * 下一代律所管理SaaS系统
 *
 * @author shuf@kylinno.com
 * @date 19/09/18.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }
}
