package org.jian.shadow.controller;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.Classify;
import org.jian.shadow.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassifyController {
    @Autowired
    public ClassifyService classifyService;

    @GetMapping(value="/classify", produces = "application/json;charset=utf-8", consumes = "application/json;charset=utf-8")
    @PreAuthorize("hasAuthority('classify.query')")
    @ShadowLog(description = "查询所有分类")
    public List<Classify> findAll(){
        return classifyService.findAll();
    }
}
