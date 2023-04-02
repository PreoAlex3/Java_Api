package com.example.spring;

//Using Log4j with Maven, write a Spring application with two endpoints (2 urls). Each endpoint writes in the log (using log4j) the data received as a parameter
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class Log4j {
    private static final Logger logger = LogManager.getLogger(Log4j.class);

    @GetMapping("/endpoint1/{param}")
    public String endpoint1(@PathVariable String param) {
        logger.info("Endpoint 1 called with param: {}", param);
        return "Endpoint 1 called with param: " + param;
    }

    @GetMapping("/endpoint2/{param}")
    public String endpoint2(@PathVariable String param) {
        logger.info("Endpoint 2 called with param: {}", param);
        return "Endpoint 2 called with param: " + param;
    }
}
