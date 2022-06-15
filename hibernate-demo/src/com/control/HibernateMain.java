package com.control;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;
import com.to.Team;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class HibernateMain {

	public static void main(String[] args) {
		try{
			Configuration configuration=new Configuration().configure();
		
		configuration.addAnnotatedClass(com.to.Player.class);
		configuration.addAnnotatedClass(com.to.Team.class);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Team t1=new Team("India");
		Team t2=new Team("Delhi");
		
		Player p=new Player();
		p.setAge(29);
		p.setPlayerName("Kolhi");
		p.getTeamList().add(t1);
		p.getTeamList().add(t2);
		
		
//		Player p1=new Player(1,"Amit",t1,30);
//		Player p2=new Player(2,"Dhoni",t1,27);
//		Player p3=new Player(3,"Jadeja",t1,33);
		session.save(t1);
		session.save(t2);
		session.save(p);
		transaction.commit();
		session.close();
		
	}
	catch (Exception ex) {
		System.out.println(ex.getMessage());
		
	}

}
}
