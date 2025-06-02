<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h1 class="mb-4 text-primary">Contact Page</h1>
    
    <form action="ContactServlet" class="row g-3">
        <div class="col-md-6">
            <label for="name" class="form-label">Name:</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Enter your name">
        </div>

        <div class="col-md-6">
            <label for="email" class="form-label">Email:</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Enter your email">
        </div>

        <div class="col-md-6">
            <label for="phone" class="form-label">Phone:</label>
            <input type="tel" id="phone" name="phone" class="form-control" placeholder="Enter your phone number">
        </div>

        <div class="col-12">
            <label for="coments" class="form-label">Comments:</label>
            <textarea id="coments" name="coments" class="form-control" rows="4" placeholder="Enter your comments"></textarea>
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-primary">Contact</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
