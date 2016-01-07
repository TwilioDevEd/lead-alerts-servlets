<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lead Alerts</title>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="css/site.css" rel="stylesheet">
</head>
<body>
    <div id="main" class="container">
        <core:if test="${not empty success}">
            <div class="alert alert-success" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                ${success}
            </div>
        </core:if>
        <core:if test="${not empty error}">
            <div class="alert alert-danger" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                ${error}
            </div>
        </core:if>
        <div class="row">
            <div class="col-sm-8">
                <h1>${houseTitle}</h1>
                <h3>${housePrice}</h3>
                <img src="images/house.jpg" alt="House" />
                <p>${houseDescription}</p>
            </div>
            <div class="col-sm-2 demo">
                <h4>Talk To An Agent</h4>
                <p>
                    A trained real estate professional is standing by to answer any
                    questions you might have about this property. Fill out the form below
                    with your contact information, and an agent will reach out soon.
                </p>
                <form action="/notifications" method="POST">
                    <input type="hidden" name="houseTitle" value="${houseTitle}" />
                    <div class="form-group">
                        <label for="name">Your Name</label>
                        <input type="text" id="name" name="name" class="form-control" placeholder="John Appleseed" />
                    </div>
                    <div class="form-group">
                        <label for="phone">Your Phone Number</label>
                        <input type="text" id="phone" name="phone" class="form-control" placeholder="+16512229988" />
                    </div>
                    <div class="form-group">
                        <label for="message">How can we help?</label>
                        <input type="text" id="message" name="message" class="form-control" />
                    </div>
                    <button type="submit" class="btn btn-primary">Request Info</button>
                </form>
            </div>
        </div>
    </div>
    <footer class="container">
        Made with <i class="fa fa-heart"></i> by your pals <a href="http://www.twilio.com">@twilio</a>.
    </footer>
    <script src="//code.jquery.com/jquery-2.1.4.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
