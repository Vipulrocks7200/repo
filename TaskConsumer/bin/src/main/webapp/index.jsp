<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<script type="text/javascript">

  window.onload = function() {

    document.getElementById("add").style.display = "none";
    document.getElementById("delete").style.display = "none";

  };

  function add(a) {
  
    if (a == 1) {
      document.getElementById("add").style.display = "block";
    }
    else if (a == 2) {
        document.getElementById("delete").style.display = "block";
      }
    else {
      document.getElementById("add").style.display = "none";
    }
      
  }
</script>
</head>
<body>
<h2>Hello World!</h2>
<form action= "${contextPath}/tasks-module/getAllTasks">
<button type="submit" name="getTask" >GetAllTask</button>
</form>

<button type="submit" name="addTask1" onclick="add(1)">AddTask</button>
<button type="submit" name="deleteTask1" onclick="add(2)">DeleteTask</button>

<form action= "${contextPath}/tasks-module/addTask" id="add"  method="post">
<input type="text" name="taskname"/>
<input type="submit" name="addTask" value="Add Task"/>
</form>

<form action= "${contextPath}/tasks-module/deleteTask" id="delete"  method="post">
<input type="text" name="taskid"/>
<input type="submit" name="deleteTask" value="Delete Task"/>
</form>


</body>
</html>
