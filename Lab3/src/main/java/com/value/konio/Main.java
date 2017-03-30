package com.value.konio;


import com.value.konio.command.DeleteRequest;
import com.value.konio.command.GetRequest;
import com.value.konio.command.PostRequest;
import com.value.konio.command.PutRequest;
import com.value.konio.entities.Todo;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        PostRequest postRequest = new PostRequest();
        postRequest.makeRequest(new Todo("Drink water", 10, false));

        GetRequest getRequest = new GetRequest();
        getRequest.makeRequest();

        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.withParameter("Drink").makeRequest();

        PutRequest putRequest = new PutRequest();
        putRequest.withParameter("Drink").makeRequest(new Todo("Drink", 10, true));
    }
    

}

