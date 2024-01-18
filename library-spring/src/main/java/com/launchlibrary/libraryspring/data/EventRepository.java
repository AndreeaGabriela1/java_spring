package com.launchlibrary.libraryspring.data;


import com.launchlibrary.libraryspring.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}

