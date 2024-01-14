package fastcampus.part0.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1-3. 람다 특징 : 일회용 함수
        // View에서 setOnClickListener 사용 시, SAM interface로 구현

        // SAM (Single Abstract Method, 단일 추상 메서드)
        // SAM 인터페이스 : 단 하나의 추상 메서드를 가진 인터페이스 (ex : setOnClickListener)
        // Kotlin에서는 SAM 인터페이스를 아래와 같이 람다식으로 표현 가능

        val view = View(this)

        // 1-3-1. 직접 구현
        // 익명 클래스를 통해 OnClickListener 설정
//        view.setOnClickListener(
//            new View . OnClickListener () {
//                @Override
//                public void onClick(View: View) {
//                    // 클릭 시 수행할 동작을 구현
//                }
//            }
//        )

        // 1-3-2. 간단 표현
        // 람다식을 통해 OnClickListener 설정
        // {} 를 통해 OnClickListener의 onClick 함수 표현
        view.setOnClickListener {}
    }
}