package cn.zzf.test;


import cn.zzf.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class JsonTest {
    @Test
    public void test() throws IOException {
        Person person = new Person();
        person.setAdress("浙江省");
        person.setAge(18);
        person.setName("zzf");
        person.setBirth(new Date());
        //创建json的核心对象
        ObjectMapper objectMapper = new ObjectMapper();
        //完成转换
        /**
         * writeValue(参数，obj)
         *     File
         *     write
         *     outputStream
         * writeValueAsString(obj)
         */
        String s = objectMapper.writeValueAsString(person);
        System.out.println(s);




    }

}
