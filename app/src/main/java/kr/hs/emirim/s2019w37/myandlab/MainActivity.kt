package kr.hs.emirim.s2019w37.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mProfile : ImageView //멤버변수용 (mProfile)
    lateinit var mButton1 : Button //초기값을 나중에 넣는다(var)
    lateinit var mButton2  :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)

        mButton1.setOnClickListener {
            val intent = Intent(this, FourbuttonActivity::class.java)
            startActivity(intent)
            //startActivity(intent = Intent(this, FourbuttonActivity::class.java))
        }

        mButton2.setOnClickListener {
            val intent = Intent(this, FourbuttonActivity2::class.java)
            startActivity(intent)
        }

    }
}