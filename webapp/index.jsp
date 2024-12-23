

<%@page import="com.thesquad.utils.HtmlObj"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library com.thesquad - By EdsonPaulo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/css/bootstrap.min.css"/>         
        <link rel="stylesheet" href="./assets/css/styles.css"/> 
        <script src="./assets/js/jquery-3.4.1.min.js" ></script>
        <script src="./assets/js/popper.min.js" ></script>
        <script src="./assets/js/bootstrap.min.js"></script>
        
    </head>

    <body>
        

    <div class="navbar px-5 ">
        <div class="nav-logo ">
            Library Management System
        </div>
        <div>

            
        
            <div class="btn-group">
                <button type="button" class="btn  text-left" data-toggle="dropdown">
                    People
                </button>
                <div class="dropdown-menu  ">
                    <a class="dropdown-item " href="/library-management-system/person/list.jsp">List People</a>
                    <a class="dropdown-item " href="/library-management-system/person/new.jsp">Add Person</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Reader</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Readers</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Reader</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Author</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Authors</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Author</a>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn   text-left" data-toggle="dropdown">
                    Publishers
                </button>
                <div class="dropdown-menu ">
                    <a class="dropdown-item " href="/library-management-system/publisher/list.jsp">List Publishers</a>
                    <a class="dropdown-item " href="/library-management-system/publisher/new.jsp">Add Publisher</a>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn   text-left" data-toggle="dropdown">
                    Books
                </button>
                <div class="dropdown-menu ">
                    <a class="dropdown-item " href="/library-management-system/book/list.jsp">List Books</a>
                    <a class="dropdown-item " href="/library-management-system/book/new.jsp">Add Book</a>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn   text-left" data-toggle="dropdown">
                    Borrowing
                </button>
                <div class="dropdown-menu ">
                    <a class="dropdown-item " href="/library-management-system/book-request/list.jsp">List Requests</a>
                    <a class="dropdown-item " href="/library-management-system/book-request/new.jsp">Add Request</a>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn   text-left" data-toggle="dropdown">
                    Genre
                </button>
                <div class="dropdown-menu ">
                    <a class="dropdown-item " href="/library-management-system/#">List Genres</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Genre</a>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn   text-left" data-toggle="dropdown">
                    Address
                </button>
                <div class="dropdown-menu  ">
                    <h6 class="dropdown-header">Country</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Countries</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Country</a>
        
                    <h6 class="dropdown-header">Province</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Provinces</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Province</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Municipality</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Municipalities</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Municipality</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Commune</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Communes</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Commune</a>
                    <div class="dropdown-divider"></div>
                </div>
            </div>
        
            <div class="btn-group">
                <button type="button" class="btn  text-left" data-toggle="dropdown">
                    Book (Attributes)
                </button>
                <div class="dropdown-menu ">
                    <h6 class="dropdown-header">Category</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Categories</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Categories</a>
        
                    <h6 class="dropdown-header">Status</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Statuses</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Status</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Classification</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Classifications</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Classification</a>
                    <div class="dropdown-divider"></div>
        
                    <h6 class="dropdown-header">Descriptors</h6>
                    <a class="dropdown-item " href="/library-management-system/#">List Descriptors</a>
                    <a class="dropdown-item " href="/library-management-system/#">Add Descriptors</a>
                </div>
            </div>
        </div>
    </div>
    

    <div class="hero">
        <div class="hero-m">
            <div class="hero-content">
                <h1 class="hero-title">
                    Smart Library Solutions
                    for a Brighter Future
                </h1>
                <p class="hero-des">Effortless library operations due to automated cataloging, lending </br> and tracking can nowadays make resource management easier for </br> librarians and users alike.</p>
                <div>
                    <button class="hero-btn">
                        Get Started
                    </button>
                </div>
            </div>
            <div class="hero-img-container">
                <svg class="hero-blob" viewBox="0 0 200 200" xmlns="http://www.w3.org/2000/svg">
                    <path fill="#FF0066" d="M46,-71.5C58.4,-63.5,66.4,-48.8,71.6,-33.8C76.8,-18.8,79.2,-3.5,78.8,12.5C78.3,28.6,75.2,45.5,65.2,55.9C55.3,66.3,38.5,70.1,21.8,75.5C5.1,81,-11.4,88.2,-27.4,86.6C-43.4,85,-58.9,74.7,-70.1,61.1C-81.4,47.5,-88.4,30.6,-89.1,13.9C-89.9,-2.8,-84.3,-19.4,-75.9,-33.4C-67.5,-47.3,-56.3,-58.7,-43.1,-66.3C-30,-73.9,-15,-77.8,0.9,-79.2C16.8,-80.6,33.5,-79.4,46,-71.5Z" transform="translate(100 100)" />
                  </svg>
                <img class="hero-img" src="./assets/womanImg.png" alt="">
    
            </div>
        </div>
        <div>
            <h2>Welcome to Library Management System</h2>
        </div>
    </div>

    <div class="p-2-container">

    
    <div class="container card my-5 p-5">
        <div class="row">
            <div class="col m-3"><a href="/library-management-system/person/list.jsp" class="h2 d-flex border rounded btn btn-light p-2 justify-content-center align-items-center" style="width: 100%; height: 150px" > <h4>Persons</h4></a></div>

            <div class="col m-3"><a href="/library-management-system/publisher/list.jsp" class="h2 d-flex border rounded btn btn-light p-2 justify-content-center align-items-center" style="width: 100%; height: 150px" > <h4>Publishers</h4></a></div>

            <div class="col m-3"><a href="/library-management-system/book/list.jsp" class="h2 d-flex border rounded btn btn-light p-2 justify-content-center align-items-center" style="width: 100%; height: 150px" > <h4>Books</h4></a></div>
        </div>
        <div class="row">
            <div class="col m-3"><a href="/library-management-system/book-request/list.jsp" class="h2 d-flex border rounded btn btn-light p-2 justify-content-center align-items-center" style="width: 100%; height: 150px" > <h4>Book Requests</h4></a></div>
        
            <div class="col m-3"><a href="/library-management-system/defense/form.jsp" class="h2 d-flex border rounded btn btn-light p-2 justify-content-center align-items-center" style="width: 100%; height: 150px" > <h4>Defense (Form)</h4></a></div>
        </div>
    </div>
</div>
</div>

</body>
</html>
