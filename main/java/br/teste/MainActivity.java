package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResp;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0, btnBar, btnMunti,btnSoma, btnSub, btnQuad, btnSen, btnCos, btnEqual;
    String op="";
    Double v1 = 0.0;
    ImageButton imageButtonDel;
    ImageButton imageButtonRaiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResp = findViewById(R.id.txtResp);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnBar = findViewById(R.id.btnBar);
        btnMunti = findViewById(R.id.btnMunti);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnQuad = findViewById(R.id.btnQuad);
        imageButtonRaiz = findViewById(R.id.imageButtonRaiz);
        btnSen = findViewById(R.id.btnSen);
        btnCos = findViewById(R.id.btnCos);
        imageButtonDel = findViewById((R.id.imageButtonDel));
        btnEqual = findViewById(R.id.btnEqual);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                    String d = txtResp.getText().toString() + "1" ;
                    txtResp.setText(d);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "2"  ;
                txtResp.setText(d);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() +"3" ;
                txtResp.setText(d);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "4" ;
                txtResp.setText(d);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "5" ;
                txtResp.setText(d);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "6" ;
                txtResp.setText(d);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "7" ;
                txtResp.setText(d);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() + "8" ;
                txtResp.setText(d);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txtResp.getText().toString().equals("0")) {
                    txtResp.setText("");
                }
                String d =  txtResp.getText().toString() +"9" ;
                txtResp.setText(d);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d =  txtResp.getText().toString() + "0" ;
                txtResp.setText(d);
            }
        });

        btnQuad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "q";
                txtResp.setText("");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "-";
                txtResp.setText("");
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String d =  txtResp.getText().toString() + "+" ;
                //txtResp.setText(d);
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "+";
                txtResp.setText("");
            }
        });

        btnBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "/";
                txtResp.setText("");
            }
        });

        btnMunti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "X";
                txtResp.setText("");
            }
        });

        btnSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "sen";
                txtResp.setText("");
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "cos";
                txtResp.setText("");
            }
        });

        imageButtonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResp.setText("");
            }
        });

        imageButtonRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = txtResp.getText().toString();
                v1 = Double.parseDouble(x);
                op = "√";
                txtResp.setText("");
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(op.equals("+")) {
                    String s2 = txtResp.getText().toString();
                    double v2 = Double.parseDouble(s2);
                    Double resultado = v1 + v2;
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("-")){
                    String s2 = txtResp.getText().toString();
                    double v2 = Double.parseDouble(s2);
                    Double resultado = v1 - v2;
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("X")){
                    String s2 = txtResp.getText().toString();
                    double v2 = Double.parseDouble(s2);
                    Double resultado = v1 * v2;
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("/")){
                    String s2 = txtResp.getText().toString();
                    double v2 = Double.parseDouble(s2);
                    Double resultado = v1 / v2;
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("√")){
                    Double resultado = Math.sqrt(v1);
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("cos")){
                    Double resultado = Math.cos(Math.toRadians(v1));
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("sen")){
                    Double resultado = Math.sin(Math.toRadians(v1));
                    txtResp.setText(resultado+"");
                }
                else if(op.equals("q")){
                    Double resultado = Math.pow(v1,2);
                    txtResp.setText(resultado+"");
                }

            }
        });
    }
}