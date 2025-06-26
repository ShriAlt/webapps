<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">
<nav class="navbar navbar-expand-lg bg-black tertiary navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">User</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link "  href="SignInPage.jsp">Sign In</a>
                <a class="nav-link "  href="SignUpPage.jsp">Sign Up</a>


            </div>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 col-lg-5">
            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4 class="mb-0">Sign Up</h4>
                </div>
                <div class="card-body">
                    <form action="SignUpServlet" method="post">
                        <span>${error}</span>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email address</label>
                            <input class="form-control" id="email" name="email" placeholder="Enter your email">
                        </div>

                        <div class="mb-3">
                            <label for="userId" class="form-label">User ID</label>
                            <input class="form-control" id="userId" name="userId" placeholder="Choose a user ID">
                        </div>

                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input class="form-control" id="password" name="password" placeholder="Enter your password">
                        </div>

                        <div class="mb-3">
                            <label for="confirmPassword" class="form-label">Confirm Password</label>
                            <input class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Re-enter your password">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Sign Up</button>
                        </div>
                    </form>
                </div>
                <div class="card-footer text-center text-muted">
                    Already have an account? <a href="SignInPage.jsp">Login</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
