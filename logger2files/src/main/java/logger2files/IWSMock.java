package logger2files;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWSMock {

	@WebMethod
	String greet(String name);
}
