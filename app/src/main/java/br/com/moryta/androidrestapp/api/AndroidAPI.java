package br.com.moryta.androidrestapp.api;

import br.com.moryta.androidrestapp.model.ResponseAndroid;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by moryta on 21/06/2017.
 */

public interface AndroidAPI {
    @GET("/v2/58af1fb21000001e1cc94547")
    Call<ResponseAndroid> getVersions();
}
