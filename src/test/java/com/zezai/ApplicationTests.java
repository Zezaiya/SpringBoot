package com.zezai;

import com.zezai.dao.BookDao;
import com.zezai.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest   //注意,该类必须要在Application所在的子包内,不然无法扫描到,如果不在则需要再该注解后添加(classes=applicant)即可
class ApplicationTests {
    @Autowired
    private BookDao bookDao;

    private BookService bookService;

    @Test
    public void getById() {
        System.out.println(bookDao.getById(2));
    }

}