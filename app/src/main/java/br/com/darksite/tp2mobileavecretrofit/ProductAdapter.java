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
    TextView productName, productDescription, productInventory, productPrice, productCode;

    public ProductAdapter(Context context, List<Product> eproducts) {
        super(context, R.layout.linha, eproducts);
        this.context = context;
        this.elements = eproducts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha, parent, false);

        productName = (TextView) rowView.findViewById(R.id.txtNome);
        productDescription = (TextView)rowView.findViewById(R.id.txtDescription);
        productInventory = (TextView) rowView.findViewById(R.id.txtInventory);
        productPrice = (TextView) rowView.findViewById(R.id.txtPrice);
        productCode = (TextView) rowView.findViewById(R.id.txtCode);


        productName.setText(elements.get(position).getName());
        productDescription.setText(elements.get(position).getDescription());
        productInventory.setText(Integer.toString(elements.get(position).getInventoryActual()));
        productPrice.setText(Integer.toString(elements.get(position).getPrice()));
        productCode.setText(elements.get(position).getCode());

        return rowView;
    }



}
