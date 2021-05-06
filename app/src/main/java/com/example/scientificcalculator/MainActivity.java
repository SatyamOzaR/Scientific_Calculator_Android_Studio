package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_dot,btn_ac,btn_c,btn_b1,btn_b2,btn_sin,
            btn_cos,btn_tan,btn_log,btn_ln,btn_fact,btn_x2,btn_akar,btn_inv,btn_div,btn_multiply,btn_minus,
            btn_plus,btn_equals,btn_phi;

    TextView text_small, text_big;
    String phi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        btn_dot = findViewById(R.id.btn_dot);
        btn_ac = findViewById(R.id.btn_ac);
        btn_c = findViewById(R.id.btn_c);
        btn_b1 = findViewById(R.id.btn_b1);
        btn_b2 = findViewById(R.id.btn_b2);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_tan = findViewById(R.id.btn_tan);
        btn_log = findViewById(R.id.btn_log);
        btn_ln = findViewById(R.id.btn_ln);
        btn_x2 = findViewById(R.id.btn_x2);
        btn_fact = findViewById(R.id.btn_fact);
        btn_akar = findViewById(R.id.btn_akar);
        btn_inv = findViewById(R.id.btn_inv);
        btn_div = findViewById(R.id.btn_div);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_minus = findViewById(R.id.btn_minus);
        btn_plus = findViewById(R.id.btn_plus);
        btn_equals = findViewById(R.id.btn_equals);
        btn_phi = findViewById(R.id.btn_phi);

        text_big = findViewById(R.id.text_big);
        text_small = findViewById(R.id.text_small);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"9");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"0");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+".");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(""); text_small.setText("");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = text_big.getText().toString();
                String val2 = text_small.getText().toString();

                if(!val.equals("") || !val2.equals("")) {
                    val = val.substring(0, val.length() -1);
                    text_big.setText(val);
                    text_small.setText(val);}
            }
        });
        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"(");
            }
        });
        btn_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+")");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"-");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"×");
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"÷");
            }
        });
        btn_akar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = text_big.getText().toString();

                if(!val.equals("")){
                    double r = Math.sqrt(Double.parseDouble(val));
                    text_big.setText(String.valueOf(r));}
            }
        });
        btn_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"^"+"(-1)");
            }
        });

        btn_phi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_small.setText(btn_phi.getText());
                text_big.setText(text_big.getText()+phi);

            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"sin");

            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"cos");

            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"tan");

            }
        });
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"log");

            }
        });
        btn_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_big.setText(text_big.getText()+"ln");

            }
        });
        btn_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(text_big.getText().toString());
                int fact = factorial(val);
                text_big.setText(String.valueOf(fact));
                text_small.setText(val+"!");
            }
        });

        btn_x2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(text_big.getText().toString());
                double square = d*d;
                text_big.setText(String.valueOf(square));
                text_small.setText(d+"²");
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = text_big.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×', '*');
                double result = eval(replacedstr);
                text_big.setText(String.valueOf(result));
                text_small.setText(val);
            }
        });

    }

    int factorial(int n){
        return (n==1 || n==0) ? 1:n*factorial(n-1);
    }
    
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }
        }.parse();
    }
}
