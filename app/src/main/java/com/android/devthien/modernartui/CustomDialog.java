package com.android.devthien.modernartui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public TextView yes, no;

    public CustomDialog(Activity a) {
        super(a);
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog);
        yes = (TextView) findViewById(R.id.btn_yes);
        no = (TextView) findViewById(R.id.btn_no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://MoMA.org"));
                c.startActivity(browserIntent);
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }

}
