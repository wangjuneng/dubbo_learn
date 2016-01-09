package com.ztesoft.zsmart.rpc.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.zsmart.rpc.base.HelloRpc;

public class HelloConsume {

	private HelloRpc helloRpc;

	public HelloRpc getHelloRpc() {
		return helloRpc;
	}

	public void setHelloRpc(HelloRpc helloRpc) {
		this.helloRpc = helloRpc;
	}
	
	public void say(){
		this.helloRpc.sayHello("kitty");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer/remote-consumer.xml");
		context.start();
		
		HelloConsume consume = (HelloConsume) context.getBean("helloAction");
		consume.say();
	}

}
