package com.inheritance.bll;

public class Author {
	
		private String name;
		private String email;
		
		
		public Author(String name, String email) {// Parameterized constructor
			this.name = name;
			this.email = email;
			
		}
	
	
	
		public String getName() {
			return name;
		}
	
		public String getEmail() {
			return email;
		}
	
	
	
		public void setEmail(String email) {
			this.email = email;
		}
	
	
		@Override
		public String toString() {
		return "Author [name=" + name + ", email=" + email
					+ "]";
	
		}

}
