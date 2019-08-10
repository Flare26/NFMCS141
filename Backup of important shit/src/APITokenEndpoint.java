//Nathan Frazier universal token endpoint

public class APITokenEndpoint {
    static String apiToken = "YOURTOKEN";
    static String apiEndpoint = "http://YOURDOMAIN.freshdesk.com";
    protected String username = "username";
    protected String password = "password";
    
    public APITokenEndpoint ( String apitoken , String apiendpoint ) {
    	apiToken = apitoken;
    	apiEndpoint = apiendpoint;
    }
    
    public void setLogin (String username, String password) {
    	this.username = username;
    	this.password = password;
    }
}
