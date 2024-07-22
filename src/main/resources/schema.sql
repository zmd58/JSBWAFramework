CREATE TABLE IF NOT EXISTS Objects (
    id INT NOT NULL,
    title varchar(250) NOT NULL,
    description varchar(250),
    price DECIMAL NOT NULL,
    option varchar(250),
    PRIMARY KEY (id)
);