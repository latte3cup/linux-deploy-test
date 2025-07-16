package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {
    private final JdbcTemplate jdbcTemplate;

    public demoController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello World! - Linux";
    }

    @ResponseBody
    @GetMapping("/greeting")
    public String greeting(@RequestParam String lang) {
        String sql = "SELECT message FROM greetings WHERE lang_code = ?";
        return jdbcTemplate.queryForObject(sql, String.class, lang);

    }
}
