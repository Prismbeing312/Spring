package entitiescontinue1.entitiescontnue2.beans;

import javax.persistence.*;

@Entity
@Table(name = "Book")
@NamedQueries({
        @NamedQuery( name = "findAll" , query = "SELECT b from Book b")
})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name")
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
