package subduapartdua.dicoding.farid.footballschedulepart2.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_next_match.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import subduapartdua.dicoding.farid.footballschedulepart2.R
import subduapartdua.dicoding.farid.footballschedulepart2.adapter.MatchAdapter
import subduapartdua.dicoding.farid.footballschedulepart2.api.ApiRepository
import subduapartdua.dicoding.farid.footballschedulepart2.api.EndPointApi
import subduapartdua.dicoding.farid.footballschedulepart2.model.ListMatchModel
import subduapartdua.dicoding.farid.footballschedulepart2.model.Schedule
import subduapartdua.dicoding.farid.footballschedulepart2.model.ScheduleResponse

class NextMatchActivity : AppCompatActivity() {
    private var listMatchClub: MutableList<ListMatchModel> = mutableListOf()
    val apiRepository = ApiRepository()
    val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_match)
        initialized()

        //Kotlin Android Extension
        rv_next_match.adapter = MatchAdapter(this, listMatchClub) {
            //toast("Anda Sudah Memilih Detail ${it.nama}  ")
            //startActivity(intentFor<DetailActivity>("isSuccess" to true).clearTask())
        }
    }

    private fun initialized() {
        rv_next_match.layoutManager = LinearLayoutManager(this)
        val namaHome = resources.getStringArray(R.array.nama_klub_home)
        val namaAway = resources.getStringArray(R.array.nama_klub_away)
        val tanggal = resources.getStringArray(R.array.tanggal_match)
        val scoreHome = resources.getStringArray(R.array.score_home)
        val scoreAway = resources.getStringArray(R.array.score_away)


        listMatchClub.clear()
        for (i in namaHome.indices) {
            listMatchClub.add(ListMatchModel(namaHome[i], namaAway[i], scoreHome[i], scoreAway[i], tanggal[i]))
        }
    }
}
