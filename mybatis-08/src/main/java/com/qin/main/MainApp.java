package com.qin.main;

import com.qin.entity.Book;
import com.qin.mapper.BookMapper;
import com.qin.tool.IDTool;
import com.qin.tool.MyBatisTool;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisTool.getSqlSession();
        HashMap map = new HashMap();
        map.put("bookname","Java就是Easy");
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = mapper.queryBookBlurry(map);
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
