package com.mmb.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Principal extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDivision,btnMultiplicar,btnBorrarTodo,btnDEL,btnOFF;
    Button btnSuma,btnResta,btnRaiz, btnPorciento,btnParentesis,btnResultado,btnPunto,btnExponente,btnFactorial;
    Button btnSeno,btnCoseno,btnTangente,btnCosecante,btnSecante,btnCotangente;
    EditText etOperacion;
    int contadorParentesis,parentesisUsados;
    private boolean contenerAngulos=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Botones numeros
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);



        //Botones operaciones
        btnSuma=findViewById(R.id.btnSuma);
        btnResta=findViewById(R.id.btnRestar);
        btnMultiplicar=findViewById(R.id.btnMultiplicar);
        btnDivision=findViewById(R.id.btnDivision);
        btnRaiz=findViewById(R.id.btnRaiz);
        btnPorciento=findViewById(R.id.btnPorcentaje);
        btnParentesis=findViewById(R.id.btnParentesis);
        btnPunto=findViewById(R.id.btnPunto);
        btnFactorial=findViewById(R.id.btnFactorial);
        btnExponente=findViewById(R.id.btnExponente);
        btnSeno=findViewById(R.id.btnSeno);
        btnCoseno=findViewById(R.id.btnCoseno);
        btnTangente=findViewById(R.id.btnTangente);
        btnCotangente=findViewById(R.id.btnCotangente);
        btnSecante=findViewById(R.id.btnSecante);
        btnCosecante=findViewById(R.id.btnCosecante);

        //Botones funciones
        btnBorrarTodo=findViewById(R.id.btnBorrarTodo);
        btnDEL=findViewById(R.id.btnDel);
        btnResultado=findViewById(R.id.btnResultado);
        btnOFF=findViewById(R.id.btnOFF);

        //Mostrar
        etOperacion=findViewById(R.id.etOperacion);
        etOperacion.setInputType(InputType.TYPE_NULL);

        //Añadir numeros pulsados
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn0.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btn9.getText().toString());
            }
        });

        //Añadir operadores pulsados
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnSuma.getText().toString());

            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnResta.getText().toString());
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnMultiplicar.getText().toString());
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnDivision.getText().toString());
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnRaiz.getText().toString());
            }
        });
        btnPorciento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnPorciento.getText().toString());
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append(btnPunto.getText().toString());
            }
        });
        btnCoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("cos(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("sin(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("tan(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnCosecante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("csc(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnSecante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("sec(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnCotangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("ctg(");
                contadorParentesis=1;
                contenerAngulos=true;
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("!");

            }
        });
        btnExponente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.append("^(");
                contadorParentesis=1;
            }
        });


        //Añadir parentesis
        btnParentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contadorParentesis==0) {
                    contadorParentesis = 1;
                    etOperacion.append("(");
                }else if(contadorParentesis==1) {
                    etOperacion.append(")");
                    contadorParentesis=0;
                    parentesisUsados+=1;
                }
            }
        });

        //Borrar
        btnBorrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperacion.setText("");
                contadorParentesis=0;
                parentesisUsados=0;
            }
        });
        btnDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int longitudOperacion=etOperacion.length();
                String nuevo=etOperacion.getText().toString().substring(0,(longitudOperacion-1));
                etOperacion.setText(nuevo);
            }
        });

        btnOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        //Resultado
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contenerAngulos==true){
                    etOperacion.setText(angulos());
                }else if(etOperacion.getText().toString().contains("!")){
                    etOperacion.setText(factorial(etOperacion.getText().toString()));
                }else if(etOperacion.getText().toString().contains("√")) {
                    etOperacion.setText(raiz(etOperacion.getText().toString()));
                }else if(etOperacion.getText().toString().contains("^(")){
                    etOperacion.setText(exponente(etOperacion.getText().toString()));
                }else{etOperacion.setText(numeros());}


            }
        });

    }
    public String numeros() {
        String devolver=null;
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
            Object resultado = engine.eval(etOperacion.getText().toString());
            devolver=String.valueOf(resultado);
        } catch (ScriptException e) {
           devolver="Error";
        }
        return devolver;
    }

    public String angulos(){
        String resultado = null;
        try{
        String texto=etOperacion.getText().toString();
        int posPrimParentesis=texto.indexOf("(");
        int posSecParentesis=texto.indexOf(")");

        Double numero=Double.parseDouble(texto.substring(posPrimParentesis+1,posSecParentesis-1));
        if(texto.contains("sin")){resultado=String.valueOf(Math.sin(numero));}
        if(texto.contains("cos")){resultado=String.valueOf(Math.cos(numero));}
        if(texto.contains("tan")){resultado=String.valueOf(Math.tan(numero));}
        if(texto.contains("csc")){resultado=String.valueOf(1/Math.sin(numero));}
        if(texto.contains("sec")){resultado=String.valueOf(1/Math.cos(numero));}
        if(texto.contains("ctg")){resultado=String.valueOf(1/Math.tan(numero));}
        contadorParentesis=0;
        contenerAngulos=false;
        }catch (Exception ex){
            resultado="Error";
        }
        return resultado;
    }
    public String factorial(String texto){
        String devolver=null;
        try {
            int posFact = texto.indexOf("!");
            Double numero = Double.parseDouble(texto.substring(0, posFact));
            Double resultado = 1.0;
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
            devolver=String.valueOf(resultado);
        }catch(Exception ex){
            devolver="Error";
        }
        return devolver;
    }
    public String raiz(String texto){
        String resultado;
        try {
            Double numero = Double.parseDouble(texto.substring(1, texto.length()));
            resultado = String.valueOf(Math.sqrt(numero));
        }catch (Exception ex){
            resultado="Error";
        }
        return resultado;
    }
    public String exponente(String texto){
        String devolver=null;
        try {
            int posExp = texto.indexOf("^");
            contadorParentesis = 0;
            Double numero1 = Double.parseDouble(texto.substring(0, posExp - 1));
            Double numero2 = Double.parseDouble(texto.substring(posExp + 2, texto.length()));
            Double resultado = Math.pow(numero1, numero2);
            devolver=String.valueOf(resultado);
        }catch (Exception ex){
            devolver="Error";
        }
        return devolver;
    }

}
