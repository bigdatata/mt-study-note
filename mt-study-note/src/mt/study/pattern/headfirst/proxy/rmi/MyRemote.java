package mt.study.pattern.headfirst.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	
	public String sayHello() throws RemoteException;
}
