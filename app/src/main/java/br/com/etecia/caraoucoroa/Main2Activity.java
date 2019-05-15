package br.com.etecia.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imgMoeda = findViewById(R.id.imgMoeda);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        Bundle extras = getIntent().getExtras();

        String valorGerado = extras.getString("numeroRandom");

        if(valorGerado.equals("0")){
            imgMoeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
        } else {
            imgMoeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));

        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
            }
        });

    }
}
