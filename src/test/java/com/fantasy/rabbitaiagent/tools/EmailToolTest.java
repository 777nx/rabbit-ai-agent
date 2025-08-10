package com.fantasy.rabbitaiagent.tools;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailToolTest {

    @Resource
    private EmailTool emailTool;

    @Test
    void sendHtmlEmail() {
        String to = "1362724990@qq.com";
        String subject = "HTML测试邮件";
        String htmlContent = "<h1>这是一封HTML测试邮件</h1><p>Hello World!</p>";
        String result = emailTool.sendHtmlEmail(to, subject, htmlContent);
        assertNotNull(result);
    }
}