package br.ucsal.todoapp;

import android.app.Activity;
import android.content.Intent;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.ucsal.todoapp.dao.TarefaDAO;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fba;
    private ListView listView;
    private final TarefaDAO dao = new TarefaDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("TAREFAS");
        this.setContentView(R.layout.activity_main);
        fba = findViewById(R.id.floatingActionButton);
        listView = findViewById(R.id.lista);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todas());
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("TAREFA", "POSIÇÃO "+position);
            }
        });
    }



    public void click(View view) {
        Intent intent = new Intent(this,TarefaActivity.class);
        startActivity(intent);
   }

  }
