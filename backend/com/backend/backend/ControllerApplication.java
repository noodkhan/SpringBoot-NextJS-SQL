package com.backend.backend;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from Next.js frontend
public class ControllerApplication {

    @RequestMapping("/api")
    public String requestMethodName() {
        return "hello From Spring Boot";
    }

    // GET request
    @GetMapping("/api/{id}")
    public ResponseEntity<String> getExample(@PathVariable Long id) {
        return ResponseEntity.ok("Fetched example with ID: " + id);
    }

    // POST request
    @PostMapping("/api/{id}")
    public ResponseEntity<String> createExample(@RequestBody Map<String, Object> requestBody) {

        System.out.println("Received user data: " + requestBody);
        HashMap<String, Object> userMap = new HashMap<>(requestBody);
        for (Map.Entry<String, Object> entry : userMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        return ResponseEntity.ok("Created example with data: " + requestBody);
    }

    // PUT request
    @PutMapping("/api/{id}")
    public ResponseEntity<String> updateExample(@PathVariable Long id, @RequestBody Map<String, Object> requestBody) {
        return ResponseEntity.ok("Updated example with ID " + id + " and data: " + requestBody);
    }

    // PATCH request
    @PatchMapping("/api/{id}")
    public ResponseEntity<String> patchExample(@PathVariable Long id, @RequestBody Map<String, Object> requestBody) {
        return ResponseEntity.ok("Patched example with ID " + id + " and changes: " + requestBody);
    }

    // DELETE request
    @DeleteMapping("/api/{id}")
    public ResponseEntity<String> deleteExample(@PathVariable Long id) {
        return ResponseEntity.ok("Deleted example with ID: " + id);
    }

}
