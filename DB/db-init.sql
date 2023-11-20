CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

------------------------------------------------ DDL (Definicje Tabel)

-- Tabela użytkowników
CREATE TABLE Users (
    user_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

-- Tabela obrazów
CREATE TABLE Images (
    image_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    image BYTEA
);

-- Tabela ikon mediów społecznościowych
CREATE TABLE SocialMediaIcons (
    icon_id SERIAL PRIMARY KEY,
    platform_name VARCHAR(255) NOT NULL,
    icon_url TEXT NOT NULL
);

-- Tabela wydarzeń
CREATE TABLE Events (
    event_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    nazwa VARCHAR(255),
    data_rozpoczecia TIMESTAMP,
    lokalizacja VARCHAR(255)
);

-- Tabela profili mediów społecznościowych
CREATE TABLE SocialMediaProfiles (
    profile_id SERIAL PRIMARY KEY,
    user_id uuid NOT NULL,
    profile_url TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Tabela relacji między użytkownikami a wydarzeniami (dla relacji wiele do wielu)
CREATE TABLE UserEvents (
    user_id uuid,
    event_id UUID,
    PRIMARY KEY (user_id, event_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (event_id) REFERENCES Events(event_id)
);

-- Tabela biogramów użytkowników (relacja jeden do jednego)
CREATE TABLE UserBiographies (
    user_id uuid UNIQUE NOT NULL,
    biography TEXT,
    PRIMARY KEY (user_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);