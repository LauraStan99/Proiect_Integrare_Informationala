CREATE TABLE HospitalDetails(
   HospitalTypeId INTEGER  NOT NULL PRIMARY KEY 
  ,HospitalType   VARCHAR(25) NOT NULL
);
INSERT INTO HospitalDetails(HospitalTypeId,HospitalType) VALUES (1,'Acute Care Hospitals');
INSERT INTO HospitalDetails(HospitalTypeId,HospitalType) VALUES (2,'Childrens');
INSERT INTO HospitalDetails(HospitalTypeId,HospitalType) VALUES (3,'Critical Access Hospitals');
