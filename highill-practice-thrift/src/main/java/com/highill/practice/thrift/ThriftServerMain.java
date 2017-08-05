package com.highill.practice.thrift;


import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import com.highill.practice.thrift.impl.AddServiceImpl;

public class ThriftServerMain {

	public static void main(String[] args) {
		try {
			AddServiceImpl addServiceImpl = new AddServiceImpl();
			AddService.Processor<AddServiceImpl> addServiceProcessor = new AddService.Processor<AddServiceImpl>(addServiceImpl);
			
			
			TServerTransport serverTransport = new TServerSocket(10000);
			Args serverParam = new Args(serverTransport);
			TServer server = new TSimpleServer(serverParam.processor(addServiceProcessor));
			System.out.println("----- ----- Thrift Server is starting ");
			server.serve();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
