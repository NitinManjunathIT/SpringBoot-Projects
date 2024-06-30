package in.pwskills.nitin.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.Naukri;
import in.pwskills.nitin.dao.INaukriDao;

@Component
public class NaukriRunner implements CommandLineRunner {

	@Autowired
	private INaukriDao dao;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Naukri naukri = new Naukri(); 
		 * naukri.setAddress("RCB");
		 * naukri.setName("nitin");
		 * 
		 * File image = new File("D:\\images\\nitin.JPG"); naukri.setImage(image);
		 * 
		 * File resume = new File("D:\\images\\resume.txt"); naukri.setResume(resume);
		 * 
		 * dao.saveObject(naukri);
		 */

		Naukri naukri = dao.readObject();
		System.out.println("Name     is :: " + naukri.getName());
		System.out.println("Address  is :: " + naukri.getAddress());
		System.out.println("Image    is :: " + naukri.getImage().getAbsolutePath());
		System.out.println("Resume   is :: " + naukri.getResume().getAbsolutePath());

	}
}
