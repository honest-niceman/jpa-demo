CREATE TABLE projects
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    end_date   TIMESTAMP WITHOUT TIME ZONE,
    start_date TIMESTAMP WITHOUT TIME ZONE,
    name       VARCHAR(255)                            NOT NULL,
    manager_id BIGINT,
    CONSTRAINT pk_projects PRIMARY KEY (id)
);

CREATE TABLE tasks
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    end_date   TIMESTAMP WITHOUT TIME ZONE,
    start_date TIMESTAMP WITHOUT TIME ZONE,
    name       VARCHAR(255)                            NOT NULL,
    project_id BIGINT,
    CONSTRAINT pk_tasks PRIMARY KEY (id)
);

ALTER TABLE users
    ADD email VARCHAR(255);

UPDATE users
SET email = ''
WHERE users.email IS NULL;

ALTER TABLE users
    ALTER COLUMN email SET NOT NULL;

ALTER TABLE projects
    ADD CONSTRAINT FK_PROJECTS_ON_MANAGER FOREIGN KEY (manager_id) REFERENCES users (id);

ALTER TABLE tasks
    ADD CONSTRAINT FK_TASKS_ON_PROJECT FOREIGN KEY (project_id) REFERENCES projects (id);