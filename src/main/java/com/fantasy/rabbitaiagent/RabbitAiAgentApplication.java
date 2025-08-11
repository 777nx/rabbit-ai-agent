package com.fantasy.rabbitaiagent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.ai.autoconfigure.vectorstore.pgvector.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        PgVectorStoreAutoConfiguration.class,
        // 为了便于大家开发调试和部署，取消数据库自动配置，需要使用 PgVector 时把 DataSourceAutoConfiguration.class 删除
        DataSourceAutoConfiguration.class
})
@MapperScan("com.fantasy.rabbitaiagent.mapper")
public class RabbitAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitAiAgentApplication.class, args);
    }

}
