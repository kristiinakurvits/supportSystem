-- Kustutab public schema (mis põhimõtteliselt kustutab kõik tabelid)
DROP SCHEMA public CASCADE;
-- Loob uue public schema vajalikud õigused
CREATE SCHEMA public
-- taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;

-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-09-13 12:37:29.18

-- tables
-- Table: category

-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-09-17 14:19:37.86

-- tables
-- Table: support_ticket
CREATE TABLE support_ticket (
    id serial  NOT NULL,
    requester_name varchar(255)  NOT NULL,
    requester_e_mail varchar(255)  NOT NULL,
    title varchar(255)  NOT NULL,
    description varchar(510)  NOT NULL,
    date_added date  NOT NULL,
    deadline date  NOT NULL,
    is_solved boolean  NOT NULL,
    CONSTRAINT support_ticket_pk PRIMARY KEY (id)
);

-- End of file.

