# CodeMelodies
## *CodeMelodies* to elegancka i intuicyjna platforma, stworzona z myślą o prezentowaniu treści związanych z muzyką epoki baroku i klasycyzmu.
![logomin](https://github.com/WiolaWysopal/CodeMelodies/assets/115031260/cda728b1-437b-4814-baee-76785c65bf14)

### Spis treści:
1. Wstęp
2. Funkcje
3. Technologie

#### Wstęp
*CodeMelodies* to elegancka i intuicyjna platforma, stworzona z myślą o rozpowszechnianiu treści związanych z muzyką poważną z okresu baroku i klasycyzmu. Aplikacja ma na celu propagowanie treści przeznaczonych dla pewnej grupy odbiorców. Projekt kładzie nacisk na intuicyjność oraz zwięzłość treści.
#### Funkcje
Aplikacja *CodeMelodies* oferuje następujące funkcje: 
- 🎵 Galeria Nagrań:
 > Eksploruj bogatą kolekcję nagrań, prezentującą wyjątkowe interpretacje utworów.
- 📘 Publikacje:
 > Zapoznaj się z artykułami dotyczącymi różnych aspektów muzyki poważnej, technik gry na flecie i wiele więcej.
- 👥 Profil Artysty:
 > Poznaj artystkę bliżej, zapoznając się z jej biografią, osiągnięciami i dokumentacją artystyczną w postaci nagrań i zdjęć.
- 📅 Kalendarz Wydarzeń
 > Bądź na bieżąco z nadchodzącymi koncertami, wydarzeniami i premierami nagrań.
- 💌 Kontakt:
 > Skontaktuj się bezpośrednio z artystką, zadając pytania lub wyrażając swoje uwagi.
#### Technologie
Aplikację *CodeMelodies* wspierają następujące technologie:
- FRONT-END: Agnular
- BACK-END: Spring

## LAB01
Komendy Angular CLI:

```bash ng new CodeMelodies --routing --skip-git --skip-tests --style css```

- ``` ng new CodeMelodies``` - tworzy nowy projekt z zadanymi parametrami:

 - ``` --routing ``` - dodaje moduł routingu do nowoutworzonego projektu
 - ``` --skip git ``` -  pomija inicjalizację repozytorium Git dla nowego projektu
 - ``` --skip-tests ``` -   pomija generowanie plików specyfikacji testów dla nowego projektu
 - ``` --style css ``` -  definiuje technologię stylowania, która ma być używana w projekcie
 
 Aplikację Springową utworzono przy pomocy **Spring Initializr**.

## LAB02

### Endpointy API

- **OMnieController**
	- `[GET]`: `/omnie`
- **YouTubeController:**
	- `[GET]`: `/youtube`
- **LoginController:**
	- `[POST]`: `/login`
	- `[POST]`: `/wyloguj`
- **RegisterController:**
	- `[POST]`: `/register`
- **PublikacjeController:**
	- `[GET]`: `/publikacje?token=TOKEN`
- **ObrazyController:**
	- `[GET]`: `/zdjecia`
	- `[GET]`: `/ikona`
- **KontaktController:**
	- `[GET]`: `/kalendarz`
	- `[GET]`: `/socialmedia`

Test enpointów możliwy jest pod adresem: http://localhost:8080/swagger-ui/index.html#/.

