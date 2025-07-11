<%@ page import="java.util.*, com.model.Post, com.model.Comment" %>
<%@ page import="com.dao.PostDAO, com.dao.PostDAOImpl" %>
<%@ page import="com.dao.UserDAO, com.dao.UserDAOImpl" %>
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
    <p>You've successfully logged in. This is your home page where you can post, comment your thoughts.</p>

    <p>If you wish to log out, <a href="index.jsp">click here</a>.</p>

    <a href="post.jsp">Add a Post</a><br><br>
    <a href="comment.jsp">Comment on a Post</a><br><br>
    <a href="view.jsp">View all posts</a><br><br>
    <%
                UserDAO userDAO = new UserDAOImpl();
                PostDAO postDAO = new PostDAOImpl();
                List<Map<String, String>> rows = postDAO.getPostCommentRows();
                int userid = userDAO.getUserID(username);

                int post_count = postDAO.getPostCount(userid);

            %>
    <h3>You have <%= post_count %> post/s so far</h3>
</body>
</html>
