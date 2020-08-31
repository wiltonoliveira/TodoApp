package br.ucsal.todoapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.ucsal.todoapp.dao.TarefaDAO;
import br.ucsal.todoapp.model.Tarefa;

public class TarefaActivity extends AppCompatActivity {

    private EditText titulo;
    private EditText prioridade;
    private final TarefaDAO dao = new TarefaDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa);
        setTitle("NOVA TAREFA");
        titulo = findViewById(R.id.tarefa_activity_titulo_txt);
        prioridade = findViewById(R.id.tarefa_activity_prioridade_txt);

    }


    public void salvar(View v){
        Tarefa tarefa = new Tarefa(titulo.getText().toString(), Integer.parseInt(prioridade.getText().toString()));
        Log.i("TAREFA",tarefa.toString());
        dao.salvar(tarefa);
        finish();
    }

}