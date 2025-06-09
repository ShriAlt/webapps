<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Weather Report Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Submitted Weather Report</h2>
        <p><strong>Location:</strong> ${dto.location}</p>
        <p><strong>Recorded By:</strong> ${dto.recordedBy}</p>
        <p><strong>Temperature:</strong> ${dto.temperature}</p>
        <p><strong>Recorded Date:</strong> ${dto.date}</p>
</div>
</body>
</html>
