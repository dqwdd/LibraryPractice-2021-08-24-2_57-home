package com.example.librarypractice_2021_08_24_2_57_home

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

//    this 자리에 대신 들어갈 변수를 미리 만들어두자
    val mContext = this

//    이벤트 처리 관련 코드를 모아줄 함수
    abstract fun setupEvents()

//    값을 띄우는 함수를 모아줄 코드
    abstract fun setValues()


}