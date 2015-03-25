import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;


public interface CatalogueInterface extends Remote {
	public int nombreTotalArticles() throws RemoteException;
	public String listeArticles() throws RemoteException;
	public String getEntree(int id) throws RemoteException;
	public String getDescArticle(int id) throws RemoteException;
	public String getPrixArticle(int id) throws RemoteException;
	public Date getDateDispoArticle(int id) throws RemoteException;
}
