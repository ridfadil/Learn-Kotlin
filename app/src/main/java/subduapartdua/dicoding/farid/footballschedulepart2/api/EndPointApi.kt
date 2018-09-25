package subduapartdua.dicoding.farid.footballschedulepart2.api

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import subduapartdua.dicoding.farid.footballschedulepart2.matchmodel.FootballMatch
import subduapartdua.dicoding.farid.footballschedulepart2.matchmodel.Teams


    interface EndPointApi {

        @GET("eventspastleague.php")
        fun getLastmatch(@Query("id") id:String) : Flowable<FootballMatch>

        @GET("eventsnextleague.php")
        fun getUpcomingMatch(@Query("id") id:String) : Flowable<FootballMatch>

        @GET("lookupteam.php")
        fun getTeam(@Query("id") id:String) : Flowable<Teams>

        @GET("lookupevent.php")
        fun getEventById(@Query("id") id:String) : Flowable<FootballMatch>


/*    fun getLeagueNext(id:String): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("/eventsnextleague.php")
                .appendQueryParameter("id", id)
                .build()
                .toString()
    }*/

    /*fun getTeamDetails(id:String): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("/lookupteam.php")
                .appendQueryParameter("id", id)
                .build()
                .toString()
    }*/

   /* fun getLeagueAll(): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("/all_leagues.php")
                .build()
                .toString()
    }*/

/*    fun getLeaguePrev(id:String): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("eventspastleague.php")
                .appendQueryParameter("id", id)
                .build()
                .toString()
    }*/
}