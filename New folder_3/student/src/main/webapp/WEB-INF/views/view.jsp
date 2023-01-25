<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">  
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"> </script>  
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"> </script>  
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"> </script>  
	  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">   
	  <script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"> </script>  
	    		
	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
	<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>  
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>

	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.all.min.js"></script>  
	<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@7.12.15/dist/sweetalert2.min.css'></link> 
	

	
	<script>
		$(document).ready(function() {
			$('#myTable').dataTable({
				pagingType: 'full_numbers',
				lengthMenu: [
		            [5, 10, 25, 50, -1],
		            [5, 10, 25, 50, 'All'],
		        ],
			});
		});
	</script>
<title>View</title>
</head>

<body>
	<c:if test="${msg == 'success' }">
		<script>
			swal('Data Saved Successfully');
		</script>
	</c:if>
<div class="card-body">

	<div class="container">
			<h1 align="center">Student Details</h1>
		<fieldset class="border border-5" style="background: #E0E0E0;">
			<table id="myTable" class="display table-sm">
				<thead>
					<tr>
						<th>SL no</th>
						<th>Name</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${students }" varStatus="status">
						<tr>
							<td class="text-center">${status.index+1 }</td>
							<td class="text-center">${students.studentName }</td>
							<td class="text-center">${students.studentEmail }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
	</div>
</body>
</html>