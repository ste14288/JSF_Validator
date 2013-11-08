package model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.BreakfastMenu.Food;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext context = JAXBContext.newInstance("model");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			BreakfastMenu menu = (BreakfastMenu) unmarshaller.unmarshal(new File("C:\\Users\\philip\\git\\POSy\\Steinhäuser_XML\\simple.xml"));

			for(int i = 0; i<menu.getFood().size(); i++){
				Food f = (Food) menu.getFood().get(i);
				
				System.out.println(f.getName());
				System.out.println(f.getCalories());
				System.out.println(f.getDescription());
				System.out.println(f.getPrice());
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
