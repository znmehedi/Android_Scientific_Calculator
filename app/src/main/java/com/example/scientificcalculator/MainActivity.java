package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ev;
    Button zero, one, two, three, four, five, six, seven, eight, nine, point, e;
    ImageButton equal, plus, minus, multiple, div, clr, ac, pi, eX, xN, fact;
    ImageButton inverse, nRoot, root, rad, sin, cos, tan, log, ln, bracl, bracr, mod;
    // extra variable
    private boolean pointGiven=false;//for point in on times
    private String action = new String();
    private double value1, value2=0;
    private boolean mIcon=false;//for Some mathmetical icon click identification
    private boolean tri_value=false;
    private boolean exponential=false;
    private final double e_val= 2.71828182;
    private final double pi_val= 3.141592;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv=(TextView)findViewById(R.id.ll0tv);
        ev=(EditText) findViewById(R.id.ll1et);


        one=(Button) findViewById(R.id.br5c1_1);
        two=(Button) findViewById(R.id.br5c2_2);
        three=(Button) findViewById(R.id.br5c3_3);
        four=(Button) findViewById(R.id.br4c1_4);
        five=(Button) findViewById(R.id.br4c2_5);
        six=(Button) findViewById(R.id.br4c3_6);
        seven=(Button) findViewById(R.id.br3c1_7);
        eight=(Button) findViewById(R.id.br3c2_8);
        nine=(Button) findViewById(R.id.br3c3_9);
        zero=(Button) findViewById(R.id.br6c2_0);
        point=(Button) findViewById(R.id.br6c3);
        e=(Button) findViewById(R.id.br6c1);

        equal=(ImageButton) findViewById(R.id.br6c4);
        plus=(ImageButton) findViewById(R.id.br5c4);
        minus=(ImageButton) findViewById(R.id.br4c4);
        multiple=(ImageButton) findViewById(R.id.br3c4);
        div=(ImageButton) findViewById(R.id.br2c4);
        clr=(ImageButton) findViewById(R.id.br2c2);
        ac=(ImageButton) findViewById(R.id.br2c1);
        pi=(ImageButton) findViewById(R.id.br6c0);
        eX=(ImageButton) findViewById(R.id.br5c0);
        xN=(ImageButton) findViewById(R.id.br4c0);
        fact=(ImageButton) findViewById(R.id.br3c0);

        inverse=(ImageButton) findViewById(R.id.br2c0);
        nRoot=(ImageButton) findViewById(R.id.br1c0);
        root=(ImageButton) findViewById(R.id.br0c0);
        rad=(ImageButton) findViewById(R.id.br0c1);
        sin=(ImageButton) findViewById(R.id.br0c2);
        cos=(ImageButton) findViewById(R.id.br0c3);
        tan=(ImageButton) findViewById(R.id.br0c4);
        log=(ImageButton) findViewById(R.id.br1c1);
        ln=(ImageButton) findViewById(R.id.br1c2);
        bracl=(ImageButton) findViewById(R.id.br1c3);
        bracr=(ImageButton) findViewById(R.id.br1c4);
        mod=(ImageButton) findViewById(R.id.br2c3);






        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"0");
                tv.setText(tv.getText()+"0");


                //mIcon=false;
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"1");
                tv.setText(tv.getText()+"1");

                //mIcon=false;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText() + "2");
                tv.setText(tv.getText()+"2");

                //mIcon=false;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"3");
                tv.setText(tv.getText()+"3");

                //mIcon=false;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"4");
                tv.setText(tv.getText()+"4");

                //mIcon=false;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"5");
                tv.setText(tv.getText()+"5");

                //mIcon=false;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"6");
                tv.setText(tv.getText()+"6");

                //mIcon=false;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"7");
                tv.setText(tv.getText()+"7");

                //mIcon=false;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"8");
                tv.setText(tv.getText()+"8");

                //mIcon=false;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"9");
                tv.setText(tv.getText()+"9");

                //mIcon=false;
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!pointGiven)
                {
                    if(ev.getText().length()==0)
                    {
                        ev.setText("0.");
                        tv.setText(tv.getText()+"0.");
                    }
                    else
                    {
                        ev.setText(ev.getText()+".");
                        tv.setText(tv.getText()+".");
                    }

                    pointGiven=true;
                }
                ev.setText(ev.getText());
                mIcon=false;
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"2.71828182");
                tv.setText(tv.getText()+"2.71828182");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="+";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    if(value1==0){
                        tv.setText("0+");
                    }
                    else
                        tv.setText(String.valueOf(value1)+"+");
                    mIcon = true;
                    ev.setText("");
                    pointGiven=false;
                }


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="-";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    if(value1==0.0){
                        tv.setText("0-");
                    }
                    mIcon = true;
                    ev.setText("");
                    tv.setText(String.valueOf(value1)+"-");
                }

            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="x";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    if(value1==0.0){
                        tv.setText("0x");
                    }
                    else
                        tv.setText(String.valueOf(value1)+"x");
                    mIcon = true;
                    ev.setText("");

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="/";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    if(value1==0.0){
                        tv.setText("0/");
                    }
                    else
                        tv.setText(String.valueOf(value1)+"/");
                    mIcon = true;
                    ev.setText("");

                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="%";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    mIcon = true;
                    ev.setText("");
                    tv.setText(String.valueOf(value1)+"%");
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = new String();
                tempString=ev.getText().toString();

                if(tempString.length()>0){
                    if(tempString.endsWith(".")){ // this is for assinging new dot
                        pointGiven=false;
                    }


                    tempString=(tempString.substring(0, tempString.length()-1));
                    String tempString2 =new String();
                    tempString2=tv.getText().toString();
                    tempString2=(tempString2.substring(0, tempString2.length()-1));
                    tv.setText(tempString2);
                    ev.setText(tempString);
                }


            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText("");
                tv.setText("");

                value1=0.0;
                value2=0.0;
                //extra variable
                pointGiven=false;
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ev.setText(ev.getText()+"3.141592");
                tv.setText(tv.getText()+"3.141592");
            }
        });
        eX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exponential = true;
                action = "eX";
                String tempString = new String();
                double val, valx;
                tempString = tv.getText().toString();
                if (tempString.length() != 0) {
                    val = Double.parseDouble(tempString);
                    valx = val;
                    //val=Math.toRadians(val);
                    //try{
                    val = Math.pow(e_val, val);
                    tempString = String.valueOf(val);
                    ev.setText(Html.fromHtml("e<sup><small>"+String.valueOf(valx)+"</small></sup>"));
                    tv.setText(tempString);
                    /*}
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }*/
                }
                else {
                    Toast.makeText(getApplicationContext(), "Input", Toast.LENGTH_SHORT).show();
                    ev.setText("");
                    tv.setText("");
                }
            }
        });
        xN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action="xN";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                if(!mIcon)
                {
                    value1=Double.parseDouble(tv.getText().toString());
                    mIcon = true;
                    //exponential=true;
                    ev.setText("");
                    tv.setText(String.valueOf(value1)+"^");
                    pointGiven=false;
                }

            }
        });


        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exponential = true;
                action = "fact";
                String tempString = new String();
                double val, valx;
                tempString = tv.getText().toString();
                if (tempString.length() != 0) {
                    val = Double.parseDouble(tempString);
                    valx = val;
                    //val=Math.toRadians(val);
                    //try{
                    //val = Math.pow(e_val, val);

                    if(val>=0){
                        val=facto((int)val);
                        tempString = String.valueOf(val);
                        ev.setText(String.valueOf(valx)+"!");
                        tv.setText(tempString);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        ev.setText("");
                        tv.setText("");
                    }
                    /*}
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }*/
                }
                else {
                    Toast.makeText(getApplicationContext(), "Input", Toast.LENGTH_SHORT).show();
                    ev.setText("");
                    tv.setText("");
                }
            }
        });
        inverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exponential = true;
                action = "inverse";
                String tempString = new String();
                double val, valx;
                tempString = tv.getText().toString();
                if (tempString.length() != 0) {
                    val = Double.parseDouble(tempString);
                    valx = val;
                    //val=Math.toRadians(val);
                    //try{
                    //val = Math.pow(e_val, val);

                    if(val!=0){
                        //val=facto((int)val);
                        tempString = String.valueOf(1/val);
                        ev.setText("1/"+String.valueOf(valx));
                        tv.setText(tempString);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        ev.setText("");
                        tv.setText("");
                    }
                    /*}
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }*/
                }
                else {
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                    ev.setText("");
                    tv.setText("");
                }
            }
        });
        nRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                action="nRoot";
                if((tv.getText().toString().length()==0)&&ev.getText().toString().length()==0)
                    Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                else
                    if(!mIcon)
                    {
                        value1=Double.parseDouble(tv.getText().toString());
                        mIcon = true;
                        ev.setText("");
                        tv.setText(Html.fromHtml("<sup><small>"+String.valueOf(value1)+"</small></sup>\u221a"));
                        pointGiven=false;
                    }
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exponential = true;
                action = "root";
                String tempString = new String();
                double val, valx;
                tempString = tv.getText().toString();
                if (tempString.length() != 0) {
                    val = Double.parseDouble(tempString);
                    valx = val;
                    //val=Math.toRadians(val);
                    //try{
                    //val = Math.pow(e_val, val);

                    if(val>=0.0){
                        //val=facto((int)val);
                        val=Math.sqrt(val);
                        tempString = String.valueOf(val);
                        ev.setText("\u221a"+String.valueOf(valx));
                        tv.setText(tempString);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        ev.setText("");
                        tv.setText("");
                    }
                    /*}
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }*/
                }
                else {
                    Toast.makeText(getApplicationContext(), "Input", Toast.LENGTH_SHORT).show();
                    ev.setText("");
                    tv.setText("");
                }
            }
        });
        rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="rad";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    //valx=val;
                    val=Math.toRadians(val);
                    /*try{
                        val=Math.sin(val);
                        tempString=String.valueOf(val);
                        */ev.setText("rad("+String.valueOf(tempString)+")");
                        tv.setText(String.valueOf(val));
                   // }
                    /*catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }*/
                }
                else ev.setText("rad(");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="sin";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    valx=val;
                    val=Math.toRadians(val);
                    try{
                        val=Math.sin(val);
                        tempString=String.valueOf(val);
                        ev.setText("sin("+String.valueOf(valx)+")");
                        tv.setText(tempString);
                    }
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else ev.setText("sin(");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="cos";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    valx=val;
                    val=Math.toRadians(val);
                    try{
                        val=Math.cos(val);
                        tempString=String.valueOf(val);
                        ev.setText("cos("+String.valueOf(valx)+")");
                        tv.setText(tempString);
                    }
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else ev.setText("cos(");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="tan";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    valx=val;
                    val=Math.toRadians(val);
                    try{
                        val=Math.tan(val);
                        tempString=String.valueOf(val);
                        ev.setText("tan("+String.valueOf(valx)+")");
                        tv.setText(tempString);
                    }
                    catch (ArithmeticException e){
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else ev.setText("tan(");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="log";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    valx=val;
                    //val=Math.toRadians(val);
                    if(val>0.0){
                        try{
                            val=Math.log(val);
                            tempString=String.valueOf(val);
                            ev.setText("log("+String.valueOf(valx)+")");
                            tv.setText(tempString);
                        }
                        catch (ArithmeticException e){
                            Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        ev.setText("");
                        tv.setText("");
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else ev.setText("log(");
            }
        });
        //(Math.log(x) / Math.log(b))--->ln formula
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri_value=true;
                action="ln";
                String tempString = new String();
                double val, valx;
                tempString=tv.getText().toString();
                if(tempString.length()!=0){
                    val=Double.parseDouble(tempString);
                    valx=val;
                    //val=Math.toRadians(val);
                    if(val>0.0){
                        try{
                            val=Math.log(val)/Math.log(e_val);
                            tempString=String.valueOf(val);
                            ev.setText("ln("+String.valueOf(valx)+")");
                            tv.setText(tempString);
                        }
                        catch (ArithmeticException e){
                            Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        ev.setText("");
                        tv.setText("");
                        Toast.makeText(getApplicationContext(),"Math Error",Toast.LENGTH_SHORT).show();
                    }
                }
                else ev.setText("ln(");
            }
        });
        bracl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tv.setText(tv.getText()+"(");
                ev.setText(ev.getText()+"(");
            }
        });
        bracr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tv.setText(tv.getText()+")");
                ev.setText(ev.getText()+")");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result;
                mIcon=false;
                /*if(ev.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Input", Toast.LENGTH_SHORT).show();
                    ev.setText("");
                    tv.setText("");
                }
                else {*/
                    if (!tri_value && !exponential && !(ev.getText().toString().isEmpty()))
                        value2 = Double.parseDouble(ev.getText().toString());

                    if (action.equals("+")) {
                        result = value1 + value2;
                        ev.setText(String.valueOf(result));
                        tv.setText(String.valueOf(result));

                    } else if (action.equals("-")) {
                        result = value1 - value2;
                        ev.setText(String.valueOf(result));
                        tv.setText(String.valueOf(result));

                    } else if (action.equals("x")) {
                        result = value1 * value2;
                        ev.setText(String.valueOf(result));
                        tv.setText(String.valueOf(result));

                    } else if (action.equals("/")) {
                        if (value2 != 0) {
                            result = value1 / value2;
                            ev.setText(String.valueOf(result));
                            tv.setText(String.valueOf(result));

                        } else {
                            ev.setText(String.valueOf(""));
                            tv.setText(String.valueOf(""));

                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        }
                    } else if (action.equals("%")) {
                        if (value2 != 0) {
                            result = value1 % value2;
                            ev.setText(String.valueOf(result));
                            tv.setText(String.valueOf(result));

                        } else {
                            ev.setText(String.valueOf(""));
                            tv.setText(String.valueOf(""));

                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        }
                    } else if (action.equals("sin")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        val = Math.toRadians(val);
                        try {
                            val = Math.sin(val);
                            tempString = String.valueOf(val);
                            if (!(ev.getText().toString().endsWith(")")))
                                ev.setText(ev.getText() + ")");

                            tv.setText(tempString);
                        } catch (ArithmeticException e) {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    } else if (action.equals("cos")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        val = Math.toRadians(val);
                        try {
                            val = Math.cos(val);
                            tempString = String.valueOf(val);
                            if (!(ev.getText().toString().endsWith(")")))
                                ev.setText(ev.getText() + ")");

                            tv.setText(tempString);
                        } catch (ArithmeticException e) {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    } else if (action.equals("tan")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        val = Math.toRadians(val);
                        try {
                            val = Math.tan(val);
                            tempString = String.valueOf(val);
                            if (!(ev.getText().toString().endsWith(")")))
                                ev.setText(ev.getText() + ")");

                            tv.setText(tempString);
                        } catch (ArithmeticException e) {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    } else if (action.equals("log")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        //val=Math.toRadians(val);
                        if (val > 0.0) {
                            try {
                                val = Math.log10(val);
                                tempString = String.valueOf(val);
                                if (!(ev.getText().toString().endsWith(")")))
                                    ev.setText(ev.getText() + ")");

                                tv.setText(tempString);
                            } catch (ArithmeticException e) {
                                Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                                ev.setText("");
                                tv.setText("");
                            }
                        } else if (ev.getText().toString() == "") {
                            Toast.makeText(getApplicationContext(), "Input", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        } else {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    }
                    //(Math.log(x) / Math.log(b)) -->ln formula
                    else if (action.equals("ln")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        //val=Math.toRadians(val);
                        if (val > 0.0) {
                            try {
                                val = Math.log(val) / Math.log(e_val);
                                tempString = String.valueOf(val);
                                if (!(ev.getText().toString().endsWith(")")))
                                    ev.setText(ev.getText() + ")");

                                tv.setText(tempString);
                            } catch (ArithmeticException e) {
                                Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                                ev.setText("");
                                tv.setText("");
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    } else if (action.equals("rad")) {
                        String tempString = new String();
                        tempString = tv.getText().toString();

                        double val = Double.parseDouble(tempString);
                        val = Math.toRadians(val);
                        if (val > 0.0) {
                            try {
                                //val=Math.log(val)/Math.log(e_val);
                                tempString = String.valueOf(val);
                                if (!(ev.getText().toString().endsWith(")")))
                                    ev.setText(ev.getText() + ")");

                                tv.setText(tempString);
                            } catch (ArithmeticException e) {
                                Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                                ev.setText("");
                                tv.setText("");
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                            ev.setText("");
                            tv.setText("");
                        }

                    } else if (action.equals("xN")) {
                        result = Math.pow(value1, value2);
                        ev.setText(Html.fromHtml(String.valueOf(value1) + "<sup><small>" + String.valueOf(value2)));
                        tv.setText(String.valueOf(result));

                    } else if (action.equals("nRoot")) {
                        if (value2 >= 0.0) {
                            result = Math.pow(value2, (1 / value1));
                            ev.setText(String.valueOf(result));
                            tv.setText(Html.fromHtml("<sup><small>" + String.valueOf(value1) + "</small></sup>\u221a" + String.valueOf(value2)));
                        } else {
                            ev.setText("");
                            tv.setText("");
                            Toast.makeText(getApplicationContext(), "Math Error", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else
                        Toast.makeText(getApplicationContext(), "Syntax Error", Toast.LENGTH_SHORT).show();

                    tri_value = false;
                    exponential = false;
                }
            //}
        });

    }
    int facto(int val){
        if (val == 0)
            return 1;
        else
            return(val * facto(val-1));
    }
}
