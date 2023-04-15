package com.example.demo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.ControlDemo.MyWebHelloWorldController;
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class EmployeeController1Test {
    /** * Interface to provide configuration for a web application. */
    @Autowired
    private WebApplicationContext ctx;
    private MockMvc mockMvc;
    /** * 初始化 MVC 的环境 */
    @Before
    public void before() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
        mockMvc = MockMvcBuilders.standaloneSetup(new MyWebHelloWorldController()).build();
    }
    @Test
    public void listAll() throws Exception {
        mockMvc
                .perform(get("/emp") // 测试的相对地址
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE) // accept response content type
                )
                .andExpect(status().isOk()) // 期待返回状态吗码200
                // JsonPath expression https://github.com/jayway/JsonPath
                .andExpect(jsonPath("$[1].name").exists()) // 这里是期待返回值是数组，并且第二个值的 name 存在
                .andDo(print())
                ; // 打印返回的 http response 信息
    }
}