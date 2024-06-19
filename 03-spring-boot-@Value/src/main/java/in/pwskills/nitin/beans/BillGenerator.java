package in.pwskills.nitin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {

	//SPEL
	@Value("#{info.idlyPrice+ info.dosaPrice + info.vodaPrice}")
	private float billAmount;

	@Value("Paradise")
	private String hotelName;

	@Autowired
	private ItemsInfo items;

	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", hotelName=" + hotelName + ", items=" + items + "]";
	}

}
