package io.jpabuddy.spring.demo.jpademo.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ProjectDto implements Serializable {
    private final Long id;
    private final String name;
    private final List<TaskDto> tasks;
    private final UserDto manager;

    public ProjectDto(Long id, String name, List<TaskDto> tasks, UserDto manager) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TaskDto> getTasks() {
        return tasks;
    }

    public UserDto getManager() {
        return manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectDto entity = (ProjectDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.tasks, entity.tasks) &&
                Objects.equals(this.manager, entity.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tasks, manager);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "tasks = " + tasks + ", " +
                "manager = " + manager + ")";
    }
}
