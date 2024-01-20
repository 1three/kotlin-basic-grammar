package fastcampus.part0.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

/** Life cycle 테스트 시나리오
 *
 * 1. Activity 실행, 종료 시
 * 2. 다른 App 실행 시 (= 홈 버튼 클릭 시)
 * 3. 다른 Activity 실행 시
 * */

/** Activity Life cycle
 *
 * onCreate : 액티비티 초기화 및 레이아웃 설정 작업
 * onStart  : 액티비티 사용자에 보여지기 전
 * onRestart: 액티비티 중지 후 재시작 전
 * onResume : 액티비티 사용자와 상호작용 전
 * onPause  : 액티비티 일시 중지 or 다른 액티비티가 화면을 가릴 때
 * onStop   : 액티비티 사용자에 표시되지 않을 때
 * onDestroy: 액티비티 소멸되기 전
 * */

/**
 * 1. Activity 실행, 종료 시
 *
 * 1) 앱 실행 시
 * onCreate → onStart → onResume
 *
 * 2) 앱 종료 시 (종료 버튼 클릭 시)
 * onPause → onStop → onDestroy
 */

/** 2. 다른 App 실행 시 (= 홈 버튼 클릭 시)
 *
 * 1) 홈 버튼 클릭 시
 * onPause → onStop
 *
 * 2) (백 스택) 앱 재실행 시
 * onRestart → onStart → onResume
 * */

/** 3. 다른 Activity 실행 시
 *
 * 1) 다른 액티비티 실행 시
 *   (Main) onPause
 * → (Next) onCreate → onStart → onResume
 * → (Main) onStop
 *
 * 2) 다른 액티비티 종료 시
 *   (Next) onPause
 * → (Main) onRestart → onStart → onResume
 * → (Next) onStop → onDestroy
 * */

// Life cycle 콜백 함수를 override 한 상태
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener { navigateNextActivity() }
        findViewById<Button>(R.id.button2).setOnClickListener { finish() }

        Toast.makeText(this, "라이프사이클 - Main : onCreate", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "라이프사이클 - Main : onStart", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "라이프사이클 - Main : onRestart", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "라이프사이클 - Main : onResume", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "라이프사이클 - Main : onPause", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "라이프사이클 - Main : onStop", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "라이프사이클 - Main : onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("라이프사이클 - Main", "onDestroy")
    }

    private fun navigateNextActivity() {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }
}