<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">

	<%@ include file="./shared/sidenav.jsp"%>
	<!-- /.col-lg-3 -->

	<div class="col-md-9">

		<div class="row">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
				<li class="breadcrumb-item"><a href="#">Category</a></li>
				<li class="breadcrumb-item active">Products</li>
			</ol>
		</div>
		<div class="col-sm-12">
			<h3>Product Data Table</h3>
		</div>
	</div>
</div>
</body>
</html>