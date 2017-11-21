package desafiomobfiq.com.appdesafiomobfiq.activitys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import desafiomobfiq.com.appdesafiomobfiq.R;
import desafiomobfiq.com.appdesafiomobfiq.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private ImageView imgVwBusca;
    private FragmentManager fragmentManager;
    private static Fragment courrentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgVwBusca = (ImageView) findViewById(R.id.img_vw_busca);
        courrentFragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, courrentFragment)
                .commit();
    }
}
