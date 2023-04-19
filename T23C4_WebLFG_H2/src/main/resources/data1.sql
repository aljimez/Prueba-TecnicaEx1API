CREATE TABLE Games (
ID char(4),
nombre varchar(255),
description varchar(255),
playtime char(5)
);

CREATE TABLE Parties(
ID char(4),
nombre varchar(255),
description varchar(255)
);

CREATE TABLE Users(
ID char(5),
Username varchar(255),
password varchar(255),
email varchar(255)
);

INSERT INTO Games (ID,nombre,description,playtime) VALUES(1,"TicTacToe","Juego facil",10);
INSERT INTO Games (ID,nombre,description,playtime) VALUES (2,"Tekken","Juego de lucha",50);
INSERT INTO Games (ID,nombre,description,playtime) VALUES (3,"StreetFighter","Buen Juego de Lucha",60);


INSERT INTO Parties (ID,nombre,decription) VALUES (1,"parties","Sesion 1");
INSERT INTO Parties (ID,nombre,descrition) VALUES (2,"parti","Sesion 2");
INSERT INTO Parties (ID,nombre,descrition) VALUES (3,"partie","Sesion 3");


INSERT INTO Users (ID,Username,password,email) values (1,"ResteCt","@wwFG","aggaha@kksks.com");
INSERT INTO Users (ID,Username,password,email) values (2,"RestCt","@wwG","aha@kksks.com");
INSERT INTO Users (ID,Username,password,email) values (3,"ReseCt","@wwFFFG","aggafaaha@kkffsks.com");


