package controlador;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfazCandidato extends Remote {
	String sayHello() throws RemoteException;
}
