package br.fasam.mobile.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtMarca;
    EditText txtModelo;
    EditText txtCor;
    EditText txtEspecificações;
    EditTest Tamanho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        //ENTRADA

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);

        //PROCESSAMENTO
        String nome, sobrenome, email, telefone;
        nome = txtNome.getText().toString();
        sobrenome = txtSobrenome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtTelefone.getText().toString();

        //SAÍDA
        //%s - string
        // %d - inteiro
        // %f - float
        String dados = String.format("Os dados digitados foram: Nome: %s\n Sobrenome: %s\n Email: %s\n Telefone: %s",
                nome,sobrenome, email, telefone);
        Toast.makeText(this, dados, Toast.LENGTH_LONG).show();

    }
}