package jrl.deint.inventory;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import jrl.deint.inventory.pojo.Dependency;
import jrl.deint.inventory.pojo.InventoryApplication;

public class DependenciesActivity extends ListActivity {

    private ArrayAdapter<Dependency> dependencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependencies);
        dependencies = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1, ((InventoryApplication)getApplicationContext()).getDependencies());
        getListView().setAdapter(dependencies);
    }
}
