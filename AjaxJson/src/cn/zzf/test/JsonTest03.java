package cn.zzf.test;


import cn.zzf.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class JsonTest03 {
    @Test
    public void test() throws IOException {
      String s="{\"name\":\"zzf\",\"age\":18,\"adress\":\"浙江省\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(s, Person.class);
        System.out.println(person);
    }

}
