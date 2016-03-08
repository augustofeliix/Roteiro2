package com.example.augustofelix.roteiro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_traduzir_ingles extends AppCompatActivity {
    private TextView mCor;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_ingles);
        mCor = (TextView) findViewById(R.id.traduzir);
        Bundle b = getIntent().getExtras();
        String cor = b.getString("texto");
        if (cor.equalsIgnoreCase("Azul")) {
            mCor.setText("Tradução da cor " + cor + " em ingles é: Blue");
        } else if (cor.equalsIgnoreCase("Vermelho")) {
            mCor.setText("Tradução da cor " + cor + " em ingle é: Red");
        } else {
            mCor.setText("Tradução da cor " + cor + " em ingles é: yellow");
        }
        ((Button) findViewById(R.id.btn4)).setOnClickListener(new OnCLick());
    }

    private class OnCLick implements View.OnClickListener {
        public void onClick(View v) {

            finish();
        }

    }
}
