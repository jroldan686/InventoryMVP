package jrl.deint.inventory;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Vector;

public class DashboardActivity extends AppCompatActivity {

    private GridLayout gridDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        gridDashboard=(GridLayout)findViewById(R.id.gridDashboard);

        // Definir un array de int, que contendrá el id de las imágenes
        int[] images = {R.drawable.chair, R.drawable.closet, R.drawable.cpu, R.drawable.keyboard, R.drawable.monitor,
                        R.drawable.mouse, R.drawable.printer, R.drawable.proyector, R.drawable.table, R.drawable.whiteboard,
                        R.drawable.inventory};

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
        ImageView imageView;
        float width = getResources().getDimension(R.dimen.imgDashboardWidth);
        float heigth = getResources().getDimension(R.dimen.imgDashboardHeight);

        for(int i=0; i<images.length; i++) {
            imageView = new ImageView(this);
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
}
