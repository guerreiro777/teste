package br.com.bb.prova.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListCotacao {
    private List<ContacaoDTO> value;
}
