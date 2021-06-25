<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>成绩上传</title>
    <style type="text/css">
    div{
       width: 200px;
       height: 200px;
       margin-left: auto;
       margin-right: auto;
       margin-top: 100px;
    }
    </style>
</head>
<body>
<div>
<s:form action="ScoreUpload" enctype="multipart/form-data" method="post" theme="simple">
  <table>
     <tr>
       <td><s:file name="upload" id="upload"></s:file></td>
     </tr>
     <tr>
        <td align="right"><s:submit value="提交"></s:submit>&nbsp;&nbsp;&nbsp;
            <input type="button" value="返回" onclick="window.location='scoreQueryAll'"/></td>
     </tr>
  </table>
</s:form> 
</div>


            
</body>
</html>