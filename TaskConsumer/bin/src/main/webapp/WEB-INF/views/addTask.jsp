<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Tasks in System</h2>

	<table border="1">
		<tr>
			<th>Task Id</th>
			<th>Task Name</th>
		</tr>
		<c:forEach items="${tasks}" var="task">
			<tr>
				<td>${task.id}</td>
				<td>${task.taskName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>