CREATE TABLE assigned
(
    id          VARCHAR(36) NOT NULL,
    driver_id   VARCHAR(36) NULL,
    car_id      VARCHAR(36) NULL,
    assign_date datetime NULL,
    CONSTRAINT pk_assigned PRIMARY KEY (id)
);

CREATE TABLE car
(
    id            VARCHAR(36) NOT NULL,
    created_at    datetime NULL,
    updated_at    datetime NULL,
    license_plate VARCHAR(255) NULL,
    CONSTRAINT pk_car PRIMARY KEY (id)
);

CREATE TABLE driver
(
    id            VARCHAR(36) NOT NULL,
    created_at    datetime NULL,
    updated_at    datetime NULL,
    cin           VARCHAR(255) NULL,
    first_name    VARCHAR(255) NULL,
    last_name     VARCHAR(255) NULL,
    date_of_birth datetime NULL,
    CONSTRAINT pk_driver PRIMARY KEY (id)
);

CREATE TABLE driver_license
(
    id            VARCHAR(36) NOT NULL,
    created_at    datetime NULL,
    updated_at    datetime NULL,
    delivery_date datetime NULL,
    license_type  VARCHAR(255) NULL,
    CONSTRAINT pk_driver_license PRIMARY KEY (id)
);

ALTER TABLE assigned
    ADD CONSTRAINT FK_ASSIGNED_ON_CAR FOREIGN KEY (car_id) REFERENCES car (id);

ALTER TABLE assigned
    ADD CONSTRAINT FK_ASSIGNED_ON_DRIVER FOREIGN KEY (driver_id) REFERENCES driver (id);