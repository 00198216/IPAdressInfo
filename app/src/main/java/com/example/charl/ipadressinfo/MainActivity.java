package com.example.charl.ipadressinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button Calc;

    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView Mask;
    private TextView ID;
    private TextView BC;
    private TextView Cantidad;
    private TextView Host;
    private TextView Red;


    private int Num1;
    private int Num2;
    private int Num3;
    private int Num4;
    private int NumM;
    private int X1;
    private int X2;
    private int X3;
    private int X4;
    private int X5;
    private int X6;
    private int cant;
    private int ele;

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


                                //Cuando Mask es 0

                                if (NumM == 0) {


                                    X1 = Num1 & 0;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 255;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    //Host y Red tienen sus valores intercalados. Pero los valores van en la casilla correcta.

                                    Host = findViewById(R.id.Part1);
                                    Host.setText("-");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                }



                                //Cuando Mask es 1

                                if (NumM == 1) {


                                    X1 = Num1 & 128;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 64;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 128;
                                    X6= Num1 & 127;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 2

                                if (NumM == 2) {


                                    X1 = Num1 & 192;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 32;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 192;
                                    X6= Num1 & 63;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 3

                                if (NumM == 3) {


                                    X1 = Num1 & 224;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 16;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 224;
                                    X6= Num1 & 31;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 4

                                if (NumM == 4) {


                                    X1 = Num1 & 240;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 8;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 240;
                                    X6= Num1 & 15;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 5

                                if (NumM == 5) {


                                    X1 = Num1 & 248;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 4;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 248;
                                    X6= Num1 & 7;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 6

                                if (NumM == 6) {


                                    X1 = Num1 & 252;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 2;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 252;
                                    X6= Num1 & 3;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 7

                                if (NumM == 7) {


                                    X1 = Num1 & 254;
                                    X2 = Num2 & 0;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 1;
                                    X2 = Num2 | 255;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num1 & 254;
                                    X6= Num1 & 1;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 8

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

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2);

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(Comp3+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 9

                                if (NumM == 9) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 128;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 64;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 128;
                                    X6= Num2 & 127;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 10

                                if (NumM == 10) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 192;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 32;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 192;
                                    X6= Num2 & 63;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 11

                                if (NumM == 11) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 224;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 16;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 224;
                                    X6= Num2 & 31;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 12

                                if (NumM == 12) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 240;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 8;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 240;
                                    X6= Num2 & 15;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 13

                                if (NumM == 13) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 248;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 4;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 248;
                                    X6= Num2 & 7;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 14

                                if (NumM == 14) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 252;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 2;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 252;
                                    X6= Num2 & 3;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 15

                                if (NumM == 15) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 254;
                                    X3 = Num3 & 0;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 1;
                                    X3 = Num3 | 255;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num2 & 254;
                                    X6= Num2 & 1;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp4+"."+Comp5);

                                }

                                //Cuando Mask es 16

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

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3);

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(Comp4+"."+Comp5);
                                }

                                //Cuando Mask es 17

                                if (NumM == 17) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 128;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 64;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 128;
                                    X6= Num3 & 127;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 18

                                if (NumM == 18) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 192;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 32;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 192;
                                    X6= Num3 & 63;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 19

                                if (NumM == 19) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 224;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 16;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 224;
                                    X6= Num3 & 31;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 20

                                if (NumM == 20) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 240;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 8;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 240;
                                    X6= Num3 & 15;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 21

                                if (NumM == 21) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 248;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 4;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 248;
                                    X6= Num3 & 7;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 22

                                if (NumM == 22) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 252;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 2;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 252;
                                    X6= Num3 & 3;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 23

                                if (NumM == 23) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 254;
                                    X4 = Num4 & 0;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 1;
                                    X4 = Num4 | 255;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num3 & 254;
                                    X6= Num3 & 1;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+""+"."+Comp5);

                                }

                                //Cuando Mask es 24

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

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4);

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(Comp5);
                                }

                                //Cuando Mask es 25

                                if (NumM == 25) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 128;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 64;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 128;
                                    X6= Num4 & 127;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 26

                                if (NumM == 26) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 192;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 32;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 192;
                                    X6= Num4 & 63;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 27

                                if (NumM == 27) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 224;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 16;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 224;
                                    X6= Num4 & 31;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 28

                                if (NumM == 28) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 240;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 8;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 240;
                                    X6= Num4 & 15;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 29

                                if (NumM == 29) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 248;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 4;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 248;
                                    X6= Num4 & 7;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 30

                                if (NumM == 30) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 252;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 2;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 252;
                                    X6= Num4 & 3;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 31

                                if (NumM == 31) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 254;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 1;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-2;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    X5= Num4 & 254;
                                    X6= Num4 & 1;

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(Comp2+"."+Comp3+"."+Comp4+"."+X5+"");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText(X6+"");

                                }

                                //Cuando Mask es 32

                                if (NumM == 32) {


                                    X1 = Num1 & 255;
                                    X2 = Num2 & 255;
                                    X3 = Num3 & 255;
                                    X4 = Num4 & 255;

                                    ID = findViewById(R.id.Clase);
                                    ID.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");


                                    X1 = Num1 | 0;
                                    X2 = Num2 | 0;
                                    X3 = Num3 | 0;
                                    X4 = Num4 | 0;


                                    BC = findViewById(R.id.Broadcast);
                                    BC.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    ele= 32-NumM;
                                    cant= (int) Math.pow(2,ele);
                                    cant= cant-1;

                                    Cantidad = findViewById(R.id.Cantidad);
                                    Cantidad.setText(cant+"");

                                    Host = findViewById(R.id.Part1);
                                    Host.setText(X1 + "" + "." + X2 + "" + "." + X3 + "" + "." + X4 + "");

                                    Red = findViewById(R.id.Part2);
                                    Red.setText("-");

                                }






                            }
                        }
                    }

                }
            }
        });
    }


    //Backup Check por si se logra insertar un valor no numerico

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

