<img src="https://upload.wikimedia.org/wikipedia/commons/4/4e/Docker_%28container_engine%29_logo.svg" alt="drawing" width="200"/>

<h2 style="color:#0652DD;">What is docker ? 🙂</h2>

**Docker** is a set of platform as a service **(PaaS)** products that use OS-level virtualization to deliver software in packages called containers. Containers are isolated from one another and bundle their own software, libraries and configuration files.

<h2 style="color:#0652DD;">What is a container?</h2>

A container is a standard unit of software that packages up code and all its dependencies so the application runs quickly and reliably from one computing environment to another. A Docker container image is a lightweight, standalone, executable package of software that includes everything needed to run an application: code, runtime, system tools, system libraries and settings.

<h2 style="color:#0652DD;">What does docker solve?</h2>

- Missing or incorrect application dependencies such as libraries, interpreters, code/binaries, users.
- Conflicts between programs running on the same computer such as library dependencies or ports.
- Compatibility of each service with the libraries and dependencies of OS.
- Build and ship any application anywhere.

<h2 style="color:#0652DD;">BUILD, SHIP AND RUN YOUR CODE ANYWHERE</h2>

<h2 style="color:#0652DD;">docker is written in go</h2>

<br>

## [Docker hello world](https://github.com/markdown-it/markdown-it-emoji)

```cmd
> docker run hello-world

Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/
```

## [Show all containers](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 >docker ps -a
 CONTAINER ID  IMAGE        COMMAND   CREATED         STATUS                     PORTS   NAMES
 70defa31416c  hello-world  "/hello"  12 minutes ago  Exited (0) 12 minutes ago          clever_noyce
```

## [Inspect containers metadata](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 > docker inspect 70defa31416c
 CONTAINER ID  IMAGE        COMMAND   CREATED         STATUS                     PORTS   NAMES
 70defa31416c  hello-world  "/hello"  12 minutes ago  Exited (0) 12 minutes ago          clever_noyce

 > docker inspect -f '{{ json .Config.Env }}' clever_noyce
```

## [Docker rename](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 > docker rename clever_noyce my-first-container

 > docker ps -a
 CONTAINER ID  IMAGE        COMMAND   CREATED         STATUS                     PORTS   NAMES
 70defa31416c  hello-world  "/hello"  12 minutes ago  Exited (0) 12 minutes ago          my-first-container
```

## [Docker delete](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 > docker rm my-first-container

 > docker ps -a
 CONTAINER ID  IMAGE        COMMAND   CREATED         STATUS                     PORTS   NAMES
```

## [Show only IDs containers](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 > docker ps -aq
70defa31416c
```

## [Delete all containers with IDs](https://github.com/markdown-it/markdown-it-emoji)

```cmd
 > docker rm $(docker ps -aq)
```

## [Commands docker 🙂](https://github.com/markdown-it/markdown-it-emoji)

| Command | Description |
| ------- | ----------- |
| <code>docker --version</code>    | Docker version 19.03.1, build 74b1e89 |
| <code>docker info </code>    | Info about docker. |
| <code>docker ps </code>    | List containers. |
| <code>docker ps -a </code>    | Show all containers. |
| <code>docker images </code>    | List images. |
| <code>docker run hello-world </code>    | Create a new container hello-world. |
| <code>docker run --name my-container hello-world </code>    | Create a new container with name my-coniner and image hello-world. |
| <code>docker logs hello-world </code>    | Show output of container. |


Source: 
- [wikipedia](https://en.wikipedia.org/wiki/Docker_(software)) 🔗
- [docker.com](https://www.docker.com/resources/what-container) 🔗
- [docker commandline](https://docs.docker.com/engine/reference/commandline/docker/) 🔗