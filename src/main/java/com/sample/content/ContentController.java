package com.sample.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping("/health")
    public ResponseEntity getServiceHealth() {
        return contentService.getHealthReport();
    }
}
