package subduapartdua.dicoding.farid.footballschedulepart2.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import subduapartdua.dicoding.farid.footballschedulepart2.R
import subduapartdua.dicoding.farid.footballschedulepart2.model.ListMatchModel

class MatchAdapter(private val context: Context, private val items: List<ListMatchModel>, private val listener: (ListMatchModel) -> Unit)
    : RecyclerView.Adapter<MatchAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_match, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            view.setOnClickListener {
                //view.context.startActivity(view.context.intentFor<DetailActivity>())
            }
        }

        private val namaHomeClub = view.findViewById<TextView>(R.id.tv_home_name_club)
        private val namaAwayClub = view.findViewById<TextView>(R.id.tv_away_name_club)
        private val tanggal = view.findViewById<TextView>(R.id.tv_tgl_pertandingan)
        private val scoreHome = view.findViewById<TextView>(R.id.tv_home_score)
        private val scoreAway = view.findViewById<TextView>(R.id.tv_away_score)

        fun bindItem(items: ListMatchModel, listener: (ListMatchModel) -> Unit) {
            namaHomeClub.text = items.nameClubHome
            namaAwayClub.text = items.nameClubAway
            tanggal.text = items.dateMatch
            scoreAway.text = items.scoreClubAway
            scoreHome.text = items.scoreClubHome
           /*itemView.setOnClickListener {
                itemView.context.startActivity(itemView.context.intentFor<DetailActivity>("gambar" to items.gambar, "nama" to items.nama, "deskripsi" to items.deskripsi))
            }*/
        }
    }
}