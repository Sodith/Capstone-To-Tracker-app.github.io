package com.niit.ToDoService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "user  Not Found")
public class UserNotFoundException extends Exception {
}
