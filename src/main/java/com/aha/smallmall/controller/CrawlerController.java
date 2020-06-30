package com.aha.smallmall.controller;

import com.aha.smallmall.result.Response;
import com.aha.smallmall.result.ResponseBuilder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CrawlerController {

    @GetMapping("/crawldata")
    public Response hello() {
        log.info("CrawlerController begins");
        return ResponseBuilder.ok().putMessage("Hello! >A< ").build();
    }
}
