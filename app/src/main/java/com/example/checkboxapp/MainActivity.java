package com.example.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        CheckBox chk;
        TextView txvResult;
        String msg = "";

        //Array
        int [] id = {R.id.ch1,R.id.ch2,R.id.ch3,R.id.ch4};

        for (int i:id){
            chk = (CheckBox)findViewById(i);

            if(chk.isChecked())
                msg+="\n" + chk.getText();

            //else
                //msg = "請選擇!";
        }
        txvResult = (TextView)findViewById(R.id.textView2);
        txvResult.setText(msg);
    }
}
