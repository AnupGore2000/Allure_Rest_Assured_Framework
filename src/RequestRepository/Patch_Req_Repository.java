package RequestRepository;

public class Patch_Req_Repository {
	
	public static String BaseURI () {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	
	public static String Patch_Resource() {
		String patch_Resource = "api/users/2";
		return patch_Resource;
	}
	
	public static String Patch_Req_TC1() {
		String RequestBody = "{\r\n"
				+ "    \"name\": \"Anup\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		return RequestBody;
	}


}
