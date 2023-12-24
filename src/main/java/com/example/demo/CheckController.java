package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckController {

    @GetMapping("/check")
    public ResponseEntity<HttpStatus> test() {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}