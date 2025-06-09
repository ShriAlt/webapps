<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4">Weather Report Entry</h2>
        <form action="weatherServlet" method="post" class="border p-4 shadow rounded bg-light">
            <div class="mb-3">
                <label for="location" class="form-label">Location Name</label>
                <input type="text" class="form-control" id="location" name="location" required>
            </div>
            <div class="mb-3">
                <label for="recordedBy" class="form-label">Recorded By</label>
                <input type="text" class="form-control" id="recordedBy" name="recordedBy" required>
            </div>
            <div class="mb-3">
                <label for="temperature" class="form-label">Temperature</label>
                <input type="number" step="0.1" class="form-control" id="temperature" name="temperature" required>
            </div>
            <div class="mb-3">
                <label for="date" class="form-label">Record Date</label>
                <input type="date" class="form-control" id="date" name="date" required>
            </div>
            <button type="submit" class="btn btn-primary">Record</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
