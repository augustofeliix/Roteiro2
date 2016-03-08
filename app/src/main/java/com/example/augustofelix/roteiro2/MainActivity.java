package com.example.augustofelix.roteiro2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mCor;
    private Button mbtn;
    private Button mbtn2;
    private Button mbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCor = (EditText) findViewById(R.id.cor);
        mbtn = (Button) findViewById(R.id.btn);
        mbtn2 = (Button) findViewById(R.id.btn2);
        mbtn3 = (Button) findViewById(R.id.btn3);

        mbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if (cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("Vermelho") || cor.equalsIgnoreCase("Amarelo")) {
                    Bundle b = new Bundle();
                    b.putString("texto", cor);
                    Intent i = new Intent("Traduzir");
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    View focus = null;
                    mCor.setError("Cor invalida");
                    focus = mCor;
                    focus.requestFocus();
                }
            }
        });

        mbtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if (cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("Vermelho") || cor.equalsIgnoreCase("Amarelo")) {
                    Bundle b = new Bundle();
                    b.putString("texto", cor);
                    Intent i = new Intent("Traduzir").addCategory("Traduzir_Ingles");
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    View focus = null;
                    mCor.setError("Cor invalida");
                    focus = mCor;
                    focus.requestFocus();
                }
            }
        });

        mbtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String cor = mCor.getText().toString();
                if (cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("Vermelho") || cor.equalsIgnoreCase("Amarelo")) {
                    Bundle b = new Bundle();
                    b.putString("texto", cor);
                    Intent i = new Intent("Traduzir").addCategory("Traduzir_Frances");
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    View focus = null;
                    mCor.setError("Cor invalida");
                    focus = mCor;
                    focus.requestFocus();
                }
            }
        });

    }
}
