package jrl.deint.inventory;

import android.app.ListActivity;
import android.os.Bundle;


import jrl.deint.inventory.adapter.DependencyAdapterA;

public class DependenciesActivity extends ListActivity {

    //private ArrayAdapter<Dependency> adapter;

    private DependencyAdapterA adapter;

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
        adapter = new DependencyAdapterA(this);
        getListView().setAdapter(adapter);
    }

}
