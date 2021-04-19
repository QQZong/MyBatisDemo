package com.qin.mapper;

import com.qin.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    List<Book> getBookList();

    int addBook(Book book);

    /*模糊查询*/
    List<Book> queryBookBlurry(Map map);
}
