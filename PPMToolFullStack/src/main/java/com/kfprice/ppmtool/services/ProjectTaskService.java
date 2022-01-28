package com.kfprice.ppmtool.services;

import com.kfprice.ppmtool.domain.Backlog;
import com.kfprice.ppmtool.domain.ProjectTask;
import com.kfprice.ppmtool.repositories.BacklogRepository;
import com.kfprice.ppmtool.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProjectTaskService {


    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask){

        Backlog backlog = backlogRepository.findByProjectIdentifier(projectIdentifier);

        projectTask.setBacklog(backlog);

        Integer BacklogSequence = backlog.getPTSequence();
        BacklogSequence++;

        projectTask.setProjectSequence(projectIdentifier+"-"+BacklogSequence);
        projectTask.setProjectIdentifier(projectIdentifier);

 /*       if(projectTask.getPriority()==0||projectTask.getPriority()==null){
            projectTask.setPriority(3);
        }*/

        if(projectTask.getStatus()==""||projectTask.getStatus()==null) {
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepository.save(projectTask);
    }
}
