package cn.carryshuai.自定义异常处理.advice;

import cn.carryshuai.自定义异常处理.enums.ExceptionEnum;
import cn.carryshuai.自定义异常处理.exception.CarryExcepttion;
import cn.carryshuai.自定义异常处理.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 拦截异常
 */

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(CarryExcepttion.class)
    public ResponseEntity<ExceptionResult> handleException(CarryExcepttion carryExcepttion){
        ExceptionEnum em = carryExcepttion.getExceptionEnum();
        return ResponseEntity.status(em.getCode()).body(new ExceptionResult(em));

    }

}
