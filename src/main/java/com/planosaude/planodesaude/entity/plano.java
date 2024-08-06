package com.planosaude.planodesaude.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "planos")
public class plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private Boolean dataNascimento;
    private String dataInclusao;
    private Boolean dataAtualizacao;
    
   
	public plano(String string, String string2, String string3, String string4, String string5, String string6,
            boolean b, int i) {
        //TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Boolean getDataNascimento() {
        return dataNascimento;
    }
    
    public String getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(String dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    public void setDataNascimento(Boolean dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Boolean getDataAtualizacao() {
        return dataAtualizacao;
    }
    public void setDataAtualizacao(Boolean dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
}
