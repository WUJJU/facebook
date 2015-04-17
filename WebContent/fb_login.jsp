<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>

    <script>

   window.fbAsyncInit = function() {
        FB.init({
          appId      : '825030874233862',
          xfbml      : true,
          version    : 'v2.3'
        });
        FB.login(function(){FB.api('/me/feed', 'post', {message: 'Hello, world!'});}, {scope: 'publish_actions'});
        FB.getLoginStatus(function(response) {
      	  if (response.status === 'connected') {
      	    console.log('Logged in.');
      	  }
      	  else {
      	    FB.login();
      	  }
      	});
      };
  
  
      (function(d, s, id){
         var js, fjs = d.getElementsByTagName(s)[0];
         if (d.getElementById(id)) {return;}
         js = d.createElement(s); js.id = id;
         js.src = "//connect.facebook.net/en_US/sdk/debug.js";
         fjs.parentNode.insertBefore(js, fjs);
       }(document, 'script', 'facebook-jssdk'));

   
      FB.ui({
    	     method: 'share_open_graph',
    	     action_type: 'og.likes',
    	     action_properties: JSON.stringify({
    	      object:'https://developers.facebook.com/docs/',
    	     })
    	    }, function(response){});
      
    
    </script>
	<div class="fb-like" data-send="true" data-width="450"
		data-show-faces="true"></div>
		
		
</body>
</html>