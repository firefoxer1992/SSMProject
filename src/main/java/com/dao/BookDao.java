package com.dao;

import com.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List selectAllBooks();

    List selectPageBooks(@Param("nowPage") int nowPage, @Param("limitPage")  int limitPage);
}