docker run --name=mysqlcontainer --publish 6603:3306 -v E:\Dev\learn-spring5\spring-mvc-hibernate\conf:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=asdf1234 mysql:latest

docker exec -it mysqlcontainer /bin/bash


docker logs mysqlcontainer

docker stop mysqlcontainer
docker rm mysqlcontainer



docker image prune -a
docker container prune -a

docker system prune