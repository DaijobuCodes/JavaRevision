<%@ page import="java.util.*, com.model.Post, com.model.Comment" %>
<%@ page import="com.dao.PostDAO, com.dao.PostDAOImpl" %>
<%
    PostDAO postDAO = new PostDAOImpl();
    List<Map<String, String>> rows = postDAO.getPostCommentRows();

    String lastPid = "";
%>

<html>
<head><title>Post Viewer</title></head>
<body>
<h2>Posts and Comments</h2>
<a href="home.jsp">Go Back!</a><br>
<a href="comment.jsp">Wanna comment<a>

<%
    for (Map<String, String> row : rows) {
        String pid = row.get("pid");

        if (!pid.equals(lastPid)) {
%>
        <hr>
        <h3><%=pid %>. <%= row.get("postUser") %> posted:</h3>
        <h2><%= row.get("post") %></h2>
        <small>Posted on: <%= row.get("postTime") %></small>
        <br>
        <%
            int comment_count = postDAO.getCommentCount(Integer.parseInt(pid));
        %>
        <h4>This post has <%=comment_count %> comment/s.</h4>
        <h4>Comments:</h4>
<%
            lastPid = pid;
        }
%>
        <p><strong><%= row.get("commentUser") %>:</strong> <%= row.get("comment") %> <em>(<%= row.get("commentTime") %>)</em></p>
<%
    }
%>
</body>
</html>
