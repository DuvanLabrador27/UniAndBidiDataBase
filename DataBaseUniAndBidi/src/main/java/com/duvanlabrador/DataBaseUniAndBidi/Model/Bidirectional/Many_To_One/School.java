package com.duvanlabrador.DataBaseUniAndBidi.Model.Bidirectional.Many_To_One;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "bi_school_many_to_one")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private Long schoolId;
    @OneToMany(mappedBy = "school")
    private Set<Student> students;

}
