package com.dell.model;

	public class Driver {
		
		public static void main(String args[]) {
			
			HrDepartment hr = new HrDepartment();
			TechDepartment Tech = new TechDepartment();
			AdminDepartment Admin = new AdminDepartment();
			
			System.out.println("Welcome to " +Admin.departmentName());
			System.out.println(Admin.getTodaysWork());
			System.out.println(Admin.getWorkDeadline());
			System.out.println(Admin.isTodayAHoliday());
			
			System.out.println("\nWelcome to " +hr.departmentName());
			System.out.println(hr.doActivity());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.isTodayAHoliday());
			
			System.out.println("\nWelcome to " +Tech.departmentName());
			System.out.println(Tech.getTodaysWork());
			System.out.println(Tech.getWorkDeadline());
			System.out.println(Tech.getTechStackInformation());
			System.out.println(Tech.isTodayAHoliday());
		}
	}
