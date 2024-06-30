package in.pwskills.nitin.dao;

import in.pwskills.nitin.beans.Naukri;

public interface INaukriDao {
	public void saveObject(Naukri naukri);
	public Naukri readObject();
}
