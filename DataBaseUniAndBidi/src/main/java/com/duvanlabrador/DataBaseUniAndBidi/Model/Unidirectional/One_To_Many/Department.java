package com.duvanlabrador.DataBaseUniAndBidi.Model.Unidirectional.One_To_Many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "uni_department_one_to_many")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;
    @OneToMany
    @JoinColumn(name = "employee_id")
    private Set<Employee> employees;
}
