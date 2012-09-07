package mt.study.pattern.headfirst.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	private static final long serialVersionUID = 2847076591095202484L;

	protected MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says,'hey'";
	}
	
	public static void main(String[] args) {
		 try {
			 MyRemoteImpl robj = new MyRemoteImpl();
			 MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(robj, 8089);

		        Registry registry = LocateRegistry.getRegistry();
		        registry.bind("Mortgage", stub);
		        System.out.println("Mortgage Server is ready to listen");

		    } catch (Exception e) {
		        System.err.println("Server exception thrown: " + e.toString());
		        e.printStackTrace();
		    }
	}

}
