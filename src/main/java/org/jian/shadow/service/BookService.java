package org.jian.shadow.service;

import org.jian.shadow.domain.Book;
import org.jian.shadow.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public List<Book> findAll(){
        if(bookRepository.count() == 0)return new ArrayList<Book>();
        return (List<Book>)bookRepository.findAll();
    }

    public Page<Book> findBooksByClassify(String classify, Pageable pageable){
        return bookRepository.findBooksByClassify(classify, pageable);
    }

    public Page<Book> findBooksByNameIsLike(String name, Pageable pageable){
        return bookRepository.findBooksByNameIsLike("%"+name+"%", pageable);
    }
}
