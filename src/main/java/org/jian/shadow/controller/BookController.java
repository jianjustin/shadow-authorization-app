package org.jian.shadow.controller;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.Book;
import org.jian.shadow.domain.Classify;
import org.jian.shadow.domain.view.BookQueryView;
import org.jian.shadow.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    public BookService bookService;

    @GetMapping(value="/book", produces = "application/json;charset=utf-8", consumes = "application/json;charset=utf-8")
    @PreAuthorize("hasAuthority('book.query')")
    @ShadowLog(description = "查询所有书籍")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @PostMapping(value = "/book/findBooksByClassify", produces = "application/json;charset=utf-8", consumes = "application/json;charset=utf-8")
    @PreAuthorize("hasAuthority('book.query')")
    @ResponseBody()
    @ShadowLog(description = "根据分类查询所有书籍")
    public Page<Book> findBooksByClassify(@RequestBody BookQueryView bookQueryView){
        PageRequest pageRequest = PageRequest.of(0,10);
        if(bookQueryView.getPage() >= 0 && bookQueryView.getSize() > 0)
            pageRequest = PageRequest.of(bookQueryView.getPage(),bookQueryView.getSize());
        return bookService.findBooksByClassify(bookQueryView.getClassify(), pageRequest);
    }

    @PostMapping(value = "/book/findBooksByNameIsLike", produces = "application/json;charset=utf-8", consumes = "application/json;charset=utf-8")
    @PreAuthorize("hasAuthority('book.query')")
    @ShadowLog(description = "根据标题查询所有书籍")
    public Page<Book> findBooksByNameIsLike(@RequestBody BookQueryView bookQueryView){
        PageRequest pageRequest = PageRequest.of(0,10);
        if(bookQueryView.getPage() >= 0 && bookQueryView.getSize() > 0)
            pageRequest = PageRequest.of(bookQueryView.getPage(),bookQueryView.getSize());
        return bookService.findBooksByNameIsLike(bookQueryView.getName(), pageRequest);
    }
}
