package com.duvanlabrador.DataBaseUniAndBidi.Model.Bidirectional.One_To_Many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "bi_department_one_to_many")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
}
