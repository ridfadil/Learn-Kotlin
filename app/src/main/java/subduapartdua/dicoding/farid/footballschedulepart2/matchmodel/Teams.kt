package subduapartdua.dicoding.farid.footballschedulepart2.matchmodel

import com.google.gson.annotations.SerializedName

data class Teams(
        @SerializedName("teams")
        var teams: List<Team>)
