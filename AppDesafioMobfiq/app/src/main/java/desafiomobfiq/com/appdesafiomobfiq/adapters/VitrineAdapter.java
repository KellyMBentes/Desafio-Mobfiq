package desafiomobfiq.com.appdesafiomobfiq.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

import desafiomobfiq.com.appdesafiomobfiq.R;
import desafiomobfiq.com.appdesafiomobfiq.models.Produto;

public class VitrineAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Produto> produtos;
    private LayoutInflater mInflater;

    public VitrineAdapter(Context context, ArrayList <Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Produto getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        Produto item = produtos.get(position);
        view = mInflater.inflate(R.layout.item_produto, null);
        view.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, 1300));


        return view;

    }
}
