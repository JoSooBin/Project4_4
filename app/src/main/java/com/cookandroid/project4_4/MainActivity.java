package com.cookandroid.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cookandroid.project4_4.R;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnAdd, btnSub,btnMu1,btnDiv,btnRem;
    TextView textResult;
    String num1,num2;
    Double result;//실숫값 출력

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");//제목표시줄

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMu1 = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRem = (Button) findViewById(R.id.btnRem);//나머지

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) { // num1이나 num2를 입력하지 않을 경우
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
                }else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) { // num1이나 num2를 입력하지 않을 경우
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
                }else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) { // num1이나 num2를 입력하지 않을 경우
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
                }else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) { // num1이나 num2를 입력하지 않을 경우
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
                }else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) { // num1이나 num2를 입력하지 않을 경우
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력
                }else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

    }
}
