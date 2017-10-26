package jrl.deint.inventory;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import jrl.deint.inventory.adapter.DependencyAdapter;
import jrl.deint.inventory.pojo.Dependency;
import jrl.deint.inventory.pojo.InventoryApplication;
import jrl.deint.inventory.repository.DependencyRepository;

public class DependenciesActivity extends ListActivity {

    //private ArrayAdapter<Dependency> adapter;

    private DependencyAdapter adapter;

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
        adapter = new DependencyAdapter(this);
        getListView().setAdapter(adapter);
    }
}
