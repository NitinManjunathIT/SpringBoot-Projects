package in.pwskills.nitin;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.pwskills.nitin.bean.Customer;

public class App {
	public static void main(String[] args) {

		try {
			// use ObjectMapper class
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and put into java object
			File file = new File("data/sample.json");

			//converting JSON to Java object
			Customer customer = mapper.
							readValue(file, Customer.class);
			
			//use java object
			System.out.println(customer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
