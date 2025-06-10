<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Application Form</title>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
              <a class="navbar-brand" href="index.jsp">GENERAL</a>
    
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
    
              <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link "  href="JobApplication.jsp">Job Application</a>
                    <a class="nav-link " href="BirthCertificate.jsp">Birth Certificate</a>
                    <a class="nav-link active" href="Passport.jsp">Passport</a>
                    <a class="nav-link" href="DeathCertificate.jsp"> Death Certificate</a>
                    <a class="nav-link" href="DrivingLicense.jsp"> Driving License</a>
                    <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                </div>
              </div>
            </div>
          </nav>
    </header>

<div class="container mt-5">
    <h2 class="text-center mb-4">Passport Application Form</h2>

    <form class="row g-3" action="PassportApplicationServlet" method="post">
        <div class="col-md-6">
            <label for="applicantName" class="form-label">Applicant Name</label>
            <input type="text" class="form-control" id="applicantName" name="applicantName" placeholder="Enter Full Name" required>
        </div>

        <div class="col-md-6">
            <label for="aadhaarNo" class="form-label">Aadhaar Number</label>
            <input type="text" class="form-control" id="aadhaarNo" name="aadhaarNo" placeholder="Enter Aadhaar Number" required>
        </div>

        <div class="col-md-6">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="Enter Full Address" required>
        </div>

        <div class="col-md-6">
            <label for="panNo" class="form-label">PAN Number</label>
            <input type="text" class="form-control" id="panNo" name="panNo" placeholder="Enter PAN Number" required>
        </div>

        <div class="col-md-6">
            <label for="country" class="form-label">Country</label>
            <input type="text" class="form-control" id="country" name="country" placeholder="Enter Country Name" required>
        </div>

        <div class="col-md-6">
            <label for="state" class="form-label">State</label>
            <input type="text" class="form-control" id="state" name="state" placeholder="Enter State Name" required>
        </div>

        <div class="col-md-6">
            <label for="city" class="form-label">City</label>
            <input type="text" class="form-control" id="city" name="city" placeholder="Enter City Name" required>
        </div>

        <div class="col-md-6">
            <label for="pinCode" class="form-label">Pin Code</label>
            <input type="text" class="form-control" id="pinCode" name="pinCode" placeholder="Enter Pin Code" required>
        </div>

        <div class="col-md-6">
            <label for="passportType" class="form-label">Passport Type</label>
            <select class="form-select" id="passportType" name="passportType" required>
                <option selected disabled>Select Passport Type</option>
                <option value="Regular">Regular</option>
                <option value="Tatkal">Tatkal</option>
                <option value="Diplomatic">Diplomatic</option>
                <option value="Official">Official</option>
            </select>
        </div>

        <div class="col-md-6">
            <label for="paymentRef" class="form-label">Payment Reference Number</label>
            <input type="text" class="form-control" id="paymentRef" name="paymentRef" placeholder="Enter Payment Reference Number" required>
        </div>

        <div class="col-md-12 text-center mt-4">
            <button type="submit" class="btn btn-primary">Submit Application</button>
        </div>
    </form>

</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
