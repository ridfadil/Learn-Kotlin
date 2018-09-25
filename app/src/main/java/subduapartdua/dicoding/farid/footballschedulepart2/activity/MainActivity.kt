package subduapartdua.dicoding.farid.footballschedulepart2.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import subduapartdua.dicoding.farid.footballschedulepart2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialized()
        onClicked()
}
    private fun initialized (){
        /*val btnPrev = findViewById<Button>(R.id.btn_prev_match)
        val btnNext = findViewById<Button>(R.id.btn_next_match)*/
    }
    private fun onClicked(){
        btn_next_match.setOnClickListener(){
            val intent = Intent(this,NextMatchActivity::class.java)
            startActivity(intent)
        }
        btn_prev_match.setOnClickListener(){
            val intent = Intent(this,PrevMatchActivity::class.java)
            startActivity(intent)
        }
    }
}

