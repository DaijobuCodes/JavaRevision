<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("user");
    if (username == null) {
        response.sendRedirect("/FacebookYash");
        return;
    }
%>
    <h2>Welcome, <%= session.getAttribute("user") %>!</h2>
    <p>You've successfully logged in. This is your home page where you can explore features, connect with others, and customize your experience.</p>

    <p>If you wish to log out, <a href="index.jsp">click here</a>.</p>

    <a href="post.jsp">Add a Post</a><br><br>
    <a href="comment.jsp">Comment on a Post</a><br><br>
    <a href="view.jsp">View all posts</a>
</body>
</html>
