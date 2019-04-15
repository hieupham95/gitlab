package z79.trainingcourse.khaibaobienvakieudulieu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cong.setOnClickListener {
            var num1 : Int = ed_input1.text.toString().toInt()
            var num2 : Int = ed_input2.text.toString().toInt()
            var ketqua : Int = num1 + num2
            tv_ketqua.text = ketqua.toString()
        }

        btn_tru.setOnClickListener {
            var num1 : Int = ed_input1.text.toString().toInt()
            var num2 : Int = ed_input2.text.toString().toInt()
            var ketqua : Int = num1 - num2
            tv_ketqua.text = ketqua.toString()
        }

        btn_nhan.setOnClickListener {
            var num1 : Int = ed_input1.text.toString().toInt()
            var num2 : Int = ed_input2.text.toString().toInt()
            var ketqua : Int = num1 * num2
            tv_ketqua.text = ketqua.toString()
        }

        btn_chia.setOnClickListener {
            var num1 : Int = ed_input1.text.toString().toInt()
            var num2 : Int = ed_input2.text.toString().toInt()
            var ketqua : Int = num1 / num2
            tv_ketqua.text = ketqua.toString()
        }
    }
}
