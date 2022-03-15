package io.jpabuddy.spring.demo.jpademo.controllers;

import io.jpabuddy.spring.demo.jpademo.dtos.ProjectDto;
import io.jpabuddy.spring.demo.jpademo.entities.Project;
import io.jpabuddy.spring.demo.jpademo.mappers.ProjectMapper;
import io.jpabuddy.spring.demo.jpademo.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProjectController {
    private ProjectRepository projectRepository;
    private ProjectMapper projectMapper;

    public ProjectController(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    @GetMapping("project/{name}")
    public List<ProjectDto> findByName(@PathVariable("name") String name) {
        List<Project> projectList = projectRepository.findByName(name);
        return projectList.stream()
                .map(projectMapper::projectToProjectDto)
                .collect(Collectors.toList());
    }

    @PostMapping("project")
    public ProjectDto saveProject(@RequestBody ProjectDto projectDto) {
        Project project = projectMapper.projectDtoToProject(projectDto);
        return projectMapper.projectToProjectDto(projectRepository.save(project));
    }
}
