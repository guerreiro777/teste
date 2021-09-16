package br.com.bb.prova.configuration;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Microsserviço de teste para a prova do banco do brasil",
                version = "1.0-SNAPSHOT")
)
public class AppConfig extends Application {
}
