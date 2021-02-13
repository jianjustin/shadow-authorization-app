package org.jian.shadow.repository;

import org.jian.shadow.domain.Classify;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassifyRepository extends CrudRepository<Classify, String>, PagingAndSortingRepository<Classify, String> {


}
