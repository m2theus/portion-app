package utfpr.com.br.portion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;

public class BebidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida);
    }

    public void onClickVoltar(View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }

    public void toCalcular (View view) {
        Intent calcular = new Intent( this, ResultadoActivity.class);

        EditText editTextPeso1 = findViewById(R.id.edit1);
        EditText editTextPreco1 = findViewById(R.id.edit2);

        BigDecimal valorPeso1 = new BigDecimal(editTextPeso1.getText().toString());
        BigDecimal valorPreco1 = new BigDecimal(editTextPreco1.getText().toString());

        BigDecimal resultOpcao1 = valorPreco1.divide(valorPeso1);

        EditText editTextPeso2 = findViewById(R.id.edit3);
        EditText editTextPreco2 = findViewById(R.id.edit4);

        BigDecimal valorPeso2 = new BigDecimal(editTextPeso2.getText().toString());
        BigDecimal valorPreco2 = new BigDecimal(editTextPreco2.getText().toString());

        BigDecimal resultOpcao2 = valorPreco2.divide(valorPeso2);

        if ( resultOpcao1.compareTo(resultOpcao2) == 1) {
            calcular.putExtra("resultado", "opcao2");
        } else {
            calcular.putExtra("resultado", "opcao1");
        }
        startActivity(calcular);
    }
}
