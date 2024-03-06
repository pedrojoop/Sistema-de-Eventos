package sistema_evento.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Evento implements Serializable{
    private int id;
    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime horario;
    private String descricao;

    public Evento(int id, String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDateTime getHorario() {
        return this.horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }


    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereco + '\'' +
                ", categoria='" + categoria + '\'' +
                ", horario=" + horario +
                ", descrição='" + descricao + '\'' +
                '}';
    }
}
