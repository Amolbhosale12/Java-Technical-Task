package com.multigenesys.Backend_Technical_Test.Repository;

import com.multigenesys.Backend_Technical_Test.Entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {

}
