package com.zezai.dao;

import com.zezai.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper    //表示该接口实现mapper自动代理
public interface bookDao {
    @Select("select * from tbl_book")
     List<Book> getAll();
}
