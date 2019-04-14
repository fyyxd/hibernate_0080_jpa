import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.yan.entity.UserBean;


public class T1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserBean user=new UserBean();
		user.setUsername("yanjun");
		user.setPassword("123456");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("yan");   // SessionFactory
		EntityManager manager=factory.createEntityManager();  //Session
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
	}

}
