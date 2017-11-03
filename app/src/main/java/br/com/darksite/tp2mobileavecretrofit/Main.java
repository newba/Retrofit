package br.com.darksite.tp2mobileavecretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button btnProduits, btnFournisseurs, btnClients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnProduits = (Button)findViewById(R.id.btnProduits);
        btnProduits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iproduct = new Intent(Main.this, ProductsList.class);
                startActivity(iproduct);

            }
        });

        btnFournisseurs = (Button)findViewById(R.id.btnFournisseurs);
        btnFournisseurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isupplier = new Intent(Main.this, SupplierList.class);
                startActivity(isupplier);

            }
        });

        btnClients = (Button)findViewById(R.id.btnClients);
        btnClients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iclient = new Intent(Main.this, ClientList.class);
                startActivity(iclient);

            }
        });

    }
}
