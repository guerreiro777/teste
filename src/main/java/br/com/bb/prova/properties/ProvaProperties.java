package br.com.bb.prova.properties;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "prova")
public interface ProvaProperties {

    @WithName("hello")
    String hello();

}