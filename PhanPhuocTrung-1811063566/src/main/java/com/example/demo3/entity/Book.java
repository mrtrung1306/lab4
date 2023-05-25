package com.example.demo3.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="price")
    private Double price;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

//    public  Book(){
//
//    }
//    public Book(Long id, String title, String author, Double price, String category) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//        this.category = category;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
}
