package com.value.konio.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitHelper {

    private static RetrofitHelper INSTANCE = new RetrofitHelper();

    private static final String apiUrl = "http://todo-api-konio.getsandbox.com/";

    private ApiService apiService;

    private RetrofitHelper() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public static RetrofitHelper getINSTANCE() {
        return INSTANCE;
    }

    public ApiService getApiService() {
        return this.apiService;
    }


}
