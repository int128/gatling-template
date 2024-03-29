# gatling-template [![build](https://github.com/int128/hello-gatling/actions/workflows/build.yaml/badge.svg)](https://github.com/int128/hello-gatling/actions/workflows/build.yaml)

This is a template project to run Gatling simulation in GitHub Actions.


## Getting Started

### Run in GitHub Actions

To run a simulation, create a pull request with prefix.
You will soon receive the comments:

<img width="920" alt="image" src="https://user-images.githubusercontent.com/321266/226153972-f9219fc5-84c0-449e-b198-b3352a387df7.png">

See [`.github/workflows/loadtest-example.yaml`](.github/workflows/loadtest-example.yaml).

:memo: **NOTE**: for stability, you should run Gatling jobs on self-hosted runners in your environment.


### Run locally

Gatling supports OpenJDK 11 with HotSpot.
To install [AdoptOpenJDK](https://adoptopenjdk.net):

```shell
# OpenJDK
brew tap AdoptOpenJDK/openjdk
brew install adoptopenjdk11

# sbt
brew install sbt
```

You can open this project in IntelliJ IDEA.

This repository contains [the examples in gatling-bundle](https://github.com/gatling/gatling/blob/master/gatling-bundle/src/main/scala/computerdatabase/).

To run a simulation:

```console
% sbt "gatling:testOnly computerdatabase.BasicSimulation"
[info] welcome to sbt 1.4.7 (AdoptOpenJDK Java 11.0.10)
...
Simulation computerdatabase.BasicSimulation completed in 27 seconds
...
Generating reports...

================================================================================
---- Global Information --------------------------------------------------------
> request count                                         13 (OK=13     KO=0     )
> min response time                                    239 (OK=239    KO=-     )
> max response time                                    753 (OK=753    KO=-     )
> mean response time                                   392 (OK=392    KO=-     )
> std deviation                                        139 (OK=139    KO=-     )
> response time 50th percentile                        347 (OK=347    KO=-     )
> response time 75th percentile                        499 (OK=499    KO=-     )
> response time 95th percentile                        622 (OK=622    KO=-     )
> response time 99th percentile                        727 (OK=727    KO=-     )
> mean requests/sec                                  0.464 (OK=0.464  KO=-     )
---- Response Time Distribution ------------------------------------------------
> t < 800 ms                                            13 (100%)
> 800 ms < t < 1200 ms                                   0 (  0%)
> t > 1200 ms                                            0 (  0%)
> failed                                                 0 (  0%)
================================================================================
Reports generated in 0s.
Please open the following file: /hello-gatling/target/gatling/basicsimulation-20210210004715647/index.html
[info] Simulation BasicSimulation successful.
[info] Simulation(s) execution ended.
[success] Total time: 31 s, completed Feb 10, 2021, 9:47:44 AM
```

You can see a report in `target/gatling` directory.
