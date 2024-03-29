package com.lab.android_4a.network;

import com.lab.android_4a.model.Comic;
import com.lab.android_4a.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.GET;

public interface GetDataService {

    public static final String BASE_URL_XKCD = "http://xkcd.com";

    public static final String BASE_URL_PLACEHOLDER = "https://jsonplaceholder.typicode.com";

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

    @GET("/info.0.json")
    Call<Comic> getCurrent();

    @GET("/{xkcd_number}/info.0.json")
    Call<Comic> getComic(@Path("xkcd_number") int xkcd_number);
}
