package kr.hs.emirim.s2019w37.myandlab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourbuttonActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private Button mBbutton3;
    private Button mBbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourbutton2);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mBbutton3 = findViewById(R.id.button3);
        mBbutton4 = findViewById(R.id.button4);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mBbutton3.setOnClickListener(this);
        mBbutton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent; //계속 겹치는 것이 많아서 빼줌
        switch (view.getId()){
            case R.id.button1: //홈페이지 들어가기
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);
                break;

            case R.id.button2: //전화하기
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(intent);
                break;

            case R.id.button3: //갤러리 열기
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
                break;

            case R.id.button4: //돌아가기
                finish();
                break;
        }
    }
}