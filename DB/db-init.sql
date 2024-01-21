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

CREATE TABLE Tags (
    name VARCHAR(255) PRIMARY KEY,
    color VARCHAR(7) NOT NULL
);

CREATE TABLE Events_to_tags (
    event_id UUID NOT NULL,
    tag_name VARCHAR(255),
    PRIMARY KEY (event_id, tag_name),
    FOREIGN KEY (event_id) REFERENCES Events(event_id),
    FOREIGN KEY (tag_name) REFERENCES Tags(name)
);

-- Tabela profili mediów społecznościowych
CREATE TABLE SocialMediaProfiles (
    medium_name VARCHAR(255) NOT NULL,
    profile_url TEXT NOT NULL,
    icon_id UUID NOT NULL,
    CONSTRAINT socialmediaprofiles_pkey PRIMARY KEY (medium_name),
    CONSTRAINT socialmediaprofiles_icon_id_key UNIQUE (icon_id),
    CONSTRAINT socialmediaprofiles_icon_id_fk FOREIGN KEY (icon_id) REFERENCES SocialMediaIcons (icon_id)
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