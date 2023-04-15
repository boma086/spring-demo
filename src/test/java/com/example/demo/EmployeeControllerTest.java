package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.ControlDemo.EmployeeController;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private EmployeeService employeeService;
    public void setUp() {
        // 数据打桩，设置该方法返回的 body一直 是空的
        Mockito.when(employeeService.findEmployee()).thenReturn(new ArrayList<>());
    }
    @Test
    public void listAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/emp"))
                .andExpect(status().isOk()) // 期待返回状态吗码200
                // JsonPath expression https://github.com/jayway/JsonPath
                //.andExpect(jsonPath("$[1].name").exists()) // 这里是期待返回值是数组，并且第二个值的 name 存在，所以这里测试是失败的
                .andDo(print()); // 打印返回的 http response 信息
    }
}