package entitiescontinue1.entitiescontnue2;

import entitiescontinue1.entitiescontnue2.beans.Book;
import entitiescontinue1.entitiescontnue2.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles(profiles = "dev")
class BookTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
    }
//
//    @Test
//    void createBook(){
//        Book book = bookRepository.save(new Book("Only fear Dies"));
//        System.out.println(book);
//    }
//
//    @Test
//    void update(){
//        Book book = bookRepository.save(new Book(1L, "The Power of now"));
//        System.out.println(book);
//    }

    @Test
    void findByID(){
        Book book = bookRepository.findByID(2L);
        System.out.println(book);
    }

    @Test
    void findByName(){
        Book book = bookRepository.getByName("The Power of Now");
        System.out.println(book);
    }

    @Test
    void findAll(){
        List<Book> bookList = bookRepository.getAll();
        bookList.forEach(System.out::println);
    }

    @Test
    void findByNameNative(){
        Book book = bookRepository.finByNameNative("The Power of Now");
        System.out.println(book);
    }

    @Test
    void getAllNamedQuery(){
        List<Book> bookList = bookRepository.findAllNamedQuery();
        bookList.forEach(System.out::println);
    }
}
