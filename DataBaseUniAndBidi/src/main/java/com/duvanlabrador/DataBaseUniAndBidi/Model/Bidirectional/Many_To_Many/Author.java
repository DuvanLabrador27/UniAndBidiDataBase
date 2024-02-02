package com.duvanlabrador.DataBaseUniAndBidi.Model.Bidirectional.Many_To_Many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "bi_author_many_to_many")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

}
