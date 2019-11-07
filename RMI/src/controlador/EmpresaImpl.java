/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author sistemas
 */
public class EmpresaImpl extends UnicastRemoteObject implements InterfazEmpresa{
    
    public EmpresaImpl() throws RemoteException {
		super();
    }
    
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }
    
    public static void main(String args[]) {
	
		// Crea e instala un gestor de seguridad
		if (System.getSecurityManager() == null) {
		    System.setSecurityManager(new RMISecurityManager());
		}
	
		try {
		    CandidatoImpl obj = new CandidatoImpl();
		    // Enlaza esta instancia del objeto al nombre "HelloServer"
		    Naming.rebind("//127.0.0.1:1500/HelloServer", obj);	
		    System.out.println("HelloServer bound in registry");
		} catch (Exception e) {
		    System.out.println("HelloImpl err: " + e.getMessage());
		    e.printStackTrace();
		}
	    }
}
