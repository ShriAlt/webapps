<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Image Upload</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Upload an Image</h2>

    <form action="UploadServlet" method="post" enctype="multipart/form-data">
        <div class="mb-3">
            <label for="imageFile" class="form-label">Choose an image:</label>
            <input class="form-control" type="file" name="image" id="imageFile" accept="image/*" required>
        </div>
        <button type="submit" class="btn btn-primary">Upload</button>
    </form>
</div>
</body>
</html>
