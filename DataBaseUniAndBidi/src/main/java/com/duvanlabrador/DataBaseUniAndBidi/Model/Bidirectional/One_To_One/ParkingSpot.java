package com.duvanlabrador.DataBaseUniAndBidi.Model.Bidirectional.One_To_One;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bi_parking_spot_one_to_one")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parking_spot_id")
    private Long parkingSpotId;
    @OneToOne(mappedBy = "parkingSpot")
    private Employee employee;
}
