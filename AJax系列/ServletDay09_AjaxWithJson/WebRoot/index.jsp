<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
	<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
  </head>
  
  <body>
    <center>
      <div id="box">
      <form>
        <input type="text" id="kw" value="" onkeyup="getMoreInfor()">
        <table id="mytable">
                
        </table>
      </form>
      
      </div>
    
    </center>
    <script type="text/javascript">
       function getMoreInfor()
       {
    	   var kw = $("#kw").val();
    	   $("#mytable").empty();
    	   if(kw !="" && kw.length>0)
    		   {
    		     $.getJSON('${pageContext.request.contextPath}/SearchServlet?keywords='+kw,
    		    		 function(data){
    		    	    var str ="";
    		    	    $.each(data,function(i,value){
    		    	    	str+="<tr><td>"+value+"</td></tr>";
    		    	    });
    		    	    $("#mytable").html(str);
    		     
    		     });
    		   }
       }
    
    
    </script>
  </body>
</html>
