package br.edu.univille.projeto_fabrica_software.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marca;
    private String placa;

    @OneToMany
    @JoinColumn(name= "id_carro")
    private List<Manutencao> listaHistoricoManutencao = new ArrayList<>();

    public List<Manutencao> getListaHistoricoManutencao() {
        return listaHistoricoManutencao;
    }
    public void setListaHistoricoManutencao(List<Manutencao> listaHistoricoManutencao) {
        this.listaHistoricoManutencao = listaHistoricoManutencao;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
