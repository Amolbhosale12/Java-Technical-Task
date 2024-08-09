package com.multigenesys.Backend_Technical_Test.Repository;

import com.multigenesys.Backend_Technical_Test.Entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {}