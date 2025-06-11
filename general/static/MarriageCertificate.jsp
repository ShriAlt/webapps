<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Marriage Certificate Form</title>
    
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
                    <a class="nav-link" href="DeathCertificate.jsp"> Death Certificate</a>
                    <a class="nav-link" href="DrivingLicense.jsp"> Driving License</a>
                    <a class="nav-link active" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                </div>
              </div>
            </div>
          </nav>
    </header>
   



 <div class="container mt-5">
    <h2 class="text-center mb-4">Marriage Certificate Form</h2>

     <form class="row g-3" action="MarriageCertificateServlet" method="post">
         <div class="col-md-6">
             <label for="groomName" class="form-label">Groom Name</label>
             <input type="text" class="form-control" id="groomName" name="groomName" placeholder="Enter Groom's Name" required>
         </div>

         <div class="col-md-6">
             <label for="brideName" class="form-label">Bride Name</label>
             <input type="text" class="form-control" id="brideName" name="brideName" placeholder="Enter Bride's Name" required>
         </div>

         <div class="col-md-6">
             <label for="location" class="form-label">Location</label>
             <input type="text" class="form-control" id="location" name="location" placeholder="Enter Location" required>
         </div>

         <div class="col-md-6">
             <label for="address" class="form-label">Address</label>
             <input type="text" class="form-control" id="address" name="address" placeholder="Enter Address" required>
         </div>

         <div class="col-md-6">
             <label for="religion" class="form-label">Religion</label>
             <input type="text" class="form-control" id="religion" name="religion" placeholder="Enter Religion" required>
         </div>

         <div class="col-md-6">
             <label for="date" class="form-label">Marriage Date</label>
             <input type="date" class="form-control" id="date" name="marriageDate" required>
         </div>

         <div class="col-md-6">
             <label for="witness1" class="form-label">Witness 1</label>
             <input type="text" class="form-control" id="witness1" name="witness1" placeholder="Enter First Witness Name" required>
         </div>

         <div class="col-md-6">
             <label for="witness2" class="form-label">Witness 2</label>
             <input type="text" class="form-control" id="witness2" name="witness2" placeholder="Enter Second Witness Name" required>
         </div>

         <div class="col-md-6">
             <label for="officer" class="form-label">Officer Present</label>
             <input type="text" class="form-control" id="officer" name="officerPresent" placeholder="Enter Officer's Name" required>
         </div>

         <div class="col-md-12 text-center mt-4">
             <button type="submit" class="btn btn-primary">Submit</button>
         </div>
     </form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
