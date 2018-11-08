package com.galvanize.playground;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface LessonRepository extends CrudRepository<Lesson, Date> {

}
