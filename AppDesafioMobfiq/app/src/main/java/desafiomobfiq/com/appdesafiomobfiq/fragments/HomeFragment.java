package desafiomobfiq.com.appdesafiomobfiq.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

import desafiomobfiq.com.appdesafiomobfiq.R;
import desafiomobfiq.com.appdesafiomobfiq.adapters.VitrineAdapter;
import desafiomobfiq.com.appdesafiomobfiq.models.Produto;

public class HomeFragment extends Fragment {

    private GridView gvVitrine;
    private VitrineAdapter vitrineAdapter;
    private ArrayList<Produto> produtos;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        gvVitrine = (GridView) view.findViewById(R.id.gv_vitrine);
        produtos = new ArrayList<>();

        Produto produto1 = new Produto();

        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto1);
        produtos.add(produto1);produtos.add(produto1);


        vitrineAdapter = new VitrineAdapter(getContext(), produtos);

        gvVitrine.setAdapter(vitrineAdapter);

    }
}
