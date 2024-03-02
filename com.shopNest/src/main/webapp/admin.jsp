<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin home</title>
</head>
<body>
<%
List userList=DataFetcher.fetchUsersInfo();

%>

<div class="panel">

<div class="button-container">
<button class="active" data-tab="tab1">View Customer info</button>
<button data-tab="tab2">View Products info</button>
<button data-tab="tab3">View new Products </button>



</div>
<div class="content-container">
<div class="tab active" id="tab1">
<table border>
<thead>
<tr>
<th>UserName</th>
<th>Email</th>
<th>Gender</th>
<th>Address</th>
</tr>
</thead>
<tbody>
<%
for(int i=0;i<userList.size();i++){
	String[] custArr=((String)userList.get(i)).split(":");

%>
<tr>
   <td><%= custArr[0] %></td>
   <td><%= custArr[1] %></td>
   <td><%= custArr[2] %></td>
   <td><%= custArr[3] %></td>

  </tr>
<%
}
%>

</tbody>
</table>

</div>


</div>




</div>

</body>
</html>