package com.amos.springbootstudy;

import com.amos.springbootstudy.controller.ActicleRustFulController;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@WebMvcTest(ActicleRustFulController.class) //只加载指定的上下文注入到容器中
public class MoclControllerTest implements ApplicationContextAware {

    private static MockMvc mockMvc;

    @BeforeAll
    static void setUp(){
        mockMvc= MockMvcBuilders.standaloneSetup(new ActicleRustFulController()).build();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
