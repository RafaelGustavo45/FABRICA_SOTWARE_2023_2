package br.edu.univille.projeto_fabrica_software.entity;

import jakarta.persistence.*;

@Entity
public class ClienteReparo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 1000)
    private String nome;
    private long cpf;
    private String u;

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long  getCpf() {
        return cpf;
    }

    public void setCpf(long  cpf) {
        this.cpf = cpf;
    }

}
