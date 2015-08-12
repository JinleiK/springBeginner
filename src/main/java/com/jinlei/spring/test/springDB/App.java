package com.jinlei.spring.test.springDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/jinlei/spring/test/springDB/beans.xml");
		
		OfferDAO offerDao = (OfferDAO) context.getBean("offerDao");
		
		try{
//			Offer offer1 = new Offer("Frank", "frank@gmail.com", "qqqqqqqqqq");
//			Offer offer2 = new Offer("George", "goerge@gmail.com", "ddgsdfsdfsdfsd");
//			
//			System.out.println(offerDao.create(offer1)? "offer created": "create failed");
//			offerDao.create(offer2);
			
			List<Offer> offersCreate = new ArrayList<Offer>();
			offersCreate.add(new Offer(10, "Henry", "henry@gmail.com", "dfa fsdfas"));
			offersCreate.add(new Offer(11, "Linda", "linda@gmail.com", "sfsgdfsdfg"));
			
			int[] created = offerDao.create(offersCreate);
			
			for (int i : created) {
				System.out.println("updated " + i + "rows");
			}
			
			List<Offer>	offers = offerDao.getOffers();
			
			for(Offer offer : offers) {
				System.out.println(offer);
			}
			
//			offerDao.delete(5);
			
			Offer offer = offerDao.getOffer(2);
			System.out.println(offer);
			offer.setEmail("bob@hotmail.com");
			System.out.println(offerDao.update(offer)? "offer updated" : "update failed");
			System.out.println(offer);
		} catch (CannotGetJdbcConnectionException ex) {
			System.out.println("Cannot get database connection.");
		}
		catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}
		
		
		((FileSystemXmlApplicationContext) context).close();
	}

}