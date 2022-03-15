package io.jpabuddy.spring.demo.jpademo.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class TaskDto implements Serializable {
    private final Long id;
    private final LocalDateTime endDate;
    private final LocalDateTime startDate;
    private final String name;

    public TaskDto(Long id, LocalDateTime endDate, LocalDateTime startDate, String name) {
        this.id = id;
        this.endDate = endDate;
        this.startDate = startDate;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDto entity = (TaskDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.endDate, entity.endDate) &&
                Objects.equals(this.startDate, entity.startDate) &&
                Objects.equals(this.name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, endDate, startDate, name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "endDate = " + endDate + ", " +
                "startDate = " + startDate + ", " +
                "name = " + name + ")";
    }
}
