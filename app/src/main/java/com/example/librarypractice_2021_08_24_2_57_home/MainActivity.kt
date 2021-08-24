package com.example.librarypractice_2021_08_24_2_57_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {
        profileImg.setOnClickListener {

//            프로필 사진 클릭 이벤트 => 사진 크게 보는 화면으로 이동시키기
            val myIntent = Intent(mContext, ViewPhotoActivity::class.java)
            startActivity(myIntent)
//            매니페스트가서 노 액션바로 더 프로필보는것처럼 보이게

        }
    }

    override fun setValues() {

        Glide.with(mContext).load("https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.net%2Fimage%2F311%2F2021%2F01%2F29%2F0001258558_001_20210129180242094.jpg&type=a340").into(ImageView);

    }
}