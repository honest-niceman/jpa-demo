INSERT INTO projects (name, manager_id, start_date)
VALUES ('Amplicode', 1, NOW());
INSERT INTO tasks (name, start_date, project_id)
VALUES ('Wizard Redesign', NOW(), 1);
INSERT INTO tasks (name, start_date, project_id)
VALUES ('Envers RnD', NOW(), 1);