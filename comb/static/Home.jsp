<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Animate.css for smooth animation -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>

    <style>
        body {
            background: linear-gradient(to right, #83a4d4, #b6fbff);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .welcome-card {
            border-radius: 1rem;
            box-shadow: 0 0 15px rgba(0,0,0,0.2);
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6 animate__animated animate__fadeInDown">
            <div class="card welcome-card text-center">
                <div class="card-header bg-dark text-white">
                    <h4 class="mb-0">Welcome!</h4>
                </div>
                <div class="card-body">
                    <h2 class="mb-3"><strong>Hello, ${dto.userId} 👋</strong></h2>
                    <p class="lead">You have successfully signed in to your account.</p>
                    <a href="SignOutServlet" class="btn btn-outline-danger mt-3">Sign Out</a>
                </div>
                <div class="card-footer text-muted">
                    Have a great day!
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
