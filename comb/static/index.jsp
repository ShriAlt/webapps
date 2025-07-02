<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Index</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

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

<div class="card p-4 text-center" style="width: 350px;">
    <h3 class="mb-3">Welcome!</h3>
    <p class="text-muted mb-4">Please choose an option to continue:</p>
    <div class="d-flex justify-content-center">
        <a href="SignInPage.jsp" class="btn btn-primary btn-custom">Sign In</a>
        <a href="SignUpPage.jsp" class="btn btn-outline-success btn-custom">Sign Up</a>
        <a href="CoustomTag.jsp" class="btn btn-outline-success btn-custom">coustom tag</a>
        <a href="UploadImage.jsp" class="btn btn-outline-success btn-custom">upload </a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
