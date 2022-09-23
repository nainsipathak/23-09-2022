package com.inheritance.pll;

import com.inheritance.bll.HourlyEmployee;
import com.inheritance.bll.SalaryEmployee;

public class TestEmployee {

		public static void main(String[] args) {
	

			 System.out.println("*********************************");
			 
			 System.out.println("Salary Detail's:");
			 System.out.println("*********************************");
				//Salary of the Employee
			 
			 SalaryEmployee sal_Emp =new SalaryEmployee("Kunal", "Yoga Instructor",15000);
			
			 
			 //Weekly Salary of the employee
			 HourlyEmployee hour_Emp=new HourlyEmployee("Nilu","Nurse",1000,120);
			
			System.out.println(sal_Emp);
			System.out.println(hour_Emp);

	}

}
