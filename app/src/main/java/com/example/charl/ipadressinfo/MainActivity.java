package com.example.charl.ipadressinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Calc;

    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView Mask;
    private TextView ID;
    private TextView BC;

    private int Num1;
    private int Num2;
    private int Num3;
    private int Num4;
    private int NumM;
    private int X1;
    private int X2;
    private int X3;
    private int X4;

    private String Comp1;
    private String Comp2;
    private String Comp3;
    private String Comp4;
    private String Comp5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calc = findViewById(R.id.Calc);

        Calc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Mask = findViewById(R.id.Mask);
                Comp1 = Mask.getText().toString();

                A = findViewById(R.id.One);
                Comp2 = A.getText().toString(); 

                B = findViewById(R.id.Two);
                Comp3 = B.getText().toString();

                C = findViewById(R.id.Three);
                Comp4 = C.getText().toString();

                D = findViewById(R.id.Four);
                Comp5 = D.getText().toString();

                if (!Comp1.isEmpty() & !Comp2.isEmpty() & !Comp3.isEmpty() & !Comp4.isEmpty() & !Comp5.isEmpty()) {

                    if (isNumeric(A,B,C,D,Mask) ) {

                    NumM = Integer.parseInt(Mask.getText().toString());
                    Num1 = Integer.parseInt(A.getText().toString());
                    Num2 = Integer.parseInt(B.getText().toString());
                    Num3 = Integer.parseInt(C.getText().toString());
                    Num4 = Integer.parseInt(D.getText().toString());


                        if (Num1 <= 255 & Num2 <= 255 & Num3 <= 255 & Num4 <= 255) {

                            if (Num1 >= 0 & Num2 >= 0 & Num3 >= 0 & Num4 >= 0) {

                                if (NumM == 24) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");
                                }

                                if (NumM == 16) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");
                                }

                                if (NumM == 8) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");
                                }


                            }
                        }
                    }

                }
            }
        });
    }

    private static boolean isNumeric(TextView A, TextView B, TextView C, TextView D, TextView Mask){
        try {


            String One = A.getText().toString();
            String Two = B.getText().toString();
            String Three= C.getText().toString();
            String Four = D.getText().toString();
            String Masked = Mask.getText().toString();

            Integer.parseInt(One);
            Integer.parseInt(Two);
            Integer.parseInt(Three);
            Integer.parseInt(Four);
            Integer.parseInt(Masked);

            return true;

        } catch (NumberFormatException nfe){


            return false;
        }
    }
}

