package com.fantasy.rabbitaiagent.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResourceDownloadToolTest {

    @Test
    void downloadResource() {
        ResourceDownloadTool resourceDownloadTool = new ResourceDownloadTool();
        String url = "https://www.777nx.cn/logo.png";
        String fileName = "logo.png";
        String result = resourceDownloadTool.downloadResource(url, fileName);
        assertNotNull(result);
    }
}