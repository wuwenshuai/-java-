package cn.carryshuai.one.正则;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/21 14:10
 * @Description:
 */
public class CardTest {


    @Test
    public void test(){
        System.out.println(isIDCard("411527199507105550"));
    }


    public boolean isIDCard(String idCard) {
        String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }
}

