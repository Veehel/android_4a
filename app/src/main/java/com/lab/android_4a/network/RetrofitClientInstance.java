package com.lab.android_4a.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    public static Object getRetrofitInstance;
    public static Retrofit retrofit;

    public static GetDataService getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(GetDataService.BASE_URL_XKCD)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(GetDataService.class);
    }
}
