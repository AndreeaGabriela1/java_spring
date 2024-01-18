package com.launchlibrary.libraryspring.data;


import com.launchlibrary.libraryspring.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {
}

