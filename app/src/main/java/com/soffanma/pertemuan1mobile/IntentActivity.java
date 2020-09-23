package com.soffanma.pertemuan1mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {

    private Button btnMove;
    private Button btnMoveWithData;
    private Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        btnMove = findViewById(R.id.btnMove);
        btnMoveWithData = findViewById(R.id.btnMoveWithData);
        btnDial = findViewById(R.id.btnDial);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnMoveWithData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, DataActivity.class);
                intent.putExtra("Nama", "Soffan Marsus Ahmad");
                intent.putExtra("NIM", "21120119130042");
                startActivity(intent);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "082113613388";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
            }
        });

    }
}