<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td{
border:1px solid black;
}

</style>
<body>
<h2>Search Results</h2>
  
    <form>
        <input type="hidden" name="stid"
            value="<%=request.getParameter("empIDS")%>">
  
        <table style="width: 10%">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Salary</td>
            </tr>
            <tr>
                <td><%=request.getParameter("id")%></td>
                <td><%=request.getParameter("name")%></td>
                 <td>$<%=request.getParameter("salary")%></td>
            </tr>
        </table>
        <br />
        </form>
        <input type="button" value="Home Page"
        onclick="window.location.href='index.html'" />

</body>
</html>