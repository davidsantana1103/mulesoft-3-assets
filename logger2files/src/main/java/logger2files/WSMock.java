package logger2files;

import javax.jws.WebService;

@WebService
public class WSMock implements IWSMock{
	
	@Override
	public String greet(String name) {
		return "Hello "+name;
	}

}
