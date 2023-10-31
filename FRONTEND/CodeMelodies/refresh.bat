:: Trzeba uruchomić dockerowego daemona w aplikacji DockerDesktop

:: Zatrzymuje wszystkie kontenery
docker kill $(docker ps -aq)

:: Usuwa wszystkie kontenery (dodano "-f" dla wymuszenia)
docker rm -f $(docker ps -aq)

:: Usuwa wszystkie obrazy
docker rmi -f $(docker images -q)

:: Buduje nowy obraz o nazwie "angularapp" z bieżącego katalogu
docker build . -t angularapp

:: Uruchamia kontener z obrazem "angularapp"
docker run -p 4200:80 angularapp
