package entitiescontinue1.entitiescontnue2.repositories;


import entitiescontinue1.entitiescontnue2.beans.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public class BookRepository {
    private EntityManager entityManager;

    @Autowired
    public BookRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Book save(Book book){
        if (book.getId() == null){
            entityManager.persist(book);
        }else {
            entityManager.merge(book);
        }
        return book;
    }

    public Book findByID(Long id){
      return entityManager.find(Book.class, id);
    }

    public Book getByName(String name){
        TypedQuery<Book> byName = entityManager
                .createQuery("SELECT b from Book b where b.name = :name", Book.class);
        return byName.setParameter("name", name).getSingleResult();

    }

    public List<Book> getAll(){
        TypedQuery<Book> all = entityManager.createQuery("select b from Book b", Book.class);
        List<Book> bookList = all.getResultList();
        return bookList;
    }

    public Book finByNameNative(String name){
        Query byname = entityManager.createNativeQuery("select * from Book where name = :name", Book.class)
                .setParameter("name", name);
        return (Book) byname.getSingleResult();
    }

    public List<Book> findAllNamedQuery(){
        return entityManager.createNamedQuery("findAll", Book.class).getResultList();
    }
}
