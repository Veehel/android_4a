package com.lab.android_4a;


import android.content.Context;

import com.lab.android_4a.model.Comic;
import com.lab.android_4a.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComicLoader {

    /*private final Context context;
    private final ComicLoaderListener mListener;

    public ComicLoader(ComicLoaderListener comicLoaderListener, Context context) {
        this.context = context;
        this.mListener = comicLoaderListener;
    }

    public interface ComicPresenterListener {
        void isXkcdReady();
    }

    public void loadxkcdHome() {
        RetrofitClientInstance.getRetrofitInstance()
                .getCurrent()
                .enqueue(new Callback<Comic>() {
                    @Override
                    public void onResponse(Call<Comic> call, Response<Comic> response) {
                        Comic result=response.body();
                        if (result !=null) {

                        }
                    }

                    @Override
                    public void onFailure(Call<Comic> call, Throwable t) {

                    }
                });
    }*/


}
