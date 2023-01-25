package com.pctmoraes.person.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PersonAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "id_person", nullable = false)
    private Long idPerson;

    @Column(name = "id_address", nullable = false)
    private Long idAddress;

    @Column(name = "main_address")
    private Boolean mainAddress;

}
