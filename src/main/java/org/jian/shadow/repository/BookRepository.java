package org.jian.shadow.repository;

import org.jian.shadow.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, String>, PagingAndSortingRepository<Book, String> {

    Page<Book> findBooksByClassify(String classify, Pageable pageable);

    Page<Book> findBooksByNameIsLike(String name, Pageable pageable);
}
