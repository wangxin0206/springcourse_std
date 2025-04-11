package org.itforjava.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.itforjava.entity.Category;

@Mapper
public interface CategoryMapper {
    @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time) values(#{categoryName},#{categoryAlias},#{createUser},now(),now()) ")
    void add(Category category);
}
