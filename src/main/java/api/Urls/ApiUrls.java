package api.Urls;

public class ApiUrls {

    //this class will maintain the urls and endpoints each module wise.

    //defining base url
    public static String base_url = "http://localhost:3002/api";


    //defining todoItems urls
    public static String get_Url = base_url+"/todoItems/{iD}";
    public static String post_Url = base_url+"/todoItems";
    public static String put_Url= base_url+"/todoItems/{iD}";

}
