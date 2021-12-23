<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<%@include file = "./base.jsp" %>
</head>
<body>
	
	<div class="container mt-3">
		<div class="row align-items-center">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3"> Update ${movie.movieName } Informations</h1>
				<form action="${pageContext.request.contextPath }/handle-movie" method="post">
				<input type="hidden" value="${movie.id }" name="id">
					<div class="form-group mb-3">
						<label for="movieName">Movie Name</label> 
						<input type="text"
							class="form-control" 
							id="movieName" 
							aria-describedby="emailHelp"
							name="movieName" 
							placeholder="Enter the movie name"
							value="${movie.movieName}"
							>
							
					</div>
					
					<div class="form-group mb-3">
					
						<label for="director">Director Name</label>
						<input type="text"
							class="form-control" 
							id="director" 
							aria-describedby="emailHelp"
							name="director" 
							placeholder="Enter the director name"
							value="${movie.director}"
							>
					</div>
					
					<div class="form-group mb-3">
					
						<label for="visionDate">Vision Date</label>
						 <input type="text"
							class="form-control" 
							id="visionDate" 
							aria-describedby="emailHelp"
							name="visionDate" 
							placeholder="Enter the vision date"
							value="${movie.visionDate}"
							>
					</div>
					
					<div class="container text-center mb-3">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>			
					</div>
				</form>		
			</div>
		</div>
	</div>
	
	
	
</body>
</html>