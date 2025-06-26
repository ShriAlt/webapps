<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <title>index</title>
</head>
<body>
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
                <div class="card-header bg-dark text-white text-center">
                    <h4 class="mb-0">Sign In</h4>
                </div>
                <div class="card-body">
                    <form action="ForgotPasswordServlet" method="post"> <span style="color:red">${error}</span>
                        <div class="mb-3">
                            <p>enter the otp sent to the email ${dto.email}</p>
                            <label for="otp" class="form-label">OTP:</label>
                            <input class="form-control" id="otp" name="otp" placeholder="Enter otp">
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-dark">Reset</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>