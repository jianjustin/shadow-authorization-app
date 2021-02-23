package org.jian.shadow.repository;

import org.jian.shadow.domain.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, String>, PagingAndSortingRepository<Chapter, String> {


}
