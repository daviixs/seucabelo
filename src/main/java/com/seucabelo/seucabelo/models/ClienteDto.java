package com.seucabelo.seucabelo.models;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClienteDto {
    @NotEmpty(message = "É necessario inserir o primeiro nome ")
    private String primeiroNome;

    @NotEmpty(message = "É necessario inserir o ultimo nome ")
    private String ultimoNome;

    @NotEmpty(message = "É necessario um número para contato")
    private String telefone;

    @NotEmpty(message = "A data de cadastro é obrigatória")
    private LocalDate dataCadastro;

    private String endereco;
    private String status;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
