package com.suye.personalblog.mapping;

import com.suye.personalblog.model.Blog;
import com.suye.personalblog.model.Visitor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Suyeq
 * Date: 2018-12-20
 * Time: 19:36
 */
@Component
public interface VisitorMapping {
    @Select("select * from visitor")
    List<Visitor> getAllVisitor();

    @Select("select * from visitor where id=#{id}")
    Visitor findOneById(@Param("id")int id);

}