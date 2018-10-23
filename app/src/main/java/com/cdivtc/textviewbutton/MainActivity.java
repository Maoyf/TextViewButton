package com.cdivtc.textviewbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //定义控件变量
    //一共有5个控件
    private TextView textView;
    private EditText editText;
    private TextView myTextView1;
    private Button myButton;
    private ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //自定义一个大findViews()方法
        //用来查找界面控件对象
        findViews();
        Button.OnClickListener bListener = new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        myTextView1.setText("Button按钮");
                        myButton.setText("确定");
                        myImageButton.setImageResource(R.drawable.yes);
                        return;
                    case R.id.imageButton:
                        myTextView1.setText("ImageButton按钮");
                        myButton.setText("OK");
                        myImageButton.setImageResource(R.drawable.crystal);
                        return;
                }
            }
        };
        myButton.setOnClickListener(bListener);
        myImageButton.setOnClickListener(bListener);
    }

    private void findViews() {
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        textView.setText("用户名：");
        editText.setText("Z移动1703");
        myTextView1 = findViewById(R.id.textView1);
        myButton = findViewById(R.id.button);
        myImageButton = findViewById(R.id.imageButton);
    }
}
