CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

------------------------------------------------ DDL (Definicje Tabel)

-- Tabele użydowników
CREATE TABLE Users (
    user_name VARCHAR(255) PRIMARY KEY NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255)
);

-- Tabela obrazów
CREATE TABLE Images (
    image_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    image BYTEA
);

-- Tabela ikon mediów społecznościowych
CREATE TABLE SocialMediaIcons (
    icon_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    image BYTEA
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
    medium_name VARCHAR(255) PRIMARY KEY,
    profile_url TEXT NOT NULL,
    icon_id UUID,
    -- TODO: DODAĆ NOT NULL do UUID
    FOREIGN KEY (icon_id) REFERENCES SocialMediaIcons(icon_id)
);

CREATE TABLE Biograms (
    biogram_timestamp_id TIMESTAMP PRIMARY KEY DEFAULT NOW(),
    biogram_content TEXT
);

CREATE TABLE public.youtubevideos (
	video_id uuid PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
	title text NOT NULL,
	url text NOT NULL,
	default_width int NOT NULL DEFAULT 280,
	default_height int NOT NULL DEFAULT 156
);

CREATE TABLE public.publication_files (
    publication_file_id uuid PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
    file bytea NOT NULL
);

CREATE TABLE public.publications (
	publication_id uuid PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
	title text NOT NULL,
    publication_file_id uuid NOT NULL,
    FOREIGN KEY (publication_file_id) REFERENCES publication_files(publication_file_id)
);