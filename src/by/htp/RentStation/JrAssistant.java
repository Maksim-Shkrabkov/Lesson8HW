package by.htp.RentStation;

public class JrAssistant extends Assistant {

	private static String position = "Junior Assistant";
	
	public static void greeting(String welcome) {
		System.out.println("--------");
		System.out.println(welcome + JrAssistant.position);
	}

}
