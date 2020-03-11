package edu.niit.spring.config.web;

import edu.niit.spring.config.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WU, Homer
 * @version 1.0
 * @date 2020/3/11 8:57
 */
@RestController
public class DemoController {
    @Autowired
    private Book book;
    @GetMapping("/hello")
    public String hello(){
        return "hello, https";
    }

    @GetMapping("/book")
    public String book(){
        return book.toString();
    }
}
