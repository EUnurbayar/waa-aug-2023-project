INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'dean@miu.edu', 'Dean', 'Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users(id,email,firstname,lastname,password)
VALUES (4,'ann@miu.edu','ann','dove','$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');--123


INSERT INTO role (id, role)
VALUES (1, 'ADMIN');
INSERT INTO role (id, role)
VALUES (2, 'STUDENT');
INSERT INTO role (id, role)
VALUES (3, 'FACULTY');

INSERT INTO users_roles(user_id, roles_id)
VALUES (1, 1);
INSERT INTO users_roles(user_id, roles_id)
VALUES (2, 2);
INSERT INTO users_roles(user_id, roles_id)
VALUES (3, 3);
INSERT INTO users_roles(user_id, roles_id)
VALUES (4, 3);


--
INSERT INTO user_details (user_id, last_name, first_name, email, phone_num, university_name, degree, start_date, end_date, achieve_title, issue_date, portfolio)
VALUES
    (1, 'Smith', 'John', 'john.smith@example.com', 1234567890, 'University of ABC', 'Bachelor of Science', '2020-09-01', '2024-05-31', 'Outstanding Student Award', '2021-03-15', 'https://portfolio.com/john_smith_portfolio'),
    (2, 'Johnson', 'Emily', 'emily.johnson@example.com', 9876543210, 'XYZ College', 'Master of Arts', '2018-08-15', '2020-12-31', 'Best Research Paper Award', '2019-02-20', 'https://portfolio.com/emily_johnson_portfolio'),
    (3, 'Williams', 'Michael', 'michael.williams@example.com', 5554443333, 'University of PQR', 'Bachelor of Business Administration', '2022-01-10', '2025-06-30', 'Leadership Excellence Award', '2023-05-10', 'https://portfolio.com/michael_williams_portfolio');


-- INSERT INTO address (id, job_add_id, state, city, street, zipcode)
-- VALUES
--     (1, 1 , 'New York', 'New York City', '123 Main Street', 10001),
--     (2, 2, 'California', 'Los Angeles', '456 Elm Street', 90001);


-- INSERT INTO job_advertisement (id, address_id, user_id, benefits, company_name, description, position)
-- VALUES
--     (1, 1, 1, 'Health insurance, retirement plan', 'XYZ Tech', 'Software Engineer position', 'We are hiring a skilled software engineer.'),
--     (2, 2, 2, 'Flexible working hours, paid vacation', 'ABC Solutions', 'Web Developer position', 'Join our team as a web developer.');
--     (3, 3, 3, 'Competitive salary, career growth opportunities', 'TechCo Inc.', 'Data Analyst position', 'Seeking data analysts for data-driven insights.')
--     (4, 104, 4, 'Bonus incentives, remote work options', 'Digital Marketing Solutions', 'Marketing Specialist position', 'Help us drive marketing initiatives.'),
--     (5, 105, 5, 'Stock options, training programs', 'E-commerce Corp', 'Business Development Manager position', 'Lead business development strategies.');

