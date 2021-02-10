# hello-gatling

This is an example with Gatling and sbt.


## Getting Started

### Run locally

Gatling supports OpenJDK 11 with HotSpot.

```shell
# OpenJDK
brew tap AdoptOpenJDK/openjdk
brew install adoptopenjdk11

# sbt
brew install sbt
```

This repository contains an example of [BasicSimulation](https://github.com/gatling/gatling/blob/master/gatling-bundle/src/main/scala/computerdatabase/BasicSimulation.scala).

To run a simulation:

```console
% sbt "run -s computerdatabase.BasicSimulation"
[info] welcome to sbt 1.4.7 (AdoptOpenJDK Java 11.0.10)
...
[success] Total time: 30 s, completed Feb 10, 2021, 9:05:09 AM
```

You can see a report in `results` directory.


### Run on Docker

TODO
