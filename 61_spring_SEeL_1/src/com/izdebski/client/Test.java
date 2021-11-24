package com.izdebski.client;

import com.izdebski.model.Book;
import com.izdebski.model.BookLibrary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        BookLibrary bookLibrary = ctx.getBean("bookLibrary", BookLibrary.class);

        List<Book> allBooks = bookLibrary.getAllBooks();

        for (Book book : allBooks){
            System.out.println(book.getBookId()+"\t"+book.getBookName());
        }
        System.out.println("--------------------------------------");
        Book book = bookLibrary.getGetFirstBook();

        System.out.println(book.getBookId()+"\t"+book.getBookName());
    }
}