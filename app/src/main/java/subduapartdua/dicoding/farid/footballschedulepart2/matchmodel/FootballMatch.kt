package subduapartdua.dicoding.farid.footballschedulepart2.matchmodel


import com.google.gson.annotations.SerializedName

data class FootballMatch (
        @SerializedName("events") var events: List<Event>)
