package kylinno.legalwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApplication.java
 * <p/>
 * Copyright 2018 北京律智通科技有限公司
 * <p/>
 * <p/>
 * 下一代律所管理SaaS系统
 *
 * @author shuf@kylinno.com
 * @date 19/09/18.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
