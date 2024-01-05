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

INSERT INTO public.youtubevideos (video_id,title,url,default_width,default_height) VALUES
	 ('7bb6b809-60e0-4ddd-8a41-d0828a51969f','Johann Nepomuk Hummel (1778 - 1837) - Flute Sonata in D major, Op. 50, Andante - Rondo','https://www.youtube.com/embed/6WyUL2z9nuM?si=Ea72LNRrKwwexDma',280,156),
	 ('1ba57c63-340d-4ba4-8262-36e753a7d524','Johann Nepomuk Hummel (1778 - 1837) - Flute Sonata in D major, Op. 50, Allegro con brio','https://www.youtube.com/embed/arxIC9JO3-8?si=OvU28c1YP9nGA4b0',280,156),
	 ('f5ad7955-3a43-45f5-92a9-bba05eaa5ced','[M.] Deluse - VIII Caprice','https://www.youtube.com/embed/bzqcKMfKNm0?si=TiNFRMoJjLyfJ1pJ',280,156);