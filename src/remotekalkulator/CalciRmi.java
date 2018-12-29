
package remotekalkulator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public  class CalciRmi extends UnicastRemoteObject implements CalciInterface{
    public CalciRmi () throws RemoteException
    {
        int a,b;
    }
    
    public int add(int a, int b)throws RemoteException
    {
        return a+b;
    }
    
     public int sub(int a, int b)throws RemoteException
    {
        return a-b;
    }
   
      public int mul(int a, int b)throws RemoteException
    {
        return a*b;
    }
   
       public int div(int a, int b)throws RemoteException
    {      
        return a/b;
    }

   
}

