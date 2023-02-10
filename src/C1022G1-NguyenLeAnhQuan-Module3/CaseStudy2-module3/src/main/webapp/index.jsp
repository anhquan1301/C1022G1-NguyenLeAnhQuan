<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 09/02/2023
  Time: 10:24 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="\css\bootstrap.css">
  <link rel="stylesheet" href="\themify-icons\themify-icons.css">
  <link rel="stylesheet" href="\case_study2.css">
  <title>$Title$</title>
</head>
<body>
<!--header-->
<nav class="navbar navbar-expand-lg bg-dark fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand ms-4" href="#">
      <img src="\picture\tải_xuống-removebg-preview.png" width="23px" height="23px" alt="">
    </a>
    <a class="navbar-brand me-4 text-white" href="#">Group 4</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item mx-3">
          <a class="nav-link active text-white" aria-current="page" href="\home.jsp">Home</a>
        </li>
        <li class="nav-item mx-3">
          <a class="nav-link text-white" href="\playlist.jsp">Playlist</a>
        </li>
        <li class="nav-item mx-3">
          <a class="nav-link text-white" href="#">Podcast</a>
        </li>
        <li class="nav-item mx-3">
          <a class="nav-link text-white" href="#">Artist</a>
        </li>
        <li class="nav-item mx-3">
          <a class="nav-link text-white" href="#">Album</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-5 rounded-pill" style="padding-left: 40px" type="search" placeholder="Search Music"
               aria-label="Search"><i class="ti-search"></i>
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item me-4">
            <a class="nav-link active text-secondary help" aria-current="page" href="#">Help</a>
          </li>
          <li class="nav-item me-3">
            <div class="column-menu"></div>
          </li>
          <li class="nav-item mx-2">
            <i class="ti-user"></i><a class="nav-link active login text-secondary text-nav" aria-current="page" href="#">Login</a>
          </li>
          <li class="nav-item me-5">
            <a class="nav-link active register rounded-pill text-black bg-white" aria-current="page"
               href="#">Register</a>
          </li>
        </ul>
      </form>
    </div>
  </div>
</nav>


<!--main-->
<div class="row">
  <div class="col-12">
    <img src="\picture\guitar_wood_instrument_strings_music-1206457.jpg" height="760px" width="100%" alt="">
    <div class="row">
      <div class="col-4"><h1>Welcome to Group 4</h1></div>
    </div>
  </div>
</div>
<script src="\js\bootstrap.js"></script>

</body>
</html>