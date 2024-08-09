package com.multigenesys.Backend_Technical_Test.Entity;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private LocalDate eventDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    @OneToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    // Getters and setters
}
