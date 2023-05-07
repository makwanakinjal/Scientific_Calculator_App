package com.example.scientificcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
lateinit var firsttv: TextView
lateinit var lasttv : TextView
lateinit var acbtn : Button
lateinit var cbtn : Button
lateinit var  firstbrac : Button
lateinit var lastbrac : Button
lateinit var sinbtn : Button
lateinit var cosbtn : Button
lateinit var tanbtn : Button
lateinit var logbtn : Button
lateinit var lnbtn : Button
lateinit var xfactobtn : Button
lateinit var xsqrtbtn : Button
lateinit var rootbtn : Button
lateinit var ivbtn : Button
lateinit var dividebtn : Button
lateinit var btn7 : Button
lateinit var btn8 : Button
lateinit var btn9 : Button
lateinit var btn5 : Button
lateinit var btn4 : Button
lateinit var btn3 : Button
lateinit var btn2 : Button
lateinit var btn1 : Button
lateinit var btn6 : Button
lateinit var btn0 : Button
lateinit var btnpoint : Button
lateinit var btnpi : Button
lateinit var multibtn : Button
lateinit var minusbtn : Button
lateinit var plusbtn: Button
lateinit var equalbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firsttv = findViewById(R.id.firsttv);
        lasttv = findViewById(R.id.secondtv);
        acbtn = findViewById(R.id.button_ac);
        cbtn = findViewById(R.id.button_c);
        firstbrac = findViewById(R.id.firstbrac);
        lastbrac = findViewById(R.id.lastbrac);
        sinbtn = findViewById(R.id.button_sin);
        cosbtn = findViewById(R.id.button_cos);
        tanbtn = findViewById(R.id.button_tan);
        logbtn= findViewById(R.id.button_log);
        lnbtn = findViewById(R.id.button_ln);
        xfactobtn = findViewById(R.id.button_xfacto);
        xsqrtbtn = findViewById(R.id.button_xsqrt);
        rootbtn = findViewById(R.id.button_root);
        ivbtn = findViewById(R.id.button_1ux);
        dividebtn= findViewById(R.id.button_devide);
        btnpoint = findViewById(R.id.button_dot);
        btnpi = findViewById(R.id.button_pi);
        multibtn = findViewById(R.id.button_mul);
        minusbtn = findViewById(R.id.button_minus);
        plusbtn = findViewById(R.id.button_plus);
        equalbtn = findViewById(R.id.button_equal);
        btn0 = findViewById(R.id.button_zero);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);

        btn0.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "0");
        }
        btn1.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "1");
        }
        btn2.setOnClickListener{

            firsttv.text = (firsttv.text.toString() + "2");
        }
        btn3.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "3");
        }
        btn4.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "4");
        }
        btn5.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "5");
        }
        btn6.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "6");
        }
        btn7.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "7");
        }
        btn8.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "8");
        }
        btn9.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "9");
        }
        btnpoint.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + ".");
        }
        firstbrac.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "(");
        }
        lastbrac.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + ")");
        }
        btnpi.setOnClickListener{
            firsttv.text=(firsttv.text.toString()+"3.14");
            lasttv.text=(btnpi.text.toString());
        }
        sinbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"sin");
        }
        cosbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"cos");
        }
        tanbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"tan");
        }
        logbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"log");
        }
        lnbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"ln");
        }
        ivbtn.setOnClickListener {
            firsttv.text=(firsttv.text.toString()+"^"+"(-1)");
        }
        minusbtn.setOnClickListener {
            val str: String = firsttv.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                firsttv.text = (firsttv.text.toString() + "-")
            }

        }
        multibtn.setOnClickListener {
            val str:String = firsttv.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                firsttv.text=(firsttv.text.toString()+"*")
            }
        }
        plusbtn.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "+");
        }
        dividebtn.setOnClickListener{
            firsttv.text = (firsttv.text.toString() + "/");
        }
        acbtn.setOnClickListener {
            firsttv.text=""
            lasttv.text=""
        }
        cbtn.setOnClickListener {
            var str:String = firsttv.text.toString()
            if(!str.equals("")){
                str = str.substring(0,str.length-1)
                firsttv.text = str
            }
        }
        xsqrtbtn.setOnClickListener {
            if(firsttv.text.toString().isEmpty()){
                Toast.makeText(this,"please enter a valid number:", Toast.LENGTH_LONG).show()
            }else{
                val str: String = firsttv.text.toString()
                val r= Math.sqrt(str.toDouble())
                val result = r.toString()
                firsttv.text = result
            }
        }
        xsqrtbtn.setOnClickListener {
            if(firsttv.text.toString().isEmpty()){
                Toast.makeText(this,"please enter a valid number:", Toast.LENGTH_LONG).show()
            }else{
                val d:Double = firsttv.text.toString().toDouble()
                val squre = d*d
                firsttv.text= squre.toString()
                lasttv.text = squre.toString()
            }

        }
        xfactobtn.setOnClickListener {
            if(firsttv.text.toString().isEmpty()){
                Toast.makeText(this,"please enter a valid number:", Toast.LENGTH_LONG).show()
            }else{
                val value:Int = firsttv.text.toString().toInt()
                val facto : Int = facto(value)
                firsttv.text = facto.toString()
                lasttv.text = facto.toString()
            }
        }

        equalbtn.setOnClickListener {
            val str: String = firsttv.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            firsttv.text = r
            lasttv.text = str

        }
    }

    fun facto(n:Int) :Int {
        return if(n==1 || n==0) 1 else n * facto(n-1)
    }


    fun evaluate(str: String): Double {
        return object : Any() {
            var position = -1
            var ch = 0

            fun nextChar() {
                ch = if (++position < str.length) str[position].toInt() else -1
            }

            fun eat(CharToEdt: Int): Boolean {
                // extra spaces is present or not
                while (ch == ' '.toInt()) nextChar()
                if (ch == CharToEdt) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (position < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            fun parseFactor(): Double {
                if (eat('+'.toInt())) return parseFactor()
                if (eat('-'.toInt())) return -parseFactor()

                var x: Double
                val startPos = position

                if (eat('('.toInt())) {
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    x = str.substring(startPos, position).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, position)
                    x = parseFactor()
                    if (func == "sqrt")
                        x = Math.sqrt(x)
                    else if (func == "sin")
                        x = Math.sin(Math.toRadians(x))
                    else if (func == "cos")
                        x = Math.cos(Math.toRadians(x))
                    else if (func == "tan")
                        x = Math.tan(Math.toRadians(x))
                    else if (func == "log")
                        x = Math.log10(x)
                    else if (func == "ln")
                        x = Math.log(x)

                } else {
                    throw RuntimeException("Unexpected:" + ch.toChar())
                }
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                return x
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor()
                    else if (eat('/'.toInt())) x /= parseFactor()
                    else return x
                }
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x -= parseTerm()
                    else return x
                }
            }
        }.parse()
    }
    }
