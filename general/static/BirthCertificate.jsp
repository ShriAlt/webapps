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
                  <a class="nav-link "  href="JobApplication.jsp">Job Application</a>
                  <a class="nav-link active" href="BirthCertificate.jsp">Birth Certificate</a>
                  <a class="nav-link" href="Passport.jsp">Passport</a>
                  <a class="nav-link" href="DeathCertificate.jsp"> Death Certificate</a>
                  <a class="nav-link" href="DrivingLicense.jsp"> Driving License</a>
                  <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                </div>
              </div>
            </div>
          </nav>
    </header>

    <div class="container mt-5">
        <h2 class="text-center mb-4">Birth Certificate Form</h2>

        <form class="row g-3" action="BirthCertificateServlet" method="post">
            <div class="col-md-6">
                <label for="birthId" class="form-label">Birth ID</label>
                <input type="text" class="form-control" id="birthId" name="birthId" placeholder="Enter Birth ID" required>
            </div>

            <div class="col-md-6">
                <label for="hospitalName" class="form-label">Hospital Name</label>
                <select class="form-select" id="hospitalName" name="hospitalName" required>
                    <option selected disabled>Select Hospital</option>
                    <option value="City Hospital">City Hospital</option>
                    <option value="General Hospital">General Hospital</option>
                    <option value="Private Clinic">Private Clinic</option>
                </select>
            </div>

            <div class="col-md-6">
                <label for="fatherName" class="form-label">Father's Name</label>
                <input type="text" class="form-control" id="fatherName" name="fatherName" placeholder="Enter Father's Name" required>
            </div>

            <div class="col-md-6">
                <label for="motherName" class="form-label">Mother's Name</label>
                <input type="text" class="form-control" id="motherName" name="motherName" placeholder="Enter Mother's Name" required>
            </div>

            <div class="col-md-6">
                <label for="date" class="form-label">Date of Birth</label>
                <input type="date" class="form-control" id="date" name="dateOfBirth" required>
            </div>

            <div class="col-md-6">
                <label for="time" class="form-label">Time of Birth</label>
                <input type="time" class="form-control" id="time" name="timeOfBirth" required>
            </div>

            <div class="col-md-6">
                <label for="doctorName" class="form-label">Doctor's Name</label>
                <input type="text" class="form-control" id="doctorName" name="doctorName" placeholder="Enter Doctor's Name" required>
            </div>

            <div class="col-md-6">
                <label for="nurseName" class="form-label">Nurse's Name</label>
                <input type="text" class="form-control" id="nurseName" name="nurseName" placeholder="Enter Nurse's Name">
            </div>

            <div class="col-md-6">
                <label for="hospitalType" class="form-label">Hospital Type</label>
                <select class="form-select" id="hospitalType" name="hospitalType" required>
                    <option selected disabled>Select Hospital Type</option>
                    <option value="Government">Government</option>
                    <option value="Private">Private</option>
                    <option value="Charitable">Charitable</option>
                </select>
            </div>

            <div class="col-md-12 text-center mt-4">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>


<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
