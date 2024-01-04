------------------------------------------------ DML (Dummy Data)

-- Tabela wydarzeń - Dane
INSERT INTO Events (nazwa, data_rozpoczecia, lokalizacja) VALUES
('Koncert Barokowy: Vivaldi', '2023-12-01 19:00:00', 'Filharmonia Narodowa, Warszawa'),
('Wieczór z Bachem', '2023-12-10 19:30:00', 'Teatr Wielki, Poznań');

INSERT INTO Biograms (biogram_timestamp_id, biogram_content)
VALUES ('2023-12-31 00:00:00', 'Text for the last day of 2023');

INSERT INTO Biograms (biogram_content)
VALUES ('Text with current timestamp');

INSERT INTO public.socialmediaprofiles (medium_name,profile_url,icon_id) VALUES
	 ('LinkedIn','https://linkedin.com/profile','96213944-8d4a-4ee4-afc2-faadf428ed35'),
	 ('Facebook','https://facebook.com/profile','ffa93ce5-c831-4597-ac6d-074aed30d27c'),
	 ('Gmail','https://gmail.com/profile','66b94b75-9ca6-4e11-b3f1-7dc5d062a257'),
	 ('YouTube','https://youtube.com/profile','7cbb2168-5ce3-4c2e-b2dc-fedd1e4e04f0');