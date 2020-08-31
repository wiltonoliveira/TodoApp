package br.ucsal.todoapp.model;

public class Tarefa {

    private String titulo;
    private Integer prioridade;

    public Tarefa(String titulo, Integer prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
    }


    @Override
    public String toString() {
        return titulo + "  P:" + prioridade;
    }
}
