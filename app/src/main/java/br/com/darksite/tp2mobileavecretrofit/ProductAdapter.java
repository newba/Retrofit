package br.com.darksite.tp2mobileavecretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by msant on 2017-11-03.
 */

public class ProductAdapter extends ArrayAdapter<Product>{

    private final Context context;
    private final List<Product> elements;

    public ProductAdapter(Context context, List<Product> eproducts) {
        super(context, R.layout.line, eproducts);
        this.context = context;
        this.elements = eproducts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.line, parent, false);

        TextView productName = (TextView) rowView.findViewById(R.id.txtNome);
        //TextView productDescription = (TextView)rowView.findViewById(R.id.tx)
        TextView ano = (TextView) rowView.findViewById(R.id.txtAno);
        TextView autor = (TextView) rowView.findViewById(R.id.txtAutor);

        titulo.setText(elementos.get(position).getNome());
        autor.setText(elementos.get(position).getAutor());
        ano.setText(Integer.toString(elementos.get(position).getAno()));

        return rowView;
    }



}
