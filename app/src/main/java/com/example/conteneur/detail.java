package com.example.conteneur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class detail extends AppCompatActivity {
    ImageView imagec;
    TextView compc,navc,numc,datec,detailsc;
    int[] img={R.drawable.maersk2,R.drawable.msc1,R.drawable.ever,R.drawable.cma1,R.drawable.titan};
    String[] navire={"Maersk Seak","MSC Aliya","Hanjin","CMA CGM Jacques Saade","Ever Ace"};
    String[] numero={"MSKU1344","MSC0217","EMCU16783","CMAU1488","TTU1248"};
    String[] datedarriver={"12/12/2019","12/11/2019","02/10/2019","12/12/2020","12/12/2021"};
    String[] details={
            "Le conteneur MSKU1344 a demarré du port de Barcelone le 01/12/2019 à 04h sur le navire Maersk Seak en transportant des marchandises en destination du port de Dakart",
            "Le conteneur MSC0217 a demarré du port de Cotonou le 24/10/2019 à 06h45 sur  le navire MSC Aliya en transportant des marchandises automobiles en destination  du port de Mombasa",
            "Le conteneur EMCU16783 a demarré du port d'Owendo le 17/09/2020 à 08h sur le navire Hanjin en transportant des produits vestimentaires en destination du port d'Alger",
            "Le conteneur CMAU1488 a demarré du port de Cotonou le 10/12/2021 a 22h05 sur le navire CMA CGM Jacques Saade en transportant des produits agroalimmentaires en destination du port de Tema",
            "Le conteneur TTU1248 a demarré du port de Tanger le 20/11/2021 a 06h45 sur le navire Ever Ace en transportant des produits vivrier en destination port de Lome"
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imagec=findViewById(R.id.imagecma);
        navc=findViewById(R.id.navire);
        numc=findViewById(R.id.numero);
        datec=findViewById(R.id.date);
        detailsc=findViewById(R.id.details);

        Intent intent=getIntent();
        String compagnie= intent.getStringExtra("compagnie");
        int pos= intent.getIntExtra("positions",0);

        imagec.setImageResource(img[pos]);
        compc.setText(compagnie);
        navc.setText(navire[pos]);
        numc.setText(numero[pos]);
        datec.setText(datedarriver[pos]);
        detailsc.setText(details[pos]);


    }
}