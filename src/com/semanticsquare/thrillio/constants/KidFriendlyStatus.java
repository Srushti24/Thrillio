package com.semanticsquare.thrillio.constants;

public enum KidFriendlyStatus {


APPROVED("approved"),
 REJECTED("rejected"),
 UNKNOWN("unkown");
 
 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

private String name;
 
 private KidFriendlyStatus(String name) {
	 this.name=name;
 }

}
