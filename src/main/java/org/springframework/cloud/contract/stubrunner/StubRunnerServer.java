package org.springframework.cloud.contract.stubrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;


@SpringBootApplication
@EnableStubRunnerServer
public class StubRunnerServer {

    public static void main(String[] args) {

        SpringApplication.run(StubRunnerServer.class, args);
    }

}
