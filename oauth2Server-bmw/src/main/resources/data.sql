INSERT INTO USERS (username, password, enabled)
    VALUES ('stutya', '$2a$12$CK8ZJw3qCV8p2tymbeF4euPgR.yh2qqLM7WK7nOYB6BcmLUNMWjte', true);

INSERT INTO USERS (username, password, enabled)
    VALUES ('adhrit', '$2a$12$CK8ZJw3qCV8p2tymbeF4euPgR.yh2qqLM7WK7nOYB6BcmLUNMWjte', true);

INSERT INTO AUTHORITIES (username, authority) VALUES ('stutya', 'ROLE_USER');
INSERT INTO AUTHORITIES (username, authority) VALUES ('adhrit', 'ROLE_ADMIN');