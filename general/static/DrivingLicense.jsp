<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Driving License Application Form</title>
    
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
                    <a class="nav-link" href="Passport.jsp">Passport</a>
                    <a class="nav-link" href="DeathCertificate.jsp"> Death Certificate</a>
                    <a class="nav-link active" href="DrivingLicense.jsp"> Driving License</a>
                    <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                </div>
              </div>
            </div>
          </nav>
    </header>

<div class="container mt-5">
    <h2 class="text-center mb-4">Driving License Application Form</h2>

    <form class="row g-3" action="DrivingLicenseServlet" method="post">
        <div class="col-md-6">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="name" name="fullName" placeholder="Enter Full Name" required>
        </div>

        <div class="col-md-6">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" id="address" name="address" placeholder="Enter Address" required>
        </div>

        <div class="col-md-6">
            <label for="mobile" class="form-label">Mobile Number</label>
            <input type="tel" class="form-control" id="mobile" name="mobile" placeholder="Enter Mobile Number" required>
        </div>

        <div class="col-md-6">
            <label for="appliedDate" class="form-label">Applied Date</label>
            <input type="date" class="form-control" id="appliedDate" name="appliedDate" required>
        </div>

        <div class="col-md-6">
            <label for="vehicleType" class="form-label">Vehicle Type</label>
            <select class="form-select" id="vehicleType" name="vehicleType" required>
                <option selected disabled>Select Vehicle Type</option>
                <option value="Two-Wheeler">Two-Wheeler</option>
                <option value="Four-Wheeler">Four-Wheeler</option>
                <option value="Heavy Vehicle">Heavy Vehicle</option>
            </select>
        </div>

        <div class="col-md-12 text-center mt-4">
            <button type="submit" class="btn btn-primary">Submit Application</button>
        </div>
    </form>

</div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
