package subduapartdua.dicoding.farid.footballschedulepart2.api

import java.net.URL

class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}