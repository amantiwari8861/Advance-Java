<%@page import="servlet.image.GetImage"%>
<%@page import="java.util.Vector"%>
<%@page import="servlet.image.GetImage" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name=frm method="post" action="UploadImage">
<table>
<tr><TD ><B>Upload Image</B></TD>
<td><input type="file" name="Image" size="20" value=""></TD>
</tr>
<tr>
<td><input type="submit" height="30" width="62"> </td>
</tr>
<tr>
<TD><b>ClickImage</b>
<%
GetImage udet = new GetImage();
Vector<String[]> V_ids=new Vector<String[]>();
V_ids=udet.ImageList();
for(int i=0;i<V_ids.size();i++)
{

String temp[] = new String[2];
int j=i+1;
temp=(String[])V_ids.get(i);

%></TD>
<td><a target='_blank' href='<%=response.encodeURL("RetrieveImage?Image_id="+temp[0])%>' 
onmouseover='_ScrollStatus("Click here for view", 1);'
onmouseout='_StopScrollStatus();' onblur='_StopScrollStatus();' >
<b><%=temp[1] %></b>
</a></TD>
<%
}
%></TR>
</table>
</form>
</body>
</html>