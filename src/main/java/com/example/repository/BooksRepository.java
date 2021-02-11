package com.example.repository;
import com.example.model.*;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}
