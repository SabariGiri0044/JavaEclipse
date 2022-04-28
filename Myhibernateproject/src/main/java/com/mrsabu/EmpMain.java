package com.mrsabu;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.service.ServiceRegistry;
	import org.hibernate.service.ServiceRegistryBuilder;

	public class EmpMain {

		public static void main(String[] args) {
			Employeedetails obj = new Employeedetails();
			obj.setEmp_id(101);
			obj.setName("sabu");
			obj.setEmpdomain("software Engineer");
			
			Configuration conf = new Configuration().configure(" ").addAnnotatedClass(Employeedetails.class);
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
			SessionFactory sf = conf.buildSessionFactory(reg);
			Session session = sf.openSession();
			Transaction tc = session.beginTransaction();
			session.save(obj);
			tc.commit();
			System.out.println("records saved successfully");
		}

	}

