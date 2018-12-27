package cn.carryshuai.自定义异常处理.test;

import cn.carryshuai.自定义异常处理.enums.ExceptionEnum;
import cn.carryshuai.自定义异常处理.exception.CarryExcepttion;
import org.junit.jupiter.api.Test;

public class TestException {

    @Test
    public void test(){
        Integer a = null;
        if (a==null){
            //抛出异常
            throw new CarryExcepttion(ExceptionEnum.PARAM_CANNOT_BE_NULL);
        }
    }
}
