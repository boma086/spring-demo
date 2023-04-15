package com.example.demo.ControlDemo.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import javax.lang.model.element.Element;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	public List<EmployeeResult> findEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeResult> retList =  new ArrayList<>();
		EmployeeResult elem = new EmployeeResult();
		retList.add(elem);
		return retList;
	}

}
