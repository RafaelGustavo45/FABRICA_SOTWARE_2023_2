package br.edu.univille.projeto_fabrica_software.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Manutencao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Date data;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }


}
