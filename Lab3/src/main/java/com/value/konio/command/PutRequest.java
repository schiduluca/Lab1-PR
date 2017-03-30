package com.value.konio.command;

import com.value.konio.entities.Todo;
import com.value.konio.networking.RetrofitHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by lschidu on 3/30/17.
 */
public class PutRequest implements HTTPRequest {
    private String parameter;

    public PutRequest withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    @Override
    public Todo makeRequest(Todo... ts) {
        Call<Void> call = RetrofitHelper
                .getINSTANCE()
                .getApiService()
                .editTodo(parameter, ts[0]);

        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                System.out.println("Todo Edited");
            }

            @Override
            public void onFailure(Call<Void> call, Throwable throwable) {

            }
        });

        return null;
    }
}
