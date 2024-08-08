package com.multigenesys.Backend_Technical_Test.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactInfo;
    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
