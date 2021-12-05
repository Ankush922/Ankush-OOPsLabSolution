package com.dell.model;


	public class SuperDepartment {
	
		String departmentName(){
			return "Super Department";
			}
		String getTodaysWork(){
			return "NO Work as of now";
			}
		String getWorkDeadline() {
			return "Nil";
			}
		String isTodayAHoliday() {
			return "Today is not a Holiday";
			}
	}

	class AdminDepartment extends SuperDepartment{
		
		String departmentName() {
			return "Admin Department";
		}
		String getTodaysWork() {
			return "Complete your doucments submission";
			}
		String getWorkDeadline() {
			return "Complete by EOD";
			}
	}
	
	class HrDepartment extends SuperDepartment{
		
		String departmentName() {
			return "HR Department";
			}
		String getTodaysWork() {
			return "Fill today's timesheet and mark your attendance";
			}
		String getWorkDeadline() {
			return "Complete by EOD";
			}
		String doActivity() {
			return "team Lunch";
			}
	}
	
	class TechDepartment extends SuperDepartment{
		
		String departmentName() {
			return "Tech Department";
			}
		String getTodaysWork() {
			return "Complete coding of Module 1";
			}
		String getWorkDeadline() {
			return "Complete by EOD";
			}
		String getTechStackInformation() {
			return "Core Java";
			}
	}