package br.com.bb.prova.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoedaDTO {

    private String simbolo;
    private String nomeFormatado;
    private String tipoMoeda;

}
