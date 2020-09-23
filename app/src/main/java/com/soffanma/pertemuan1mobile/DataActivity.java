package com.soffanma.pertemuan1mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    private TextView tvNamaNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvNamaNim = findViewById(R.id.tvNamaNim);
        String nama = getIntent().getStringExtra("Nama");
        String nim = getIntent().getStringExtra("NIM");
        tvNamaNim.setText("Nama : " + nama + "\n" + "NIM : " + nim);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}