import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GestionnaireCommandesInterface extends Remote {
	public void payer(int id) throws RemoteException;
}
