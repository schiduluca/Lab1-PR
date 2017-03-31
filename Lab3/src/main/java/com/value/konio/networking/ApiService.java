package com.value.konio.networking;

import com.value.konio.entities.Todo;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ApiService {

    @POST("/todos")
    Call<Void> postTodo(@Body Todo todo);

    @PUT("/todos/{todoText}")
    Call<Void> editTodo(@Path("todoText") String todoText, @Body Todo todo);

    @GET("/todos")
    Call<List<Todo>> getTodos();

    @DELETE("todos/{todoText}")
    Call<Void> deleteTodo(@Path("todoText") String todoText);

}
