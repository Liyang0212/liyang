package com.xiaoshu.entity;

public class DeviceVo extends Device {
private String cname;

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public DeviceVo(String cname) {
	super();
	this.cname = cname;
}
public DeviceVo(){
	
}

}
