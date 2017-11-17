package jrl.deint.inventoryMVP.ui.inventory;

import android.app.Application;
import java.util.ArrayList;
import jrl.deint.inventoryMVP.data.db.model.Dependency;

public class InventoryApplication extends Application {

    ArrayList<Dependency> dependencies;

    public InventoryApplication() {
        dependencies = new ArrayList();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
