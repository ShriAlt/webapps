<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">



    <title>Contact </title>
</head>
<body>
    <div class="container">
        <h1>Contact Page</h1>
    <form action="ContactServlet" >
    <label for="name">Name :</label>
    <input type="text" id="name" name="name" placeholder="Enter your name"><br><br>
    <label for="email">Email :</label>
    <input type="email" id="email" name="email" placeholder="Enter your email"><br><br>
    <label for="phone">Phone :</label>
    <input type="tel" id="phone" name="phone" placeholder="Enter your phone number"><br><br>
    <label for="coments">comments :</label>
    <textarea id="coments" name="coments" placeholder="Enter your comments"></textarea><br><br>
    <button type="submit">contact</button>
    </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>