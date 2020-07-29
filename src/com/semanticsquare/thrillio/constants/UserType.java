package com.semanticsquare.thrillio.constants;

public enum UserType {
  
  
 USER ("user"),
	 EDITOR ("editor"),
	 CHIEF_EDITOR ("chief_editor");
	
	private String name;
	private UserType(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
