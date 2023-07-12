CREATE DATABASE jaegers;

\c jaegers;

DROP TABLE IF EXISTS Jaegers;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark CHAR(6),
    height FLOAT,
    weight FLOAT,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);

\ir 'init_db.sql'
\ir 'queries.sql'