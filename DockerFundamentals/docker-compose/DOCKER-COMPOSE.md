# DOCKER COMPONSER

```yml
version: "3"

services:
  app:
    image: carlosapp
    environment:
      MONGO_URL: "mongodb://db:27017/test"
    depends_on:
      - db
    ports:
      - "3000:3000"

  db:
    image: mongo
```

## Run componse

```docker
 $ docker-compose up

 $ docker-compose up
Creating network "docker_default" with the default driver
Creating docker_db_1 ... done
Creating docker_app_1 ... done
Attaching to docker_db_1, docker_app_1
.
.

 ```

 ## Others commands docker componse

```docker
 $ docker-compose up -d  // corre el docker componse sin mostrar los logs de la aplicación

 $ docker-compose ps
    Name                  Command                State     Ports
----------------------------------------------------------------
docker_app_1   docker-entrypoint.sh npx n ...   Exit 143
docker_db_1    docker-entrypoint.sh mongod      Exit 0

 $ docker-compose logs app

 $ docker-componse down // eliminar los contenedores generados

 ```

## Usando una imagen usando el contexto de dockerfile

```yml
version: "3"

services:
  app:
    build: .
    environment:
      MONGO_URL: "mongodb://db:27017/test"
    depends_on:
      - db
    ports:
      - "3000:3000" #computadora:contenedor
      # - "3000-3010:3000" #usando rango de puerto de 3000 a 3010
    volumes:
      - .:/usr/src            # repisa la carpeta
      - /usr/src/node_modules # no lo toque [read only]

  db:
    image: mongo
```

```docker
 $ docker-componse build

 ```