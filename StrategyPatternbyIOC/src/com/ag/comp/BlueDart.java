

package com.ag.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BlueDart implements Courier
{
	public String  courier(int oid)
	{
		return "Order id:- "+oid+" Order is packed by the BlueDart Courier Services...";
	}

}
