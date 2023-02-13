<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/13/2023
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%--register--%>
<form action="">
    <div class="row my-5" style="height: 720px; max-width: 450px; margin: 0 auto">
        <div class="col-12">
            <div class="row">
                <div class="col-12 pt-5 d-flex justify-content-center">
                    <i class="ti-music-alt"></i>
                    <a class="navbar-brand me-4 text-dark fs-1 fw-bold" href="#">Group 4</a>
                </div>
            </div>
            <div class="row">
                <div class="col-12 pt-2 d-flex justify-content-center">
                    <p class="text-dark fs-2 pt-0">Sign up to listen for free</p>
                </div>
            </div>
            <form action="">
                <div class="row my-4">
                    <div class="col-12">
                        <div class="mb-2">
                            <label class="fw-semibold">Your email?</label>
                        </div>
                        <input class="ps-2" style="inline-size: 100%; height: 45px; line-height: 45px" type="text" name="email" id="email" placeholder="Input your email.">
                    </div>
                </div>
                <div class="row my-4">
                    <div class="col-12">
                        <div class="mb-2">
                            <label class="fw-semibold">Create your password.</label>
                        </div>
                        <input class="ps-2" style="inline-size: 100%; height: 45px; line-height: 45px" type="password" name="password" id="password" placeholder="Create your password.">
                    </div>
                </div>
                <div class="row my-4">
                    <div class="col-12">
                        <div class="mb-2">
                            <label class="fw-semibold">Input your password again.</label>
                        </div>
                        <input class="ps-2" style="inline-size: 100%; height: 45px; line-height: 45px" type="password" name="password2" id="password2" placeholder="Input your password again.">
                    </div>
                </div>
                <div class="row my-4">
                    <div class="col-12">
                        <div class="mb-2">
                            <label class="fw-semibold">Your name?</label>
                        </div>
                        <input class="ps-2" style="inline-size: 100%; height: 45px; line-height: 45px" type="text" name="your-name" id="your-name" placeholder="Input your name.">
                    </div>
                </div>
                <div class="row my-4">
                    <div class="col-12">
                        <div class="pb-1">
                            <label class="fw-semibold">Gender?</label>
                        </div>
                        <div class="d-flex ps-3">
                            <div class="me-5"><input class="me-3" name="gender" type="radio">Male</div>
                            <div class="me-5"><input class="me-3" name="gender" type="radio">Female</div>
                            <div class="me-5"><input class="me-3" name="gender" type="radio">Diffenrent</div></div>
                    </div>
                </div>
                <div class="row pt-3 pb-5">
                    <div class="col-12 d-flex justify-content-center">
                        <button class="border-0 rounded-pill" style="height: 40px; width: 90px; background-color: #23ee23" type="submit">Register</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</form>
</body>
</html>
