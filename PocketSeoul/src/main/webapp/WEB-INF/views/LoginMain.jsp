<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>포켓 서울</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <!-- favicon -->
    <link href="assets/img/favicon.png" rel=icon>

    <!-- web-fonts -->
    <link href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,500' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
   <!--  <link href="assets/css/bootstrap.min.css" rel="stylesheet"> -->
    <link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet"/> 

    <!-- font-awesome -->
    <!-- <link href="assets/fonts/font-awesome/font-awesome.min.css" rel="stylesheet"> -->
    <link href="${path}/resources/fonts/font-awesome/font-awesome.min.css"" rel="stylesheet"/> 
    <!-- Mobile Menu Style -->
    <link href="assets/css/mobile-menu.css" rel="stylesheet">

    <!-- Owl carousel -->
  <!--   <link href="assets/css/owl.carousel.css" rel="stylesheet"> -->
    <link href="${path}/resources/css/owl.carousel.css"" rel="stylesheet"/> 
<!--     <link href="assets/css/owl.theme.default.min.css" rel="stylesheet"> -->
    <link href="${path}/resources/css/owl.theme.default.min.css"" rel="stylesheet"/> 
    <!-- Theme Style -->
    <link href="${path}/resources/css/stylemain.css" rel="stylesheet"/> 

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar">
<div id="main-wrapper">
<!-- Page Preloader -->
<div id="preloader">
    <div id="status">
        <div class="status-mes"></div>
    </div>
</div>
<!-- preloader -->

<div class="uc-mobile-menu-pusher">
<div class="content-wrapper">
<section id="header_section_wrapper" class="header_section_wrapper">
    <div class="container">
        <div class="header-section">
            <div class="row">
                <div class="col-md-4">
                   
                    <!-- Left Header Section -->
                </div>
                <div class="col-md-4">
                    <div class="logo">
                        <a href="/seoul/">포켓 서울</a>
                    
                    </div>
                    <!-- Logo Section -->
                </div>
                <div class="col-md-4">
                    <div class="right_section">
                        <ul class="nav navbar-nav">                     
                 
                      
                       
                      
                       
                        </ul>
                        <!-- Language Section -->

                        <ul class="nav-cta hidden-xs">
                            <li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle"><i
                                    class="fa fa-search"></i></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <!-- <div class="head-search">
                                            <form role="form">
                                                Input Group
                                                <div class="input-group">
                                                    <input type="text" class="form-control"
                                                           placeholder="Type Something"> <span class="input-group-btn">
                                                                            <button type="submit"
                                                                                    class="btn btn-primary">Search
                                                                            </button>
                                                                        </span></div>
                                            </form>
                                        </div> -->
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <!-- Search Section -->
                    </div>
                    <!-- Right Header Section -->
                </div>
            </div>
        </div>
        <!-- Header Section -->

        <div class="navigation-section">
            <nav class="navbar m-menu navbar-default">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                                data-target="#navbar-collapse-1"><span class="sr-only">Toggle navigation</span> <span
                                class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                        </button>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="#navbar-collapse-1">
                        <ul class="nav navbar-nav main-nav">
                          
                         <!--    <li><a href="category.html">Mobile</a></li> -->
                      	<li>						
						<div class="vc-toggle-container">
         					 <label class="vc-switch">
					            <input type="checkbox" class="vc-switch-input" checked="checked" disabled="disabled">
					            <span class="vc-switch-label" data-on="전체" data-off="전체"></span>
					            <span class="vc-handle"></span>
      					    </label>
      					 </div>
						</li>
						
							<li>						
						<div class="vc-toggle-container">
         					 <label class="vc-switch">
					            <input type="checkbox" class="vc-switch-input" disabled="disabled">
					            <span class="vc-switch-label" data-on="주거" data-off="주거"></span>
					            <span class="vc-handle"></span>
      					    </label>
      					 </div>
						</li>
                      	
                      		<li>						
						<div class="vc-toggle-container">
         					 <label class="vc-switch">
					            <input type="checkbox" class="vc-switch-input" disabled="disabled">
					            <span class="vc-switch-label" data-on="경제" data-off="경제"></span>
					            <span class="vc-handle"></span>
      					    </label>
      					 </div>
						</li>
						
						<li>						
						<div class="vc-toggle-container">
         					 <label class="vc-switch">
					            <input type="checkbox" class="vc-switch-input" disabled="disabled">
					            <span class="vc-switch-label" data-on="문화" data-off="문화"></span>
					            <span class="vc-handle"></span>
      					    </label>
      					 </div>
						</li>
					
						
						
                             <!--     <li class="dropdown m-menu-fw"><a href="#" data-toggle="dropdown" class="dropdown-toggle">사이트
                                <span><i class="fa fa-angle-down"></i></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="m-menu-content">
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">전체</li>
                                                <li><a href="#">청년 몽땅 정보통</a></li>
                                                <li><a href="#">서울시청</a></li>
                                                <li><a href="#">청년정책</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">주거</li>
                                                <li><a href="#">LH 한국주택공사</a></li>
                                                <li><a href="#">SH 서울주택공사</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">문화</li>
                                                <li><a href="#">서울문화포털</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">Widget Haeder</li>
                                                <li><a href="#">Awesome Features</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </li> -->
                        </ul>
                    </div>
                    <!-- .navbar-collapse -->
                </div>
                <!-- .container -->
            </nav>
            <!-- .nav -->
        </div>
        <!-- .navigation-section -->
    </div>
    <!-- .container -->
</section>
<!-- header_section_wrapper -->

<section id="entity_section" class="entity_section">
<div class="container">


</div>
<!-- container -->


<!--   -->




<section id="entity_section" class="entity_section">
<div class="container">
<div class="row">
<div class="col-md-8">
<div class="entity_wrapper">
    <div class="entity_title">
        
    </div>
    <!-- entity_title -->
        <!-- 표 테스트  -->
    
    <div class="container">
                      
                                
                    <div class="row">
                    <div class="col-12">
                        <div class="card">
                           
                              <div class="containers">
									
					<div class="inners">
								<h3 id="bookmarkh3">로그인시, 북마크 기능을 이용하실 수 있습니다.</h3>
								
						<a href="https://kauth.kakao.com/oauth/authorize?client_id=6b5c6363&redirect_uri=http://localhost:8060/seoul/login/kakao-redirect&response_type=code"><img src="${path}/resources/img/kakao.png"></a>
									</div>
								</div>
                              
                              
                              
                        </div>
                    </div>
                </div>

                   </div> 
    
    
    <!-- 표 테스트  -->
    
    

</div>

<!-- navigation -->
</div>
<!-- col-md-8 -->




</div>
<!-- row -->

</div>
<!-- container -->

</section>



</section>


<section id="footer_section" class="footer_section">
  

    <div class="footer_bottom_Section">
        <div class="container">
            <div class="row">
                <div class="footer">
                    <div class="col-sm-3">
                     
                    </div>
                    <div class="col-sm-6">
                        <p>&copy; Copyright 2016-Tech News . Design by: <a href="https://uicookies.com">uiCookies</a> </p>
                    </div>
                    <div class="col-sm-3">
                        <p>moonevi@naver.com</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</div>
<!-- #content-wrapper -->

</div>
<!-- .offcanvas-pusher -->

<a href="#" class="crunchify-top"><i class="fa fa-angle-up" aria-hidden="true"></i></a>


<!-- .uc-mobile-menu -->

</div>
<!-- #main-wrapper -->

<!-- jquery Core-->
<!-- <script src="assets/js/jquery-2.1.4.min.js"></script> -->
<script src="${path}/resources/js/jquery-2.1.4.min.js"></script>



<!-- Bootstrap -->
<!-- <script src="assets/js/bootstrap.min.js"></script> -->
<script src="${path}/resources/js/bootstrap.min.js"></script>
<!-- Theme Menu -->
<script src="assets/js/mobile-menu.js"></script>

<!-- Owl carousel -->
<!-- <script src="assets/js/owl.carousel.min.js"></script> -->
<script src="${path}/resources/js/owl.carousel.min.js"></script>
<!-- Theme Script -->
<!-- <script src="assets/js/script.js"></script> -->
<script src="${path}/resources/js/script.js"></script>
 


</body>



</html>