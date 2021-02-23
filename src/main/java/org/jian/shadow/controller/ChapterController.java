package org.jian.shadow.controller;

import org.jian.shadow.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    @Autowired
    public ChapterService chapterService;


    public ChapterService getChapterService() {
        return chapterService;
    }

    public void setChapterService(ChapterService chapterService) {
        this.chapterService = chapterService;
    }
}
