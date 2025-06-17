<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Birth Certificate Form</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-black tertiary navbar-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">GENERAL</a>

            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link active "  href="JobApplication.jsp">Job Application</a>
                    <!--                    <a class="nav-link active" href="BirthCertificate.jsp">Birth Certificate</a>-->
                    <!--                    <a class="nav-link" href="Passport.jsp">Passport</a>-->
                    <!--                    <a class="nav-link" href="DeathCertificate.jsp"> Death Certificate</a>-->
                    <!--                    <a class="nav-link" href="DrivingLicense.jsp"> Driving License</a>-->
                    <!--                    <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>-->
                </div>
            </div>
        </div>
    </nav>
</header>
<body style="background-color: #eef6fb">
<div class="container mt-5 p-4 shadow bg-white rounded">
    <h2 class="text-center text-primary mb-4">Loan Application</h2>

    <form action="LoanServlet" method="post">
        <div class="mb-3">
            <label for="fullName" class="form-label">Full Name</label>
            <input type="text" class="form-control" name="fullName" id="fullName" required>
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" name="email" id="email" required>
        </div>

        <div class="mb-3">
            <label for="phone" class="form-label">Phone</label>
            <input type="text" class="form-control" name="phone" id="phone" required>
        </div>

        <div class="mb-3">
            <label for="loanType" class="form-label">Loan Type</label>
            <select class="form-select" name="loanType" id="loanType" required>
                <option value="" disabled selected>Select loan type</option>
                <option value="Personal">Personal Loan</option>
                <option value="Home">Home Loan</option>
                <option value="Education">Education Loan</option>
                <option value="Vehicle">Vehicle Loan</option>
                <option value="Business">Business Loan</option>
            </select>

        </div>

        <div class="mb-3">
            <label for="occupation" class="form-label">Occupation</label>
            <input type="text" class="form-control" name="occupation" id="occupation" required>
        </div>

        <div class="mb-3">
            <label for="city" class="form-label">City</label>
            <input type="text" class="form-control" name="city" id="city" required>
        </div>

        <div class="mb-3">
            <label for="loanAmount" class="form-label">Loan Amount (₹)</label>
            <input type="number" class="form-control" name="loanAmount" id="loanAmount" required>
        </div>

        <div class="form-check mb-4">
            <input class="form-check-input" type="checkbox" name="termsAccepted" id="termsAccepted" value="true" required>
            <label class="form-check-label" for="termsAccepted">
                I accept the terms and conditions
            </label>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Apply Now</button>
        </div>
    </form>
</div>
</body>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>