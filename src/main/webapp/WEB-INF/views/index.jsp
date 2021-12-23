<html>
<head>
	<%@include file="./base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Basic Movie Crud App</h1>
				
				<table class="table">
				  <thead class="table-dark">
				    <tr>
				    	<th scope="col">#</th>
				    	<th scope="col">Director Name</th>
				    	<th scope="col">Director Name</th>
				    	<th scope="col">Vision Date</th>
				    	<th scope="col">Action</th>
				    	
				    </tr>
				  </thead>
				  <tbody>
				  
				  <c:forEach items="${movies }" var="movie">
				    <tr style="vertical-align : middle">
				    	<th scope="row">${movie.id }</th>
				    	<td>${movie.movieName }</td>
				    	<td>${movie.director }</td>
				    	<td>${movie.visionDate }</td>
				    	<td >
				    	<a href="delete/${movie.id }"><i class="far fa-trash-alt text-danger" style="font-size: 1.5em ; margin-right: 1em"></i></a>  
				    	<a href="update/${movie.id }"><i class="far fa-edit text-primary" style="font-size: 1.5em" ></i></a>
				    	</td>
				    </tr>
				    </c:forEach>
				  </tbody>
				</table >
				
				<div class="container text-center">
					<a href="add-movie" class="btn btn-outline-primary ">Add Movie</a>
					<a href="deleteAll" class="btn btn-outline-danger ">Delete All Movie</a>
				</div>
				
				
			</div>
		</div>
	</div>
	
</body>
</html>
