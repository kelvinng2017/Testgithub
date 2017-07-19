package com.example.user.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.qwer7.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private AlertDialog dialogView;

    private AlertDialog.Builder mBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = (Button) findViewById(R.id.button);
        a.setText("Toast");
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "死肥豬", Toast.LENGTH_LONG).show();
            }

        });
        Button b = (Button) findViewById(R.id.button2);
        b.setText("DIALOG");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mBuilder = new AlertDialog.Builder(MainActivity.this);//設定AlertDialog內容
                mBuilder.setTitle("這是標題").setMessage("這是內容").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(v.getContext(), "Button OK Click", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("CANCEL ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(v.getContext(), "Button CANCEL Click", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setCancelable(false);  //設定back鍵無法dismiss dialog//建立AlertDialogdialogView = mBuilder.create();//顯示AlertDialogdialogView.show();
                dialogView = mBuilder.create();//顯示AlertDialogdialogView.show();
                dialogView.show();

            }
        });
        Button c = (Button) findViewById(R.id.button2);
        c.setText("INPUT");
        c.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick( View v) {

                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                final View ver = inflater.inflate(R.layout.open, null);
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("請輸入你的id")
                        .setView(ver)
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                EditText editText = (EditText) (ver.findViewById(R.id.editText1));
                                if("".equals(editText.getText().toString().trim())){Toast.makeText(getApplicationContext(),"請重新輸入", Toast.LENGTH_SHORT).show();}
                                else{
                                    Toast.makeText(getApplicationContext(), "你的id是" +

                                            editText.getText().toString(), Toast.LENGTH_SHORT).show();
                                }}
                        })
                        .show();
            }
        });
    }}
