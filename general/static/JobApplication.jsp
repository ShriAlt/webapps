<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Application Form</title>
    
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
                  <a class="nav-link active" aria-current="page" href="JobApplication.jsp">Job Application</a>
                  <a class="nav-link" href="BirthCertificate.jsp">Birth Certificate</a>
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
    <h2 class="text-center mb-4">Job Application Form</h2>

    <form class="row g-3" action="JobApplicationServlet" method="post">
        <div class="col-md-6">
            <label for="name" class="form-label">Full Name</label> <span style="color: red">${result}</span>
            <input type="text" class="form-control" id="name" name="fullName" placeholder="Enter Full Name"  value="${jobApplicationDTO.fullName}" required >
        </div>

        <div class="col-md-6">
            <label for="email" class="form-label">Email Address</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter Email"  value="${jobApplicationDTO.email}" required  >
        </div>

        <div class="col-md-6">
            <label for="education" class="form-label">Education</label>
            <select class="form-select" id="education" name="education" required>
                <option selected disabled>Select Education Level</option>
                <option value="High School">High School</option>
                <option value="Diploma">Diploma</option>
                <option value="Bachelor's Degree">Bachelor's Degree</option>
                <option value="Master's Degree">Master's Degree</option>
                <option value="Doctorate">Doctorate</option>
            </select>
        </div>

        <div class="col-md-6">
            <label for="skills" class="form-label">Skills</label>
            <input type="text" class="form-control" id="skills" name="skills" placeholder="Enter Skills" required>
        </div>

        <div class="col-md-6">
            <label for="expectedSalary" class="form-label">Expected Salary</label>
            <input type="text" class="form-control" id="expectedSalary" name="expectedSalary" placeholder="Enter Expected Salary" required>
        </div>

        <div class="col-md-6">
            <label for="experience" class="form-label">Experience</label>
            <select class="form-select" id="experience" name="experience" required>
                <option selected disabled>Select Experience Level</option>
                <option value="Fresher">Fresher</option>
                <option value="1-2 Years">1-2 Years</option>
                <option value="3-5 Years">3-5 Years</option>
                <option value="6+ Years">6+ Years</option>
            </select>
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
