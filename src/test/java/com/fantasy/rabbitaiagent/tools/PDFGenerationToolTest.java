package com.fantasy.rabbitaiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PDFGenerationToolTest {

    @Test
    void generatePDF() {
        PDFGenerationTool pdfGenerationTool = new PDFGenerationTool();
        String fileName = "贝果研究家.pdf";
        String content = "贝果研究家 https://www.777nx.cn";
        String result = pdfGenerationTool.generatePDF(fileName, content);
        assertNotNull(result);
    }
}