package in.pwskills.nitin;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.pwskills.nitin.bean.Person;

public class MarshallingApp {
	public static void main(String[] args) throws Exception {

		Person person = new Person();
		person.setId(10);
		person.setEmail("sachin@gmail.com");
		person.setGender("male");
		person.setName("sachin");

		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(context, new File("person.xml"));
		System.out.println("Marshalling completed...");

	}
}
