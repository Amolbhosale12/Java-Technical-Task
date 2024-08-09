package com.multigenesys.Backend_Technical_Test.Repository;

import com.multigenesys.Backend_Technical_Test.Entity.Event;
import com.multigenesys.Backend_Technical_Test.Entity.Organizer;
import com.multigenesys.Backend_Technical_Test.Entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByVenue(Venue venue);
    List<Event> findByOrganizer(Organizer organizer);
}
