package com.example.edadperruna;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        EditText edadedit = findViewById(R.id.edad);
        TextView result = findViewById(R.id.resultado);
        Button btn = findViewById(R.id.btnCalcular);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = edadedit.getText().toString();
                if (!edad.isEmpty()) {
                    int edadint = Integer.parseInt(edad);
                    int resultado = edadint * 7;
                    String resultadoString = "La edad del canino es de: " + resultado + " años";
                    result.setText(resultadoString);
                }
            }
        });
    }
}