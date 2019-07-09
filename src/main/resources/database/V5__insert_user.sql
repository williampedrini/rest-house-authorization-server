INSERT INTO USER_(USER_NAME, PASSWORD, ACCOUNT_EXPIRED, ACCOUNT_LOCKED, CREDENTIALS_EXPIRED, ENABLED)
VALUES ('admin', '$2a$04$uFNDAHGIQTrT0KnKxUrskOsv5IUSlzYLFj5zT7DMKJ5H.NPrXrcrC', FALSE, FALSE, FALSE, TRUE);

INSERT INTO USER_(USER_NAME, PASSWORD, ACCOUNT_EXPIRED, ACCOUNT_LOCKED, CREDENTIALS_EXPIRED, ENABLED)
VALUES ('user', '$2a$04$hxdGjAZiG4bduqwuv4ZWg.GnnH1H5sOkxJakwbJD3QAMMYIKkqtEq', FALSE, FALSE, FALSE, TRUE);

INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'PRODUCT_READ'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'PRODUCT_CREATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'PRODUCT_UPDATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'PRODUCT_DELETE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'CUSTOMER_READ'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'CUSTOMER_CREATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'CUSTOMER_UPDATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'CUSTOMER_DELETE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'OUTCOME_READ'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'OUTCOME_CREATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'OUTCOME_UPDATE'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'admin'), (SELECT ID FROM AUTHORITY WHERE NAME = 'OUTCOME_DELETE'));

INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'user'), (SELECT ID FROM AUTHORITY WHERE NAME = 'PRODUCT_READ'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'user'), (SELECT ID FROM AUTHORITY WHERE NAME = 'CUSTOMER_READ'));
INSERT INTO USER_AUTHORITY(USER_ID, AUTHORITY_ID)
VALUES ((SELECT ID FROM USER_ WHERE USER_NAME = 'user'), (SELECT ID FROM AUTHORITY WHERE NAME = 'OUTCOME_READ'));