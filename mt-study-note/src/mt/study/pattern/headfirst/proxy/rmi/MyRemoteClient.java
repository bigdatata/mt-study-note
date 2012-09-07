package mt.study.pattern.headfirst.proxy.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
	 private static MyRemote stub = null;
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	public void go(){
		try {
			Registry reg = LocateRegistry.getRegistry("localhost");
	        stub = (MyRemote) reg.lookup("Mortgage");
			String message=stub.sayHello();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
