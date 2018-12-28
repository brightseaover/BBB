package day06;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
	 private String name;
	 private int age;
	 private String gender;
	 private int salary;
	 private Date hiredate;
	 public Emp(String name,int age,String gender,int salary,Date hiredate){
		 this.name=name;
		 this.age=age;
		 this.gender=gender;
		 this.salary=salary;
		 this.hiredate=hiredate;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String toString() {
		return name + "," + age + "," + gender + "," + salary+","+new SimpleDateFormat("yyyy-MM-dd").format(hiredate);
	}
	public boolean equals(Object o){
		if(o==this){
			return true;
		}if(o==null){
			return false;
		}if(o instanceof Emp){
			Emp p=(Emp)o;
			return p.name.equals(this.name);
		}
		return false;
	}
}
