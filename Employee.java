package CRUD;

	public class Employee {
		
		private String name;
		private String designation;
		private String organization;
		private String salary;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getOrganization() {
			return organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}
		public Employee(String name, String designation, String organization, String salary) {
			super();
			this.name = name;
			this.designation = designation;
			this.organization = organization;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Information [name=" + name + ", designation=" + designation + ", organization=" + organization
					+ ", salary=" + salary + "]";
		}

		
	}

