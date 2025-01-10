

package com.ag.comp;

import org.springframework.stereotype.Component;

@Component
public class DTDC implements Courier
{
	public String  courier(int oid)
	{
		return "Order id:-"+oid+" Order is packed by the DTDC Courier Services...";
	}

}
