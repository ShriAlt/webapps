<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">View Profile Image</h2>

    <form action="ProfileServlet" method="post">
        <div class="mb-3">
            <span style="color: red;">${error}</span>
            <label for="userId" class="form-label">User ID</label>
            <input type="text" class="form-control" id="userId" name="userId" placeholder="Enter your user ID" required>
        </div>

        <c:if test="${not empty dto}">
            <div class="mb-3">
                <label>Uploaded Image:</label><br>
                <img src="UploadServlet?name=${dto.fileName}" width="250" class="img-thumbnail">
            </div>
        </c:if>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
