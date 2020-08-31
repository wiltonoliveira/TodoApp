package br.ucsal.todoapp.dao;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.todoapp.model.Tarefa;

public class TarefaDAO {

    private static List<Tarefa> tarefas = new ArrayList<>();

    public void salvar(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public List<Tarefa> todas() {
        return new ArrayList<>(tarefas);
    }
}
