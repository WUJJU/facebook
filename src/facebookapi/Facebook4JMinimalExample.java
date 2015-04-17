package facebookapi;

import facebook4j.Event;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Place;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import facebook4j.conf.ConfigurationBuilder;
import facebook4j.internal.org.json.JSONArray;
import facebook4j.internal.org.json.JSONException;
import facebook4j.internal.org.json.JSONObject;

public class Facebook4JMinimalExample {
    /**
     * A simple Facebook4J client.
     * 
     * 
     * @param args
     * @throws FacebookException 
     * @throws JSONException 
     */
    public static void main(String[] args) throws FacebookException, JSONException {

    // Generate facebook instance.

    
    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
      //.setRestBaseURL("https://graph.facebook.com/v1.0/")
      .setOAuthAppId("825030874233862")
      .setOAuthAppSecret("a6db4e0f922116bfd08af0849d51df97")
      .setOAuthAccessToken("CAACEdEose0cBAD6XXXTZA47aEw2uZABDszDDUZBFQkWnSsZCqiUsOsrkd1hArLplGQlL5I9bH32ymd2Qh8dCuKzbgL7afZA5dZAvmtaFYpvvxnmFrNgGeoZA7nUaZBuW3XRPpgFdp23vQK9XWJ9bZBEPnHtZBCTFKurRQtpHY6y7y4pxJOvdUsu4BgP45QrZCfCn9AbAoRSry8lPVZAhJDS2L3pAQ88hdu6opY0ZD")
      .setOAuthPermissions("");
    FacebookFactory ff = new FacebookFactory(cb.build());
    Facebook facebook = ff.getInstance();


  // ResponseList<User> results = facebook.searchUsers("Hao Wu");
   //System.out.println(results.size());
   // System.out.println(facebook.getConfiguration().getRestBaseURL());
    //ResponseList<Post> results = facebook.searchPosts("pittsburgh",new Reading().limit(100));

    ResponseList<Event> results = facebook.searchEvents("conference");
    for (Event result : results) {
        System.out.println(result.getLocation()+"--");
    }
  //  facebook.postStatusMessage("api post");
    }
}
