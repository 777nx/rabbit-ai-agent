package com.fantasy.rabbitaiagent;

import com.fantasy.rabbitaiagent.rag.PgVectorVectorStoreConfig;
import org.springframework.ai.autoconfigure.vectorstore.pgvector.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PgVectorStoreAutoConfiguration.class)
public class RabbitAiAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitAiAgentApplication.class, args);
    }

}
