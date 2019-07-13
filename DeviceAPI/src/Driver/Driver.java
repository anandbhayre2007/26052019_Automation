package Driver;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Driver {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		STFService stf= new STFService("https://10.120.87.248","4710b4dbd418486c8a12f281601ad6ccc960146bc9a24e5e8476defd5312ee6c");
		
		DeviceApi device= new DeviceApi(stf);
		
		device.connectDevice("55709a2f");
		
		System.out.println(device.getDeviceProvider());
		
		device.releaseDevice("55709a2f");
		

	}

}
