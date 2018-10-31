package utfpr.com.br.portion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView meuTexto = (TextView) findViewById(R.id.textoTeste);
        Intent objetoIntent = getIntent();
        String texto = objetoIntent.getStringExtra("resultado");
        meuTexto.setText(texto);
    }

    public void onClickVoltar(View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}
