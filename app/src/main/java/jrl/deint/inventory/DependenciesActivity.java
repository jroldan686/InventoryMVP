package jrl.deint.inventory;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;


import jrl.deint.inventory.adapter.DependencyAdapter;
import jrl.deint.inventory.adapter.DependencyAdapterA;

public class DependenciesActivity extends AppCompatActivity {

    //private ArrayAdapter<Dependency> adapter;

    private DependencyAdapterA adapter;
    private ListView listView;
    private FloatingActionButton fab;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependencies);
        /*
        // CASO 1: Adapter no personalizado
        adapter = new ArrayAdapter<Dependency>(this,
                android.R.layout.simple_list_item_1,
                DependencyRepository.getInstance().getDependencies());
        getListView().setAdapter(dependencies);
        */
        // CASO 2: Adapter personalizado
        listView = (ListView)findViewById(android.R.id.list);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);

        setSupportActionBar(toolbar);
        adapter = new DependencyAdapterA(this);
        listView.setAdapter(adapter);

        // Al pulsar sobre el botón se visualizará el SnackBar y FAB se desplazará hacia arriba.
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(coordinatorLayout, "Ejemplo Snackbar", Snackbar.LENGTH_SHORT).show();
                startActivity(new Intent(DependenciesActivity.this, AddDependencyActivity.class));
            }
        });
    }

}
