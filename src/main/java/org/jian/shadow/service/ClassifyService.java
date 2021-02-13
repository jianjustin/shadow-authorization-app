package org.jian.shadow.service;

import org.jian.shadow.domain.Classify;
import org.jian.shadow.repository.ClassifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClassifyService {
    @Autowired
    public ClassifyRepository classifyRepository;

    public List<Classify> findAll(){
        if(classifyRepository.count() == 0)return new ArrayList<Classify>();
        return (List<Classify>)classifyRepository.findAll();
    }
}
