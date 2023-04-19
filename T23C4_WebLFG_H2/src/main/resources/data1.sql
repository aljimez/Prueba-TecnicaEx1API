DROP TABLE IF EXISTS Games;
DROP TABLE IF EXISTS Parties;
DROP TABLE IF EXISTS Users;


CREATE TABLE Games (
ID INT NOT NULL,
nombre varchar(255) DEFAULT NULL,
description varchar(255) DEFAULT NULL,
playtime INT DEFAULT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE Users(
ID INT NOT NULL,
Username varchar(255) NOT NULL,
password varchar(255) NOT NULL,
email varchar(255) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE Parties(
ID INT NOT NULL,
nombre varchar(255) NOT NULL,
description varchar(255)DEFAULT NULL,
game INT NOT NULL,
usr_id VARCHAR(255) NOT NULL,
FOREIGN KEY (game) REFERENCES Games (ID) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (usr_id) REFERENCES Users (ID) ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY (ID)
);


INSERT INTO Games (ID,nombre,description,playtime) VALUES(1,'TicTacToe','Juego facil',10);
INSERT INTO Games (ID,nombre,description,playtime) VALUES (2,'Tekken','Juego de lucha',50);
INSERT INTO Games (ID,nombre,description,playtime) VALUES (3,'StreetFighter','Buen Juego de Lucha',60);


INSERT INTO Parties (ID,nombre,decription) VALUES (1,'parties','Sesion 1');
INSERT INTO Parties (ID,nombre,descrition) VALUES (2,'parti','Sesion 2');
INSERT INTO Parties (ID,nombre,descrition) VALUES (3,'partie','Sesion 3');


INSERT INTO Users (ID,Username,password,email) values (1,'ResteCt','@wwFG','aggaha@kksks.com');
INSERT INTO Users (ID,Username,password,email) values (2,'RestCt','@wwG','aha@kksks.com');
INSERT INTO Users (ID,Username,password,email) values (3,'ReseCt','@wwFFFG','aggafaaha@kkffsks.com');


