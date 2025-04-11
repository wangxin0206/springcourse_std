package org.itforjava.controller;

import org.itforjava.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {


    @GetMapping("/articleinfo")
    public Result getArticle() {

        return Result.success("");
    }
}
