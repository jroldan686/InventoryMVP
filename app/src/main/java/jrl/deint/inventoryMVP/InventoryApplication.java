package jrl.deint.inventoryMVP;

import android.app.Application;
import java.util.ArrayList;
import jrl.deint.inventoryMVP.pojo.Dependency;

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
