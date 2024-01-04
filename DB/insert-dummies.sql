------------------------------------------------ DML (Dummy Data)

-- Tabela wydarzeń - Dane
INSERT INTO Events (nazwa, data_rozpoczecia, lokalizacja) VALUES
('Koncert Barokowy: Vivaldi', '2023-12-01 19:00:00', 'Filharmonia Narodowa, Warszawa'),
('Wieczór z Bachem', '2023-12-10 19:30:00', 'Teatr Wielki, Poznań');

INSERT INTO Biograms (biogram_timestamp_id, biogram_content)
VALUES ('2023-12-31 00:00:00', 'Text for the last day of 2023');

INSERT INTO Biograms (biogram_content)
VALUES ('Text with current timestamp');