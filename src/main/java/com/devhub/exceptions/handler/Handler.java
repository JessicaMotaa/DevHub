package com.devhub.exceptions.handler;

import com.devhub.exceptions.classes.ResourceNotFoundException;
import com.devhub.exceptions.details.StandardDetails;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class Handler {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardDetails> handleResourceNotFoundException(HttpServletRequest request, ResourceNotFoundException ex) {
        return new ResponseEntity<>(
                new StandardDetails().builder()
                        .timestamp(LocalDateTime.now().format(formatter))
                        .error("Not Found")
                        .status(404)
                        .message(ex.getMessage())
                        .path(request.getRequestURI())
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
