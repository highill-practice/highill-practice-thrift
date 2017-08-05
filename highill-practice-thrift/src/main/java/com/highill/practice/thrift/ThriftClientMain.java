package com.highill.practice.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ThriftClientMain {

	public static void main(String[] args) {
		try {
			TTransport transport = new TSocket("127.0.0.1", 10000);
			transport.open();
			
			TProtocol protocol = new TBinaryProtocol(transport);
			AddService.Client addServiceClient = new AddService.Client(protocol);
			long addLong1 = addServiceClient.addLong(10, 20);
			System.out.println("-----addServieClient addLong1: " + addLong1);
			
			int addInteger1 = addServiceClient.addInteger(1, 2);
			System.out.println("-----addServiceClient addInteger1: " + addInteger1);
			
			String addString1 = addServiceClient.addString("Hello", "name");
			System.out.println("-----addServiceClient addString: " + addString1);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
