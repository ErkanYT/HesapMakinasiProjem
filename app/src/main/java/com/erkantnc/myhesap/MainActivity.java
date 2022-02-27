package com.erkantnc.myhesap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1; // tanımlama
    EditText sayi2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 = findViewById(R.id.sayi1); //tanımlama işlemleri
        sayi2 = findViewById(R.id.sayi2);
        sonuc = findViewById(R.id.sonuc);

    }


    public void topla(View view) {

        int issayi1 = Integer.parseInt(sayi1.getText().toString());// burda sayıları çektim
        int issayi2 = Integer.parseInt(sayi2.getText().toString());

        int toplam = issayi1 + issayi2; //toplattım

        sonuc.setText("Sonuç: " + toplam); //yazdırdım

    }

}

///PWD BY ERKAN .... tuncax.com