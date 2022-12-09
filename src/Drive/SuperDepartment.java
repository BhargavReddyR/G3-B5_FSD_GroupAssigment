package Drive;

public class SuperDepartment {
	public String departmentName() {

		return "Super Department";
	}

	public String getTodaysWork() {

		return "No Work as of now";
	}

	public String getWorkDeadline() {

		return "Nil";
	}

	public String isTodayHoliday() {

		return "Today is not a holiday";
	}
	public class AdminDepartment extends SuperDepartment {
		
		public String departmentName() {

			return "Welcome to Admin Department";
		}

		public String getTodaysWork() {

			return "Complete your documents submission";
		}

		public String getWorkDeadline() {

			return "Complete by EOD";
		}
		
		public class HrDepartment extends SuperDepartment {

			public String departmentName() {

				return "\nWelcome to HR Department";
			}

			public String getTodaysWork() {

				return "Fill today's timesheet and mark your attendance";
			}

			public String getWorkDeadline() {

				return "Complete by EOD";
			}

			public String doActivity() {

				return "team Lunch";
			}
			
			public class TechDepartment extends SuperDepartment {

				public String departmentName() {

					return "\nWelcome to Tech Department";
				}

				public String getTodaysWork() {

					return "Complete coding of module 1";
				}

				public String getWorkDeadline() {

					return "Complete by EOD";
				}

				public String getTechStackInformation() {

					return "Core Java";
				}
			}
		}
	}
} 