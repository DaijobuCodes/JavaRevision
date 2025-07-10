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

<%
    for (Map<String, String> row : rows) {
        String pid = row.get("pid");

        if (!pid.equals(lastPid)) {
%>
    <div style="margin-top:20px; padding:10px; border:1px solid #ccc;">
        <h3><%= row.get("postUser") %> posted:</h3>
        <p><%= row.get("post") %></p>
        <small>Posted on: <%= row.get("postTime") %></small>
        <hr>
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
