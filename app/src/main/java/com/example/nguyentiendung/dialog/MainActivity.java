package com.example.nguyentiendung.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btnshow;
     Button btnshow_alert_dialog;
    Button btndongy;
    Button btnkdongy;
    Dialog dialog ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // khai bao button cua MainActivity
        btnshow=(Button) this.findViewById(R.id.btnshow);
        btnshow_alert_dialog=(Button) this.findViewById(R.id.btnshow_alert_dialog);
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showdialog();

            }
        });
        btnshow_alert_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showalertdialog();
            }
        });
    }

    private void showalertdialog() {
        final AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Nguyen Tien Dung");
        builder.setCancelable(false);
        builder.setMessage("ban co muon dang xuat khong");
        builder.setPositiveButton("Dong y", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "dong y", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Khong Dong y", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog =builder.create();
        alertDialog.show();
    }


    public  void showdialog(){
    dialog.setTitle("ban co muon dang xuat khong");
    //setCancelable kich ra ngoai dialog se k mat la false nguoc lai la true
    dialog.setCancelable(false);
    dialog.setContentView(getLayoutInflater().inflate(R.layout.layout_dialog,null));
    // khai bao button cua dialog
    Button btndongy=(Button)dialog.findViewById(R.id.btndongy);
    Button btnkdongy=(Button)dialog.findViewById(R.id.btnkdongy);
    btndongy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "dong y", Toast.LENGTH_SHORT).show();
        }
    });
    btnkdongy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });
    dialog.show();
}

}
