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

    <form action="excel-servlet" method="post" enctype="multipart/form-data">
        <div class="mb-3">
            <label for="excelFile" class="form-label">Choose an excelFile:</label>
            <input class="form-control" type="file" name="excelFile" id="excelFile" accept=".xlsx, .xls" required>
        </div>
        <button type="submit" class="btn btn-primary">Upload</button>
    </form>
</div>
</body>
</html>