package com.alvindev.project3alvin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] skill = {"Basic", "Intermediate", "Advance"};
    String [] lang = {"Java", "Python", "Swift", "Kotlin", "Javascript", "PHP"};

    TextView txtOutput;
    Button submit;
    Spinner progSkill, progLang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOutput = findViewById(R.id.txtOutput);
        progLang  = findViewById(R.id.spinLang);
        progSkill = findViewById(R.id.spinSkill);
        ArrayAdapter aaskill = new ArrayAdapter(this, R.layout.spinnerstyle,skill);
        aaskill.setDropDownViewResource(R.layout.spinnerstyle);
        progSkill.setAdapter(aaskill);
        ArrayAdapter aalang = new ArrayAdapter(this, R.layout.spinnerlang, lang);
        aalang.setDropDownViewResource(R.layout.spinnerlang);
        progLang.setAdapter(aalang);

        submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText("Pilihan Skill Anda  : " +
                        progSkill.getSelectedItem().toString() +
                        "\n Pilihan Bahasa Anda   : " +
                        progLang.getSelectedItem().toString());
            }
        });


    }
}