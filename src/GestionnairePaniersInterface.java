import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GestionnairePaniersInterface extends Remote {
	public int creerPanier() throws RemoteException;
	public String listeArticles(int id) throws RemoteException;
	public int passerCommande(int id) throws RemoteException;
	public void ajouterArticle(int idPanier, int idArticle) throws RemoteException;
	public void modifierQteArticle(int idPanier, int idArticle, int qte) throws RemoteException;
	public void supprimerArticle(int idPanier, int idArticle) throws RemoteException;
	public float calculerPrix(int idPanier) throws RemoteException;
}
