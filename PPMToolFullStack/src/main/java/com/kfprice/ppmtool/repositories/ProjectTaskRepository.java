package com.kfprice.ppmtool.repositories;

import com.kfprice.ppmtool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository  extends CrudRepository<ProjectTask, Long> {
}
