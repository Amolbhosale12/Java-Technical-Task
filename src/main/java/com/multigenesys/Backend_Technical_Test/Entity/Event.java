package com.multigenesys.Backend_Technical_Test.Entity;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private LocalDate eventDate;
    private String description;
    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;
    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;
}
