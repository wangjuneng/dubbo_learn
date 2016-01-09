package com.ztesoft.zsmart.rpc.provider;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.zsmart.rpc.base.HelloRpc;

public class HelloRpcService implements HelloRpc {

	public static AtomicLong counter = new AtomicLong();
	
	public void sayHello(String name) {
		System.out.println(String.format(" hello %s...,invoke %d times", name ,counter.getAndIncrement() ));

	}

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider/remote-provider.xml");
		context.start();
		
		System.in.read();
	}

}
