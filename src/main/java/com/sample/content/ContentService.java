package com.sample.content;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    public ResponseEntity getHealthReport() {
        return ResponseEntity.ok("Content service running");
    }
}
