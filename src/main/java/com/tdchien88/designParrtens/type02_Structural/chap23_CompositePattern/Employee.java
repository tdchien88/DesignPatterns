package com.tdchien88.designParrtens.type02_Structural.chap23_CompositePattern;

public interface Employee {
	public int getId();

	public String getName();

	public double getSalary();

	public void print();

	public void add(Employee employee);

	public void remove(Employee employee);

	public Employee getChild(int i);
}