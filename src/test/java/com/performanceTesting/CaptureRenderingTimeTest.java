package com.performanceTesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CaptureRenderingTimeTest {

    @Test
    public void testCapturePageRenderingTime() {
        String url = "http://example.com"; // Replace with the test URL
        long renderingTime = CaptureRenderingTime.capturePageRenderingTime(url);

        // Assume a reasonable threshold for the rendering time (e.g., 5000 ms for React Apps)
        long threshold = 5000;
        assertTrue("Page rendering time is greater than the threshold", renderingTime < threshold);
    }
}
