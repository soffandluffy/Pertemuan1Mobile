package com.soffanma.pertemuan1mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etLength;
    private TextInputEditText etWidth;
    private TextInputEditText etHeight;
    private Button btnCount;
    private TextView tvResult;

    private TextInputLayout tiLLength;
    private TextInputLayout tilWidth;
    private TextInputLayout tilHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etLength = findViewById(R.id.etLength);
        etWidth = findViewById(R.id.etWidth);
        etHeight = findViewById(R.id.etHeight);
        tiLLength = findViewById(R.id.tilLength);
        tilWidth = findViewById(R.id.tilWidth);
        tilHeight = findViewById(R.id.tilHeight);
        btnCount = findViewById(R.id.btnCount);
        tvResult = findViewById(R.id.tvResult);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double length = 0;
                double width = 0;
                double height = 0;
                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(etLength.getText()) ){
                    isEmptyFields = true;
                    tiLLength.setError("Please fill this field");
                } else {
                    tiLLength.setError(null);
                    length = Double.parseDouble(etLength.getText().toString());
                }
                if (TextUtils.isEmpty(etWidth.getText())) {
                    isEmptyFields = true;
                    tilWidth.setError("Please fill this field");
                } else {
                    tilWidth.setError(null);
                    width = Double.parseDouble(etWidth.getText().toString());
                }
                if (TextUtils.isEmpty(etHeight.getText())) {
                    isEmptyFields = true;
                    tilHeight.setError("Please fill this field");
                } else {
                    tilHeight.setError(null);
                    height = Double.parseDouble(etHeight.getText().toString());
                }
                if (!isEmptyFields) {
                    double volume = length* width * height;
                    tvResult.setText(String.valueOf(volume));
                }
            }
        });

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            // Respond to the action bar's Up/Home button
//            case android.R.id.home:
//                NavUtils.navigateUpFromSameTask(this);
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}