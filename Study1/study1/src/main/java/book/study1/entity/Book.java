package book.study1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "books")
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String author;

    @Column(length = 1000)
    private String description;

}
