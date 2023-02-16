<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/9/2023
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PlayList</title>
</head>
<link rel="stylesheet" href="\css\bootstrap.css">
<link rel="stylesheet" href="\themify-icons\themify-icons.css">
<link rel="stylesheet" href="\style.css">
<body>
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
                    <a class="nav-link active text-white" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item mx-3">
                    <a class="nav-link text-white" href="#">Playlist</a>
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
                        <i class="ti-user"></i><a class="nav-link active login text-secondary text-nav"
                                                  aria-current="page" href="#">Login</a>
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
<div class="row" style="margin-top: 56px; height: 100%">
    <div class="col-3 back-ground-grey"></div>
    <div class="col-6 back-ground-grey2 p-0">
        <div class="slideshow-container m-0 " style="height: 500px">
            <div class="mySlides fade1">
                <a href="">
                    <img
                            src="https://www.lofficielvietnam.com/_next/image?url=https%3A%2F%2Fwww.datocms-assets.com%2F56778%2F1671019296-maxresdefault.jpg%3Fauto%3Dformat%252Ccompress%26cs%3Dsrgb&w=3840&q=75"
                            style="width:100%;height: 100%">
                </a>
            </div>
            <div class="mySlides fade1">
                <a href="">
                    <img src="https://s3.cloud.cmctelecom.vn/tinhte2/2020/12/5276686_cover.jpg"
                            style="width:100%;height: 100%">
                </a>
            </div>
            <div class="mySlides fade1">
                <a href="">
                    <img
                            src="https://www.teahub.io/photos/full/276-2764105_adele-hello.jpg"
                            style="width:100%; height: 100%">
                </a>

            </div>
            <a class="prev" onclick="plusSlides(-1)">❮</a>
            <a class="next" onclick="plusSlides(1)">❯</a>
        </div>
        <br>

        <div style="text-align:center">
            <span class="dot" onclick="currentSlide(1)"></span>
            <span class="dot" onclick="currentSlide(2)"></span>
            <span class="dot" onclick="currentSlide(3)"></span>
        </div>
    </div>
    <div class="col-3 back-ground-grey">
        <a href=""><h2 class="text-center text-white mt-4">Top Treding Us-Uk</h2></a>
        <ul class="text-white mt-4">
            <li class="mt-2">
                <i class="ti-control-play "></i> <a href="">Hello - Adele</a>
            </li>
            <li class="mt-2">
                <i class="ti-control-play"></i> <a href="">Dynasty - Miia</a>
            </li>
            <li class="mt-2">
                <i class="ti-control-play"></i> <a href="">LoveLy - Billie Eilish, Khalid</a>
            </li>
            <li class="mt-2">
                <i class="ti-control-play"></i><a href=""></a>
            </li>
            <li>
                <i class="ti-control-play"></i><a href=""></a>
            </li>
            <li>
                <i class="ti-control-play"></i><a href=""></a>
            </li>
            <li>
                <i class="ti-control-play"></i><a href=""></a>
            </li>
            <li>
                <i class="ti-control-play"></i><a href=""></a>
            </li>
        </ul>
    </div>
</div>
<script src="\js\bootstrap.js"></script>
<script>
    let slideIndex = 1;
    showSlides(slideIndex);

    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        let i;
        let slides = document.getElementsByClassName("mySlides");
        let dots = document.getElementsByClassName("dot");
        if (n > slides.length) {
            slideIndex = 1
        }
        if (n < 1) {
            slideIndex = slides.length
        }
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active1", "");
        }
        slides[slideIndex - 1].style.display = "block";
        dots[slideIndex - 1].className += " active1";
    }
</script>
</body>
</html>
