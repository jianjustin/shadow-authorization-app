package org.jian.shadow.service;

import org.jian.shadow.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {

    @Autowired
    public ChapterRepository chapterRepository;


    public ChapterRepository getChapterRepository() {
        return chapterRepository;
    }

    public void setChapterRepository(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }
}
