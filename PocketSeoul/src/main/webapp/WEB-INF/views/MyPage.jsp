<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
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
                 			<li><a href="https://kauth.kakao.com/oauth/logout?client_id=6b5cee6e3a93d0c1da8733dc02316363&logout_redirect_uri=http://localhost:8060/seoul/logout">로그아웃</a></li>
						
                        </ul>
                        <!-- Language Section -->

                        <ul class="nav-cta hidden-xs">
                            <!--     <li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle"><i
                                    class="fa fa-search"></i></a>
                                <ul class="dropdown-menu">
                                    <li>
                                    <div class="head-search">
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
					
						
						
                                 <li class="dropdown m-menu-fw"><a href="#" data-toggle="dropdown" class="dropdown-toggle">사이트
                                <span><i class="fa fa-angle-down"></i></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="m-menu-content">
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">전체</li>
                                                <li><a href="https://youth.seoul.go.kr/site/main/home">청년 몽땅 정보통</a></li>
                                                <li><a href="https://www.seoul.go.kr/main/index.jsp">서울시청</a></li>
                                                <li><a href="https://blog.naver.com/we_are_youth">청년정책</a></li>
                                                <li><a href="https://www.youthcenter.go.kr/main.do">온라인청년센터</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">주거</li>
                                                <li><a href="https://www.lh.or.kr/">LH 한국주택공사</a></li>
                                                <li><a href="https://www.i-sh.co.kr/">SH 서울주택공사</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">문화</li>
                                                <li><a href="https://culture.seoul.go.kr/culture/main/main.do">서울문화포털</a></li>
                                            </ul>
                                       
                                        </div>
                                    </li>
                                </ul>
                            </li>
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




<section id="entity_section" class="entity_section">
<div class="container">
<div class="row">
<div class="col-md-8">
<div class="entity_wrapper">
    <div class="entity_title">
        <h1><a href="#" target="_self">나의 북마크 목록</a>
        </h1>
    </div>
    <!-- entity_title -->
    
    <div class="container">
                      
                                
                    <div class="row">
                    <div class="col-12">
                        <div class="card">
                           <!--  <div class="card-body text-center">
                                <h5 class="card-title m-b-0">Static Table With Checkboxes</h5>
                            </div> -->
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead class="thead-light">
                                            <tr>
                                                <th scope="col">북마크</th>
                                                <th scope="col">제목</th>
                                                <th scope="col">작성일</th>
                                                <th scope="col">나에게 전송</th>
											</tr>
                                        </thead>
                                        <tbody class="customtable">
                                  
									 	<c:forEach items="${list}" var="list" varStatus="status">                                        
                                            <tr>
                                                <th>
                                                    <label class="customcheckbox">
                                                        <input type="checkbox" class="listCheckbox" checked="checked" value="${ status.index }" id="form${status.index }">
                                                        <span class="checkmark"></span>
                                                    </label>
                                                </th>
                                                <td><a href="${list.LIST_URL}"  target="_self">${list.LIST_TITLE}</a></td>
                                                <td>${ list.LIST_DATE }</td>
                                                 <td>
                                                 <label class="customcheckbox">
                                                        <input type="checkbox" class="listCheckbox1"  value="${ status.index }" id="send{status.index }">
                                                        <span class="checkmark"></span>
                                                    </label>
                                                 
                                                 </td>
                                               </tr>
                                       </c:forEach> 
                                       </tbody>
                                    </table>
                                </div>
                        </div>
                    </div>
                </div>

                   </div> 
    
    
    <!-- 표 테스트  -->
    
    <!--  -->
    
 
   
    <!--  -->

</div>

 <script>
    if (!Kakao.isInitialized()) {
        window.Kakao.init('b2a4257980333a311008f0a68f50e442');
    };
   
</script>









<!-- navigation -->
</div>
<!-- col-md-8 -->




</div>
<!-- row -->

</div>
<!-- container -->

</section>



</section>
<!-- entity_section -->
 <!--  
<section id="subscribe_section" class="subscribe_section">
    <div class="row">
        <form action="#" method="post" class="form-horizontal">
            <div class="form-group form-group-lg">
                <label class="col-sm-6 control-label" for="formGroupInputLarge">
                    <h1><span class="red-color">Sign up</span> for the latest news</h1>
                </label>

              <div class="col-sm-3">
                    <input type="text" id="subscribe" name="subscribe" class="form-control input-lg">
                </div>
                <div class="col-sm-1">
                    <input type="submit" value="Sign Up" class="btn btn-large pink">
                </div> 
                <div class="col-sm-2"></div>
            </div>
        </form>
    </div>
</section>-->
<!-- Subscriber Section -->

<section id="footer_section" class="footer_section">
   <!--  <div class="container">
        <hr class="footer-top">
        <div class="row">
            <div class="col-md-3">
                <div class="footer_widget_title"><h3><a href="category.html" target="_self">About Tech</a></h3></div>
                <div class="logo footer-logo">
                    <a title="fontanero" href="index.html">
                        <img src="assets/img/tech_about.jpg" alt="technews">
                    </a>

                    <p>Competently conceptualize go forward testing procedures and B2B expertise. Phosfluorescently
                        cultivate principle-centered methods.of empowerment through fully researched.</p>
                </div>
            </div>
            <div class="col-md-3">
                <div class="footer_widget_title">
                    <h3><a href="category.html" target="_self">Discover</a></h3>
                </div>
                <div class="row">
                    <div class="col-xs-4">
                 
                    </div>
                    <div class="col-xs-8">
                      
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="footer_widget_title">
                    <h3><a href="#" target="_self">Editor Picks</a></h3>
                </div>
                <div class="media">
                    <div class="media-left">
                        <a href="#"><img class="media-object" src="assets/img/editor_pic1.jpg"
                                         alt="Generic placeholder image"></a>
                    </div>
                    <div class="media-body">
                       
                        
                    </div>
                </div>
                <div class="media">
                    <div class="media-left">
                        <a href="#"><img class="media-object" src="assets/img/editor_pic2.jpg"
                                         alt="Generic placeholder image"></a>
                    </div>
                    <div class="media-body">
                        <h3 class="media-heading">
                            <a href="single.html">Apple launches photo-centric wrist watch for Android</a>
                        </h3> 
                        <span class="rating">
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star-half-full"></i> 
                        </span>
                    </div>
                </div>
                <div class="media">
                    <div class="media-left">
                        <a href="#"><img class="media-object" src="assets/img/editor_pic3.jpg"
                                         alt="Generic placeholder image"></a>
                    </div>
                    <div class="media-body">
                        <h3 class="media-heading">
                            <a href="single.html">Apple launches photo-centric wrist watch for Android</a>
                        </h3> 
                        <span class="rating">
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star"></i> 
                            <i class="fa fa-star-half-full"></i> 
                        </span>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="footer_widget_title">
                    <h3><a href="category.html" target="_self">Tech Photos</a></h3>
                </div>
   
            </div>
        </div>
    </div> -->

    <div class="footer_bottom_Section">
        <div class="container">
            <div class="row">
                <div class="footer">
                    <div class="col-sm-3">
                       <!--  <div class="social">
                            <a class="icons-sm fb-ic"><i class="fa fa-facebook"></i></a>
                            Twitter
                            <a class="icons-sm tw-ic"><i class="fa fa-twitter"></i></a>
                            Google +
                            <a class="icons-sm inst-ic"><i class="fa fa-instagram"> </i></a>
                            Linkedin
                            <a class="icons-sm tmb-ic"><i class="fa fa-tumblr"> </i></a>
                            Pinterest
                            <a class="icons-sm rss-ic"><i class="fa fa-rss"> </i></a>
                        </div> -->
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

<!-- <div class="uc-mobile-menu uc-mobile-menu-effect">
    <button type="button" class="close" aria-hidden="true" data-toggle="offcanvas"
            id="uc-mobile-menu-close-btn">&times;</button>
    <div>
        <div>
            <ul id="menu">
                <li class="active"><a href="blog.html">News</a></li>
                <li><a href="category.html">Mobile</a></li>
                <li><a href="blog.html">Tablet</a></li>
                <li><a href="category.html">Gadgets</a></li>
                <li><a href="blog.html">Camera</a></li>
                <li><a href="category.html">Design</a></li>
                <li class="dropdown m-menu-fw"><a href="#" data-toggle="dropdown" class="dropdown-toggle">More
                    <span><i class="fa fa-angle-down"></i></span></a>
                   
                </li>
            </ul>
        </div>
    </div>
</div> -->
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

<script>



$(".listCheckbox1").change(function() {   
	// 삭제
    alert("나에게 메시지 전송 중입니다.");   
    var index = $(this).val();   
 
    
    $.ajax({
		url : "message",
		type : "post",
		data : {"index" : index },
		dataType : 'json',
		success : function(data){
			if (data == 1){
				alert("메세지가 전송되었습니다!");
				location.href="/seoul/mypage";
			}else{
				alert("메세지 전송에 오류가 있습니다.");
			}
		},
		
		error : function(){ alert("메세지 전송에 오류가 발생했습니다."); }
	}) /* ajax */
    
});

</script>

<script>


$(".listCheckbox").change(function() {   
	// 삭제
    alert("북마크를 삭제 중입니다.");   
    var index = $(this).val();   
 
    
    $.ajax({
		url : "deletemark",
		type : "get",
		data : {"index" : index },
		dataType : 'json',
		success : function(data){
			if (data == 1){
				alert("북마크가 삭제되었습니다!");
				location.href="/seoul/mypage";
			}else{
				alert("북마크가 정상적으로 삭제되지 않았습니다.");
			}
		},
		
		error : function(){ alert("북마크 삭제에 오류가 발생했습니다."); }
	}) /* ajax */
    
});


</script>

</html>