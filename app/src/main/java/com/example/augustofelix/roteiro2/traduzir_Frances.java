package com.example.augustofelix.roteiro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class traduzir_Frances extends AppCompatActivity {

   private TextView mTraduzir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir__frances);
        mTraduzir = (TextView) findViewById(R.id.traduzir);
        Bundle b = getIntent().getExtras();
        String traduzir = b.getString("texto");
        if(traduzir.equalsIgnoreCase("Azul")){
            mTraduzir.setText("Tradução da cor " + traduzir + " em frances é: Bleu");
        }
        else if(traduzir.equalsIgnoreCase("Vermelho")) {
            mTraduzir.setText("Tradução da cor " + traduzir + " em frances é: Rouge");
        }
        else{
            mTraduzir.setText("Tradução da cor " + traduzir + " em frances é: Jaune");
        }
        ((Button)findViewById(R.id.btn5)).setOnClickListener(new OnCLick());
    }
    private class OnCLick implements View.OnClickListener {
        public void onClick(View v) {

            finish();
        }
    }
}
