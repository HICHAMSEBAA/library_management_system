DROP DATABASE IF EXISTS Library;

CREATE DATABASE Library;

USE Library;

CREATE TABLE BOOK (
    id VARCHAR(200) PRIMARY KEY,
    title VARCHAR(200),
    author VARCHAR(200),
    publisher VARCHAR(200),
    isAvail BOOLEAN DEFAULT TRUE
    );

CREATE TABLE STUDENT (
    id VARCHAR(200) PRIMARY KEY,
    name VARCHAR(200),
    email VARCHAR(200),
    department VARCHAR(200),
    specialty VARCHAR(200)
    );

