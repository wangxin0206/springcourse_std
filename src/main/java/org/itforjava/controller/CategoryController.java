package org.itforjava.controller;


import org.itforjava.entity.Category;
import org.itforjava.entity.Result;
import org.itforjava.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {


    private CategoryService categoryService;
    /*
    * 添加文章分类
    * */
    @PostMapping("/add")
    public Result addCategory(Category category) {
        if(category!=null) {
            categoryService.add(category);
            return Result.success("添加成功");
        }else {
            return Result.error("");
        }
    }
}
