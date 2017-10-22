package jrl.deint.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {

    private GridLayout gridDashboard;
    private ClickListenerDashboard listenerDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        gridDashboard=(GridLayout)findViewById(R.id.gridDashboard);

        // Definir un array de int, que contendrá el id de las imágenes
        /*int[] images = {R.drawable.chair, R.drawable.closet, R.drawable.cpu, R.drawable.keyboard, R.drawable.monitor,
                        R.drawable.mouse, R.drawable.printer, R.drawable.proyector, R.drawable.table, R.drawable.whiteboard,
                        R.drawable.inventory};
        */

        int[] images = {R.drawable.inventory, R.drawable.products, R.drawable.dependencies, R.drawable.sections, R.drawable.preferences};

        // No se utiliza en Java/Android array de objetos. Se utiliza Vector o Colecciones que son más eficientes.
        //ImageView[] imageViews = new ImageView[images.length];

        // No utilizamos la clase Vector porque no trabajamos con hilos y no se requiere sincronización
        //Vector<ImageView> vectorImageViews = new Vector<ImageView>();
        /*
        // ArrayList debe ser parametrizado
        ArrayList arrayImageViews = new ArrayList();
        for(int i=0; i<images.length; i++) {
            arrayImageViews.add(new ImageView(this));
            if(arrayImageViews.get(i) instanceof ImageView) {
                ((ImageView)arrayImageViews.get(i)).setImageResource(images[i]);
            }
        }
        */
        listenerDashboard = new ClickListenerDashboard();
        ImageView imageView;
        float width = getResources().getDimension(R.dimen.imgDashboardWidth);
        float heigth = getResources().getDimension(R.dimen.imgDashboardHeight);

        for(int i=0; i<images.length; i++) {
            imageView = new ImageView(this);
            imageView.setId(images[i]);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = (int)width;
            params.height = (int)heigth;
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            imageView.setImageResource(images[i]);
            imageView.setLayoutParams(params);
            gridDashboard.addView(imageView);
        }

    }

    class ClickListenerDashboard implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.drawable.inventory:
                    intent = new Intent(DashboardActivity.this, InventoryActivity.class);
                    break;
                case R.drawable.products:
                    intent = new Intent(DashboardActivity.this, ProductActivity.class);
                    break;
                case R.drawable.dependencies:
                    intent = new Intent(DashboardActivity.this, DependenciesActivity.class);
                    break;
                case R.drawable.sections:
                    intent = new Intent(DashboardActivity.this, SectionsActivity.class);
                    break;
                case R.drawable.preferences:
                    intent = new Intent(DashboardActivity.this, PreferencesActivity.class);
            }
            startActivity(intent);
        }
    }
}
