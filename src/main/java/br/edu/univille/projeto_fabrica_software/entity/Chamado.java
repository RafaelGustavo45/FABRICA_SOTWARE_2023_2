package br.edu.univille.projeto_fabrica_software.entity;
import jakarta.persistence.*;

@Entity
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Computador pc;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private ClienteReparo cliente_reparo;
    
    private long codigo_chamado;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Computador getPc() {
        return pc;
    }
    public void setPc(Computador pc) {
        this.pc = pc;
    }
    public ClienteReparo getCliente_reparo() {
        return cliente_reparo;
    }
    public void setCliente_reparo(ClienteReparo cliente_reparo) {
        this.cliente_reparo = cliente_reparo;
    }
    public long getCodigo_chamado() {
        return codigo_chamado;
    }
    public void setCodigo_chamado(long codigo_chamado) {
        this.codigo_chamado = codigo_chamado;
    }





}
