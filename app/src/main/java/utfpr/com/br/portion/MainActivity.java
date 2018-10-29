package utfpr.com.br.portion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText portionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toBebida(View view)
    {
        Intent intent = new Intent(MainActivity.this, BebidaActivity.class);
        startActivity(intent);
    }

    public void toComida(View view)
    {
        Intent intent = new Intent(MainActivity.this, ComidaActivity.class);
        startActivity(intent);
    }
}
