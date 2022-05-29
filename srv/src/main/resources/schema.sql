DROP VIEW IF EXISTS localized_fr_EnterpriseMessagingProducerService_StudentsLibraryDetails;
DROP VIEW IF EXISTS localized_de_EnterpriseMessagingProducerService_StudentsLibraryDetails;
DROP VIEW IF EXISTS localized_fr_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails;
DROP VIEW IF EXISTS localized_de_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails;
DROP VIEW IF EXISTS localized_EnterpriseMessagingProducerService_StudentsLibraryDetails;
DROP VIEW IF EXISTS localized_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails;
DROP VIEW IF EXISTS EnterpriseMessagingProducerService_StudentsLibraryDetails_texts;
DROP VIEW IF EXISTS EnterpriseMessagingProducerService_StudentsLibraryDetails;

DROP TABLE IF EXISTS sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts;
DROP TABLE IF EXISTS sap_cap_enterpriseMessagingConsumer_studentLibraryDetails;

CREATE TABLE sap_cap_enterpriseMessagingConsumer_studentLibraryDetails (
  ID NVARCHAR(36) NOT NULL,
  firstName NVARCHAR(100),
  lastName NVARCHAR(100),
  currentClass NVARCHAR(10),
  libraryNumber INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts (
  locale NVARCHAR(14) NOT NULL,
  ID NVARCHAR(36) NOT NULL,
  firstName NVARCHAR(100),
  lastName NVARCHAR(100),
  PRIMARY KEY(locale, ID)
);

CREATE VIEW EnterpriseMessagingProducerService_StudentsLibraryDetails AS SELECT
  studentLibraryDetails_0.ID,
  studentLibraryDetails_0.firstName,
  studentLibraryDetails_0.lastName,
  studentLibraryDetails_0.currentClass,
  studentLibraryDetails_0.libraryNumber
FROM sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS studentLibraryDetails_0;

CREATE VIEW EnterpriseMessagingProducerService_StudentsLibraryDetails_texts AS SELECT
  texts_0.locale,
  texts_0.ID,
  texts_0.firstName,
  texts_0.lastName
FROM sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts AS texts_0;

CREATE VIEW localized_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS SELECT
  L_0.ID,
  coalesce(localized_1.firstName, L_0.firstName) AS firstName,
  coalesce(localized_1.lastName, L_0.lastName) AS lastName,
  L_0.currentClass,
  L_0.libraryNumber
FROM (sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS L_0 LEFT JOIN sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts AS localized_1 ON localized_1.ID = L_0.ID AND localized_1.locale = 'en');

CREATE VIEW localized_EnterpriseMessagingProducerService_StudentsLibraryDetails AS SELECT
  studentLibraryDetails_0.ID,
  studentLibraryDetails_0.firstName,
  studentLibraryDetails_0.lastName,
  studentLibraryDetails_0.currentClass,
  studentLibraryDetails_0.libraryNumber
FROM localized_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS studentLibraryDetails_0;

CREATE VIEW localized_de_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS SELECT
  L_0.ID,
  coalesce(localized_de_1.firstName, L_0.firstName) AS firstName,
  coalesce(localized_de_1.lastName, L_0.lastName) AS lastName,
  L_0.currentClass,
  L_0.libraryNumber
FROM (sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS L_0 LEFT JOIN sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts AS localized_de_1 ON localized_de_1.ID = L_0.ID AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS SELECT
  L_0.ID,
  coalesce(localized_fr_1.firstName, L_0.firstName) AS firstName,
  coalesce(localized_fr_1.lastName, L_0.lastName) AS lastName,
  L_0.currentClass,
  L_0.libraryNumber
FROM (sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS L_0 LEFT JOIN sap_cap_enterpriseMessagingConsumer_studentLibraryDetails_texts AS localized_fr_1 ON localized_fr_1.ID = L_0.ID AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_EnterpriseMessagingProducerService_StudentsLibraryDetails AS SELECT
  studentLibraryDetails_0.ID,
  studentLibraryDetails_0.firstName,
  studentLibraryDetails_0.lastName,
  studentLibraryDetails_0.currentClass,
  studentLibraryDetails_0.libraryNumber
FROM localized_de_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS studentLibraryDetails_0;

CREATE VIEW localized_fr_EnterpriseMessagingProducerService_StudentsLibraryDetails AS SELECT
  studentLibraryDetails_0.ID,
  studentLibraryDetails_0.firstName,
  studentLibraryDetails_0.lastName,
  studentLibraryDetails_0.currentClass,
  studentLibraryDetails_0.libraryNumber
FROM localized_fr_sap_cap_enterpriseMessagingConsumer_studentLibraryDetails AS studentLibraryDetails_0;

