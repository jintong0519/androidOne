package com.example.jintong.jisuanqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonzero,buttonone,buttontwo,buttonthree,buttonfour,buttonfive,buttonsix,
            buttonseven,buttoneight,buttonnine,buttonjia,buttonjian,buttoncheng,buttonchu,buttondian,
            buttondengyu,buttonbaifen,buttongen,buttonc,buttonsin,buttoncos,buttontan,buttonasin;
    private EditText show;
    public int yunsuan = 0;
    private String text1="0";
    private String text2="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (EditText) findViewById(R.id.show);
        Button buttonzero = (Button) findViewById(R.id.buttonzero);
        Button buttonone = (Button) findViewById(R.id.buttonone);
        Button buttontwo = (Button) findViewById(R.id.buttontwo);
        Button buttonthree = (Button) findViewById(R.id.buttonthree);
        Button buttonfour = (Button) findViewById(R.id.buttonfour);
        Button buttonfive = (Button) findViewById(R.id.buttonfive);
        Button buttonsix = (Button) findViewById(R.id.buttonsix);
        Button buttonseven = (Button) findViewById(R.id.buttonseven);
        Button buttoneight = (Button) findViewById(R.id.buttoneight);
        Button buttonnine = (Button) findViewById(R.id.buttonnine);
        Button buttondian = (Button) findViewById(R.id.buttondian);
        Button buttonc = (Button) findViewById(R.id.buttonc);
        Button buttoncheng = (Button) findViewById(R.id.buttoncheng);
        Button buttonchu = (Button) findViewById(R.id.buttonchu);
        Button buttonjia = (Button) findViewById(R.id.buttonjia);
        Button buttonjian = (Button) findViewById(R.id.buttonjian);
        Button buttongen = (Button) findViewById(R.id.buttongen);
        Button buttonbaifen = (Button) findViewById(R.id.buttonbaifen);
        Button buttondengyu = (Button) findViewById(R.id.buttondengyu);
        Button buttonsin = (Button) findViewById(R.id.buttonsin);
        Button buttoncos = (Button) findViewById(R.id.buttoncos);
        Button buttontan = (Button) findViewById(R.id.buttontan);
        Button buttonasin = (Button) findViewById(R.id.buttonasin);

        buttonzero.setOnClickListener(this);
        buttonone.setOnClickListener(this);
        buttontwo.setOnClickListener(this);
        buttonthree.setOnClickListener(this);
        buttonfour.setOnClickListener(this);
        buttonfive.setOnClickListener(this);
        buttonsix.setOnClickListener(this);
        buttonseven.setOnClickListener(this);
        buttoneight.setOnClickListener(this);
        buttonnine.setOnClickListener(this);
        buttonjia.setOnClickListener(this);
        buttonjian.setOnClickListener(this);
        buttoncheng.setOnClickListener(this);
        buttonchu.setOnClickListener(this);
        buttonc.setOnClickListener(this);
        buttongen.setOnClickListener(this);
        buttondian.setOnClickListener(this);
        buttonbaifen.setOnClickListener(this);
        buttondengyu.setOnClickListener(this);
        buttonsin.setOnClickListener(this);
        buttoncos.setOnClickListener(this);
        buttontan.setOnClickListener(this);
        buttonasin.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.buttonzero:
                show.append("0");
                break;
            case R.id.buttonone:
                show.append("1");
                break;
            case R.id.buttontwo:
                show.append("2");
                break;
            case R.id.buttonthree:
                show.append("3");
                break;
            case R.id.buttonfour:
                show.append("4");
                break;
            case R.id.buttonfive:
                show.append("5");
                break;
            case R.id.buttonsix:
                show.append("6");
                break;
            case R.id.buttonseven:
                show.append("7");
                break;
            case R.id.buttoneight:
                show.append("8");
                break;
            case R.id.buttonnine:
                show.append("9");
                break;
            case R.id.buttondian:
                show.append(".");
                break;
            case R.id.buttonjia:
                yunsuan = 1;
                text1 = show.getText().toString();
                show.setText(" ");
                break;
            case R.id.buttonjian:
                yunsuan = 2;
                text1 = show.getText().toString();
                show.setText(" ");
                break;
            case R.id.buttoncheng:
                yunsuan = 3;
                text1 = show.getText().toString();
                show.setText(" ");
                break;
            case R.id.buttonchu:
                yunsuan = 4;
                text1 = show.getText().toString();
                show.setText(" ");
                break;
            case R.id.buttonbaifen:
                text1 = show.getText().toString();
                Double res0 = Double.parseDouble(text1) * 0.01;
                show.setText(res0+" ");
                break;
            case R.id.buttongen:
                text1 = show.getText().toString();
                show.setText(Math.sqrt(Double.parseDouble(text1))+" ");
                break;
            case R.id.buttonsin:
                text1 = show.getText().toString();
                Double res6 = Math.toRadians(Double.parseDouble(text1));
                show.setText(Math.sin(res6)+" ");
                break;
            case R.id.buttoncos:
                text1 = show.getText().toString();
                Double res7 = Math.toRadians(Double.parseDouble(text1));
                show.setText(Math.cos(res7)+" ");
                break;
            case R.id.buttontan:
                text1 = show.getText().toString();
                Double res8 = Math.toRadians(Double.parseDouble(text1));
                show.setText(Math.tan(res8)+" ");
                break;
            case R.id.buttonasin:
                text1 = show.getText().toString();
                Double res9 = Math.asin(Double.parseDouble(text1));
                show.setText(res9+" ");
                break;
            case R.id.buttondengyu:
                switch (yunsuan) {
                    case 0:
                            show.setText("0");
                            Log.d("text1", text1);
                            Log.d("text2", text2);
                            break;
                    case 1:
                        text2 = show.getText().toString();
                        Double res = Double.parseDouble(text1) + Double.parseDouble(text2);
                        CharSequence r = res.toString();
                        show.setText(text1+"+"+text2+"="+res);
                        yunsuan = 5;
                        break;
                    case 2:
                        text2 = show.getText().toString();
                        Double res2 = Double.parseDouble(text1) - Double.parseDouble(text2);
                        CharSequence r2 = res2.toString();
                        show.setText(text1+"-"+text2+"="+res2);
                        yunsuan = 5;
                        break;
                    case 3:
                        text2 = show.getText().toString();
                        Double res3 = Double.parseDouble(text1) * Double.parseDouble(text2);
                        CharSequence r3 = res3.toString();
                        show.setText(text1+"×"+text2+"="+res3);
                        yunsuan = 5;
                        break;
                    case 4:
                        text2 = show.getText().toString();
                        Double res4 = Double.parseDouble(text1) / Double.parseDouble(text2);
                        CharSequence r4 = res4.toString();
                        show.setText(text1+"÷"+text2+"="+res4);
                        yunsuan = 5;
                        break;

                    default:
                        break;
                }
                break;
            case R.id.buttonc:
                yunsuan = 0;
                text1="0";
                text2="0";
                show.setText(" ");
                break;
            default:
                break;
        }
    }
}
