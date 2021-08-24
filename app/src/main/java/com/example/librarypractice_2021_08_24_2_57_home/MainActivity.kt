package com.example.librarypractice_2021_08_24_2_57_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            val Intent myIntent = Intent(mContext, View)
            startActivity(myIntent)
//            매니페스트가서 노 액션바로 더 프로필보는것처럼 보이게

        }
    }

    override fun setValues() {
    }
}