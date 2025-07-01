<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Animate.css for animations -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" rel="stylesheet">

    <style>
        body {
          background: linear-gradient(135deg, #dff6ff, #bde0fe);
          height: 100vh;
          display: flex;
          justify-content: center;
          align-items: center;
          font-family: 'Segoe UI', sans-serif;
        }

        .card {
          animation: fadeInUp 1s ease forwards;
          opacity: 0;
          border: none;
          border-radius: 15px;
          box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        @keyframes fadeInUp {
          0% {
            transform: translateY(30px);
            opacity: 0;
          }
          100% {
            transform: translateY(0);
            opacity: 1;
          }
        }

        .btn-custom {
          padding: 8px 30px;
          font-size: 1rem;
          border-radius: 20px;
          margin: 0 10px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6 col-lg-5 animate__animated animate__fadeInDown">
            <div class="card shadow-lg">
                <div class="card-header bg-primary text-white text-center rounded-top">
                    <h4 class="mb-0">Sign In</h4>
                </div>
                <div class="card-body">
                    <form action="SignInServlet" method="post">
                        <div class="mb-3">
                            <span style="color: red;">${error}</span>
                            <label for="userId" class="form-label">User ID</label>
                            <input type="text" class="form-control" id="userId" name="userId" placeholder="Enter your user ID" required>
                        </div>

                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                        </div>

                        <div class="d-grid gap-2">
                            <button type="submit" class="btn btn-primary">Sign In</button>
                        </div>
                    </form>
                </div>
                <div class="card-footer text-center text-muted">
                    Forgot password? <a href="ForgotPassword.jsp">Reset</a>
                </div>
                <div class="card-footer text-center text-muted">
                    Don’t have an account? <a href="SignUpPage.jsp">Sign Up</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
