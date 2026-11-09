package singleton;

public class RedisConfig {
    private String url;
    private String password;
    private String user;
    private int port;

    private RedisConfig(String url,String password,String user,int port){

        this.url = url +":"+port+"/" ; // Added Validation and user able to use same class for multiple Environment
        this.password= password;
        this.user = user;
        this.port = port;

    }

    private static RedisConfig INSTANCE = null; // static used for creating object at complile time which is know as eager loading

    public static RedisConfig getINSTANCE(){
        // Only one instance will be created
        if(INSTANCE == null){
            INSTANCE = new RedisConfig("http://localhost","*****","Admin",8082);
        }
        return INSTANCE;
    }

    public String getUrl(){
        return INSTANCE.url; // User Only get URL Other are secure
    }

}
