package com.zezai.dao;

import com.zezai.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper    //表示该接口实现mapper自动代理
public interface BookDao {
    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    int save(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    int delete(Integer id);

    @Update("update tbl_book set name=#{name},type=#{type},description=#{description} where id=#{id}")
    int update(Book book);

    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}
