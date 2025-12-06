package com.ani.services;

import com.ani.beans.Student;

public interface IstudentService 
{
	public int insertData(Student std);
	
	public void fetchData(int rollNo);
	
}
