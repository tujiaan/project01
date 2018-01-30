package cn.tja.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import java.lang.*;

/**
 * @author  tujiaan
 *测试第一个idea程序

 *
 */
@ComponentScan(value = "cn.tja")
@Controller
public class Test01 {
    public void test() {
        System.out.println("hello idea");
    }
}