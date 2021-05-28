/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Created: 09-may-2020
 */

CREATE ROLE "user" WITH
  NOLOGIN
  NOSUPERUSER
  INHERIT
  NOCREATEDB
  NOCREATEROLE
  NOREPLICATION
  ENCRYPTED PASSWORD 'md539eb97b4709a24500b63f39a12d7ce26';

CREATE DATABASE usuarios
    WITH 
    OWNER = "user"
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE TABLE public.datos
(
    "Nombre" text COLLATE pg_catalog."default",
    "Apellido" text COLLATE pg_catalog."default",
    "Cedula" numeric NOT NULL,
    "Correo" text COLLATE pg_catalog."default",
    CONSTRAINT datos_pkey PRIMARY KEY ("Cedula")
)

CREATE TABLE public.sintomas
(
    sintoma1 text COLLATE pg_catalog."default",
    sintoma2 text COLLATE pg_catalog."default",
    sintoma3 text COLLATE pg_catalog."default",
    sintoma4 text COLLATE pg_catalog."default",
    sintoma5 text COLLATE pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE public.sintomas
    OWNER to postgres;
