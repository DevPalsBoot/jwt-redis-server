/* Drop Tables */
DROP TABLE IF EXISTS sc_user;
DROP TABLE IF EXISTS sc_refresh_token;

CREATE TABLE sc_user
(
    id bigserial NOT NULL,
    email varchar(128) NOT NULL UNIQUE,
    user_name varchar(32) NOT NULL,
    contact varchar(32),
    company varchar(32),
    encrypt_password varchar(512),
    language varchar(2) DEFAULT 'en' NOT NULL,
    consent_yn varchar(1) DEFAULT 'N' NOT NULL,
    subscribe_yn varchar(1) DEFAULT 'N' NOT NULL,
    role_code int DEFAULT 2 NOT NULL,
    last_login_time timestamp,
    create_time timestamp DEFAULT NOW() NOT NULL,
    delete_time timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE sc_refresh_token
(
    id bigserial NOT NULL,
    user_id bigint NOT NULL UNIQUE,
    token varchar(500) NOT NULL UNIQUE,
    expiry_time timestamp NOT NULL,
    PRIMARY KEY (id)
) WITHOUT OIDS;

ALTER TABLE sc_refresh_token
    ADD FOREIGN KEY (user_id)
        REFERENCES sc_user (id)
        ON UPDATE RESTRICT
        ON DELETE CASCADE
;