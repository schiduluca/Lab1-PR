package com.value.konio.command;

import com.value.konio.entities.Todo;

/**
 * Created by lschidu on 3/30/17.
 */
public interface HTTPRequest {

    Todo makeRequest(Todo...ts);
}
