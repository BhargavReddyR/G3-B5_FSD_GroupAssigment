package Main;

import Drive.SuperDepartment;
import Drive.SuperDepartment.AdminDepartment;
import Drive.SuperDepartment.AdminDepartment.HrDepartment;
import Drive.SuperDepartment.AdminDepartment.HrDepartment.TechDepartment;;

public class AppMain {
	public static void main(String[] args) {
		
		AdminDepartment ad = (AdminDepartment) new SuperDepartment();
		HrDepartment hd = (HrDepartment) new SuperDepartment();
		TechDepartment td = (TechDepartment) new SuperDepartment();
		
		// Administration Department
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());

		// Human Resource Department
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayHoliday());

		// Technical Department
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());

	}
}