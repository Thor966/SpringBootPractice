package com.ag.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource("com/ag/common/Info.properties")
public class PersonInfo
{

	@Value("${per.id}")
	private int pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.email}")
	private String email;
	
	@Value("${per.mobile}")
	private long pmobile;
	
	@Value("${per.age}")
	private int age;
	
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_ver;

	
	
	
	
	@Override
	public String toString() {
		return "PersonInfo [\n pid=" + pid +"\n"+ ", pname=" + pname +"\n"+ ", email=" + email +"\n"+ ", pmobile=" + pmobile +"\n"+ ", age="
				+ age +"\n"+ ", os_name=" + os_name +"\n"+ ", os_ver=" + os_ver + "\n]";
	}

	
	
	
	
	

}
