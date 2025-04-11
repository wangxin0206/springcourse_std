package org.itforjava.service.impl;

import org.itforjava.entity.Category;
import org.itforjava.mapper.CategoryMapper;
import org.itforjava.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }
}
