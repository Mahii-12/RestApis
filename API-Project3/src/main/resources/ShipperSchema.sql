CREATE TABLE customer
(
  Id varchar(11) NOT NULL ,
  Name varchar(100) DEFAULT NOT NULL,
  Source varchar(100) DEFAULT NOT NULL,
  Destination varchar(100) DEFAULT NOT NULL,
  TruckType varchar(100) DEFAULT NOT NULL,
  Weight varchar(12) DEFAULT NOT NULL,
  Comments varchar(100) DEFAULT NOT NULL,
 PRIMARY KEY (Id)
)