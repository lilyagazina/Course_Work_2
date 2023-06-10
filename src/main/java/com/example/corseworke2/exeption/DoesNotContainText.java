package com.example.corseworke2.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DoesNotContainText extends RuntimeException { //Не содержит текста
}