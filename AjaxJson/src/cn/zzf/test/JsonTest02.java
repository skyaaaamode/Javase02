package cn.zzf.test;


import cn.zzf.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * list集合转换成json
 */
public class JsonTest02 {
    @Test
    public void test() throws IOException {
        Person person = new Person();
        person.setAdress("浙江省");
        person.setAge(18);
        person.setName("zzf");
        person.setBirth(new Date());
        Person person01 = new Person();
        person01.setAdress("浙江省");
        person01.setAge(18);
        person01.setName("zzf");
        person01.setBirth(new Date());
        Person person02 = new Person();
        person02.setAdress("浙江省");
        person02.setAge(18);
        person02.setName("zzf");
        person02.setBirth(new Date());
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person01);
        people.add(person02);
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
        String s = objectMapper.writeValueAsString(people);
        System.out.println(s);




    }

}
