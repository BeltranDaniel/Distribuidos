/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.rmi.RemoteException;

/**
 * Interfaz para ofrecer servicios a las empresas
 * @author sistemas
 */
public interface InterfazEmpresa {
    String sayHello() throws RemoteException;
}
