<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <title>index</title>
</head>
<body>
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
                <a class="nav-link" href="MarriageCertificate.jsp"> Marriage Certificate</a>
                <a class="nav-link" href="JobApplicationSearch.jsp"> Search Job</a>

            </div>
        </div>
    </div>
</nav>

<div class="container text-center">
    <h2><strong> Search for jobs </strong></h2>
    <span>${error}</span>
    <form action="BirthCertificateServlet" method="get">
        jobs : <input type="search" name="id">
        <button type="submit">search</button>
    </form>

    <h2>Details on id ${dto.id}</h2>

      birthId :${dto.birthId}<br>
    hospitalName:${dto.hospitalName}<br>
    fatherName:${dto.fatherName}<br>
     motherName:${dto.motherName}<br>
     dateOfBirth:${dto.dateOfBirth}<br>
   timeOfBirth:${dto.timeOfBirth}<br>
    doctorName:${dto.doctorName}<br>
    nurseName:${dto.nurseName}<br>
     hospitalType:${dto.hospitalType}<br>

</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>