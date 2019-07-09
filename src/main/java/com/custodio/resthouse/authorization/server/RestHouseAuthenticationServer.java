package com.custodio.resthouse.authorization.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Application that represents an authentication server based on the OAuth2 protocol.
 *
 * @author williamcustodio
 */
@EntityScan("com.custodio.resthouse.authorization.server")
@SpringBootApplication
public class RestHouseAuthenticationServer
{
    public static void main(final String... args)
    {
        SpringApplication.run(RestHouseAuthenticationServer.class, args);
    }
}