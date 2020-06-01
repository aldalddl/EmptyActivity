package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn3;

    Button btn_shape;
    Button btn_text;
    Button btn_shapeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn_shape = findViewById(R.id.btn_shape);
        btn_text = findViewById(R.id.btn_text);
        btn_shapeText = findViewById(R.id.btn_shapeText);

//        GridView gv = findViewById(R.id.mygrid);
//        gv.setAdapter(new SetImageAdapter(this));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                String msg = "";
                msg+="red";

                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="yellow";

                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="green";

                btn1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.VISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });

        btn_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="shape";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });

        btn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="text";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });

        btn_shapeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg+="shape+text";

                btn_shape.setVisibility(View.VISIBLE);
                btn_text.setVisibility(View.INVISIBLE);
                btn_shapeText.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),SetImageAdapter.class);
                intent.putExtra("msg",msg);
                startActivity(intent);
            }
        });
    }
}
