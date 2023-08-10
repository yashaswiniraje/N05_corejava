package org.tnsif.singledimentionalarray;

class Employee {

	
		private int ID;
		private String name;
		private double salary;
		public Employee(int iD, String name, double salary) {
			super();
			ID = iD;
			this.name = name;
			this.salary = salary;
		}
		

	public int getID() {
			return ID;
		}


		public void setID(int iD) {
			ID = iD;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


	public class ArrayOfObject{
		public static void main(String[]args) {
			Employee arr[]=new Employee[2];
			arr[0] = new Employee(101,"aniket",2344.67);
			arr[1] = new Employee(102,"yashaswini",56744.67);
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
			}
			
		}
	}

}
