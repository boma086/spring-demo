package com.example.demo.ConfigurationDemo;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "com.it")
public class Member {
    public Member() {
        System.out.println("Member实例化...");
    }
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private Integer id;
    private String name;
    private double salary;
}