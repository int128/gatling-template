.PHONY: gatling
gatling:
	rm -fr target/hello-gatling-latest/
	unzip target/universal/hello-gatling-latest.zip -d target/
	target/hello-gatling-latest/bin/gatling.sh -s "$(SIMULATION_NAME)"
