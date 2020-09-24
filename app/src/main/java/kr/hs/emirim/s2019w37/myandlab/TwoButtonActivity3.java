package kr.hs.emirim.s2019w37.myandlab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TwoButtonActivity3 extends AppCompatActivity implements View.OnClickListener{

    private EditText mEt;
    private Button mButton6;
    private Button mButton7;
    private RadioButton mButton8;
    private RadioButton mButton9;
    private ImageView mImg;
    private RadioGroup mGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twobutton3);

        mEt = (EditText) findViewById(R.id.text1);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);
        mButton8 = (RadioButton)findViewById(R.id.button8);
        mButton9 = (RadioButton)findViewById(R.id.button9);
        mImg = (ImageView) findViewById(R.id.imageView1);
        mGroup = (RadioGroup)findViewById(R.id.Group1);

        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent; //계속 겹치는 것이 많아서 빼줌
        switch (view.getId()) {
            case R.id.button6: //글자 입력
                String msg = mEt.getText().toString();
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                break;

            case R.id.button7: //홈페이지 들어가기
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);
                break;
           }

           switch (mGroup.getCheckedRadioButtonId()){
               case R.id.button8: //라디오 버튼을 이용해서 이미지 변환
                   mImg.setImageResource(R.drawable.image);
                   break;

               case R.id.button9:
                   mImg.setImageResource(R.drawable.image1);
                   break;
           }
    }
}
