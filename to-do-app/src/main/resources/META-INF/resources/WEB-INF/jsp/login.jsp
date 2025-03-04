<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>Login</head>
	<body>
		<div class = "container">
			Login page 
			<pre>${errorMessage}</pre>
			<form method = "post">
				Name:<input type = "text" name = "name">
				Password:<input type = text" name = "password">
				<input type = "submit">	
			</form>
		</div>	
	</body>
</html>
		