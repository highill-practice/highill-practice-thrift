package com.highill.practice.thrift.impl;

import org.apache.thrift.TException;

import com.highill.practice.thrift.AddService;

public class AddServiceImpl implements AddService.Iface {

	@Override
    public int addInteger(int param1, int param2) throws TException {
		int result = param1 + param2;
		System.out.println("-----AddServiceImpl addInteger param1: " +param1 + ",    param2: " +param2 + ",    result: " +result);
	    return result;
    }

	@Override
    public long addLong(long param1, long param2) throws TException {
		long result = param1 + param2;
		System.out.println("-----AddServiceImpl addLong param1: " + param1 + ",    param2: " + param2 + ",    result: " + result);
	    return result;
    }

	@Override
    public String addString(String param1, String param2) throws TException {
		String result = (param1 == null ? "" : param1.trim()) + "  " + (param2 == null ? "" : param2.trim());
		System.out.println("-----AddServiceImpl addString param1: " + param1 + ",    param2: " + param2 + ",    result: " + result);
	    return result;
    }

}
