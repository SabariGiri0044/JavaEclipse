package FirstLevel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {

	public static void main(String[] args) {
		EdubridgeAlian edu1 = new EdubridgeAlian();
		EdubridgeAlian edu2 = new EdubridgeAlian();
		/*EdubridgeAlian edu3 = new EdubridgeAlian();
		EdubridgeAlian edu4 = new EdubridgeAlian();
		
				edu1.setId(1);
				edu2.setName("Kiran"); //persist in database
				
				edu2.setId(2);
				edu2.setName("Manoj"); //persist in database
				edu3.setId(3);
				edu3.setName("Ravi"); //persist in database
				edu4.setId(4);
				edu4.setName("Swetha"); //persist in database
			*/	
				Configuration con=new Configuration().configure().addAnnotatedClass(EdubridgeAlian.class);
				ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				
				
				SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
				Session session = sf.openSession();
				Transaction tx=session.beginTransaction();
				/*session.save(edu1);// insert but how
				session.save(edu2);// insert but how
				session.save(edu3);// insert but how
				session.save(edu4);// insert but how
				
				*/
				//To fetch data
				edu1=   (EdubridgeAlian) session.get(EdubridgeAlian.class,3);
				System.out.println(edu1);
				edu2=   (EdubridgeAlian) session.get(EdubridgeAlian.class,4);
				System.out.println(edu2);
				edu2=   (EdubridgeAlian) session.get(EdubridgeAlian.class,4);
				System.out.println(edu2);
				session.close();
				Session session1 = sf.openSession();
				Transaction tx1=session1.beginTransaction();
				
				edu1=   (EdubridgeAlian) session1.get(EdubridgeAlian.class,3);
				System.out.println(edu1);
				tx.commit();
				System.out.println("Saved");
				
	}

}