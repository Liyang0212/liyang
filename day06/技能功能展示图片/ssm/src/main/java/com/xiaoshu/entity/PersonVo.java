package com.xiaoshu.entity;

public class PersonVo extends Person {
private String cname;

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public PersonVo(String cname) {
	super();
	this.cname = cname;
}
public PersonVo(){
	
}

}
