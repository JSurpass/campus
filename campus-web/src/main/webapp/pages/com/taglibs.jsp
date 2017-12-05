<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<meta http-equiv="X-UA-Compatible" content="IE=8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
