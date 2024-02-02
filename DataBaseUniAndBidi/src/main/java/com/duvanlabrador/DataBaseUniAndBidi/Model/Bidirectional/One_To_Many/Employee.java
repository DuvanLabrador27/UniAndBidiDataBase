package com.duvanlabrador.DataBaseUniAndBidi.Model.Bidirectional.One_To_Many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bi_employee_one_to_many")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
