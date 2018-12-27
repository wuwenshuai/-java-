package cn.carryshuai.自定义异常处理.exception;

import cn.carryshuai.自定义异常处理.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CarryExcepttion extends RuntimeException {

    private ExceptionEnum exceptionEnum;
}
