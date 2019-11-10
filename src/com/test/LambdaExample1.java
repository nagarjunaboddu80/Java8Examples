package com.test;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample1 {

	public static void main(String argsp[]) throws Exception {
	
	Person p1 = new Person("Rama", 3, 1000.00, "SE0");
	Person p2 = new Person("Ama", 4, 1200.00, "SE1");
	Person p3 = new Person("Lama",2, 200.00, "SE2");
	Person p4 = new Person("Gama", 1, 500.00, "SE4");
	
	List<Person> pList =  new ArrayList<Person>();
	pList.add(p1);
	pList.add(p2);
	pList.add(p3);
	pList.add(p4);
	System.out.println("-------------------Lambda Int comparision------------------------");
	pList.sort((Person p0 , Person p20)->(p1.getId()-p2.getId()));
	pList.forEach(person-> System.out.println(person.toString()));
	System.out.println("----------------lambda string comparision---------------------------");
	pList.sort(( p0 , p20)->(p0.getName().compareTo(p20.getName())));
	pList.forEach(person-> System.out.println(person.toString()));
	System.out.println("-----------------lambda double comparision--------------------------");
	pList.sort(( p01 , p21)-> Double.compare(p01.getSalary(), p21.getSalary()));
	pList.forEach(person-> System.out.println(person.toString()));
	System.out.println("-------------------------------------------");
	}
	
}
