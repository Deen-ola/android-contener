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
    String[] navire={"Maersk Seak","MSC","Hanjin","CMA CGM","Titan"};
    String[] numero={"MSKU1344","MSC0217","EMCU16783","CMAU1488","TTU1248"};
    String[] datedarriver={"12/12/2019","12/11/2019","02/10/2019","12/12/2020","12/12/2021"};
    String[] details={
            "Le conteneur MSKU1344 a demarré du port le 12/12/2019 à 04h sur le navire Maersk Seak en transportant des marchandises pour stopper trois jours après au port de Yaounde",
            "Le conteneur MSC0217 ademarré du port le 12/11/2019 à 06h45 sur  le navire MSC en transportant des marchandises automobiles pour sttopper deux jours après au port du burkina faso",
            "Le conteneur EMCU16783 a demarré du port le 02/10/2020 à 08h sur le navire Hanjin en transportant des marchandise vestimentaires pour stopper une semaine apres au port d'Abuja",
            "Le conteneur CMAU1488 a demarré du port le 12/12/2021 a 22h05 sur le navire CMA CGM en transportant des marchandises agroalimmentaires pour stopper un mois après au port du burkina",
            "Le conteneur TTU1248 a demarré du port le 12/12/2021 a 06h45 sur le navire TITAN en transportant des marchandises immobilieres pour stopper au port de Yamoussokro"
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imagec=findViewById(R.id.imagecma);
        navc=findViewById(R.id.navire);
        numc=findViewById(R.id.numero);
        datec=findViewById(R.id.date);
        detailsc=findViewById(R.id.date);

        Intent intent=getIntent();
        String compagnie= intent.getStringExtra("compagnie");
        int pos= intent.getIntExtra("positions",0);

        imagec.setImageResource(img[pos]);
        compc.setText(compagnie);
        navc.setText(navire[pos]);
        numc.setText(numero[pos]);
        datec.setText(datedarriver[pos]);
        details.setText(details[pos]);


    }
}