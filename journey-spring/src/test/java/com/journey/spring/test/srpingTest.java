package com.journey.spring.test;

import com.journey.spring.entity.SrpingDemo;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by chen on 2018/7/18.
 */
public class srpingTest {

    @Test
    public  void isEqual(){

        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
        SrpingDemo sd = (SrpingDemo)bf.getBean("springDemo");
        assertEquals("testStr",sd.getStr());
    }


}
