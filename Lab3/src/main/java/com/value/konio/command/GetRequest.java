package com.value.konio.command;

import com.value.konio.entities.Todo;
import com.value.konio.networking.RetrofitHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

/**
 * Created by lschidu on 3/30/17.
 */
public class GetRequest implements HTTPRequest {
    @Override
    public Todo makeRequest(Todo... ts) {
        Call<List<Todo>> call = RetrofitHelper
                .getINSTANCE()
                .getApiService()
                .getTodos();

        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                response.body().forEach(System.out::println);
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable throwable) {

            }
        });
        return null;
    }
}
