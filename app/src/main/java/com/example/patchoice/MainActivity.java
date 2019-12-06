package com.example.patchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check1;
    TextView tvTitle;
    RadioGroup rGroup1;
    RadioButton rdodog,rdocat,rdorabbit;
    Button btn1;
    ImageView imge1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check1=(CheckBox)findViewById(R.id.check1);
        tvTitle=(TextView)findViewById(R.id.whats1);
        rGroup1=(RadioGroup)findViewById(R.id.rdog1);
        rdodog=(RadioButton)findViewById(R.id.dog1);
        rdocat=(RadioButton)findViewById(R.id.cat1);
        rdorabbit=(RadioButton)findViewById(R.id.rabbit1);
        btn1=(Button)findViewById(R.id.btn1);
        imge1=(ImageView)findViewById(R.id.answer1);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check1.isChecked()==true){
                    tvTitle.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    imge1.setVisibility(View.VISIBLE);
                }else {
                    tvTitle.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    imge1.setVisibility(View.INVISIBLE);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.dog1:
                        imge1.setImageResource(R.drawable.dog);
                        break;
                    case R.id.cat1:
                        imge1.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rabbit1:
                        imge1.setImageResource(R.drawable.rabbit);
                        break;
                        default:
                            Toast.makeText(getApplicationContext(),"동물을 먼저 선택하세요.",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
