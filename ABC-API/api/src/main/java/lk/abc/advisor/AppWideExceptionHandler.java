package lk.abc.advisor;

import lk.abc.exception.NotFoundException;
import lk.abc.exception.ValidateException;
import lk.abc.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Thathsara Dananjaya <thathsaradananjaya@gmail.com>
 * @since 10/20/2021
 **/

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception e){
        return new ResponseEntity(new StandardResponse("500","Error",e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ValidateException.class)
    public ResponseEntity handleValidationException(ValidateException e) {
        return new ResponseEntity(new StandardResponse("400", "Error", e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(NotFoundException e){
        return new ResponseEntity(new StandardResponse("404","Error",e.getMessage()),HttpStatus.NOT_FOUND);
    }

}
