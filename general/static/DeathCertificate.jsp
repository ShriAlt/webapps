<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Death Certificate Form</title>
    
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
                  <a class="nav-link " href="BirthCertificate.jsp">Birth Certificate</a>
                  <a class="nav-link" href="Passport.jsp">Passport</a>
                  <a class="nav-link active" href="DeathCertificate.jsp"> Death Certificate</a>
                  <a class="nav-link" href="DrivingLicense.jsp"> Driving License</a>
                  <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                </div>
              </div>
            </div>
          </nav>
    </header>

<div class="container mt-5">
    <h2 class="text-center mb-4">Death Certificate Form</h2>

    <form class="row g-3" action="DeathCertificateServlet" method="post">
        <div class="col-md-6">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="name" name="fullName" placeholder="Enter Full Name" required>
        </div>

        <div class="col-md-6">
            <label for="cause" class="form-label">Cause of Death</label>
            <input type="text" class="form-control" id="cause" name="causeOfDeath" placeholder="Enter Cause of Death" required>
        </div>

        <div class="col-md-6">
            <label for="date" class="form-label">Date of Death</label>
            <input type="date" class="form-control" id="date" name="dateOfDeath" required>
        </div>

        <div class="col-md-6">
            <label for="time" class="form-label">Time of Death</label>
            <input type="time" class="form-control" id="time" name="timeOfDeath" required>
        </div>

        <div class="col-md-6">
            <label for="age" class="form-label">Age at Death</label>
            <input type="number" class="form-control" id="age" name="ageAtDeath" placeholder="Enter Age" required>
        </div>

        <div class="col-md-6">
            <label for="certifiedBy" class="form-label">Certified By</label>
            <input type="text" class="form-control" id="certifiedBy" name="certifiedBy" placeholder="Enter Certifying Authority" required>
        </div>

        <div class="col-md-6">
            <label for="hospital" class="form-label">Hospital Name</label>
            <input type="text" class="form-control" id="hospital" name="hospitalName" placeholder="Enter Hospital Name" required>
        </div>

        <div class="col-md-6">
            <label for="manner" class="form-label">Manner of Death</label>
            <select class="form-select" id="manner" name="mannerOfDeath" required>
                <option selected disabled>Select Manner of Death</option>
                <option value="Natural">Natural</option>
                <option value="Accident">Accident</option>
                <option value="Homicide">Homicide</option>
                <option value="Suicide">Suicide</option>
                <option value="Unknown">Unknown</option>
            </select>
        </div>

        <div class="col-md-6">
            <label for="gender" class="form-label">Gender</label>
            <select class="form-select" id="gender" name="gender" required>
                <option selected disabled>Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>

        <div class="col-md-6">
            <label for="marks" class="form-label">Identifying Marks</label>
            <input type="text" class="form-control" id="marks" name="identifyingMarks" placeholder="Enter Identifying Marks">
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
