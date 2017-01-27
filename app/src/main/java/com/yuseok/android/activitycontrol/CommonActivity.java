package com.yuseok.android.activitycontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CommonActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        tv= (TextView) findViewById(R.id.mText);

        // 1. intent꺼내기
        Intent intent = getIntent();

        // 2. intent에서 Extra꾸러미(bundle) 꺼내기
        Bundle bundle = intent.getExtras();

        // 3. bundle에서 변수(타입에 맞게) 직접 꺼내기
        String str = bundle.getString("var");

        tv.setText(str);
    }
}
