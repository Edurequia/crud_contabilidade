package com.dudu.crud_contabilidade.entities;


import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String cidade;
    private String estado;
    @Column(nullable = false)
    private boolean isCliente;

    public Pessoa() {}

    public Pessoa(Long codigo, String nome, String cidade, String estado, boolean isCliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.isCliente = isCliente;
    }

    public Pessoa(String nome, String cidade, String estado, boolean isCliente) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.isCliente = isCliente;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean getIsCliente() {
        return isCliente;
    }

    public void setIsCliente(boolean isCliente) {
        isCliente = isCliente;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", isCliente=" + isCliente +
                '}';
    }
}
