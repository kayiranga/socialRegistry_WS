<html>
<%@ include file="/WEB-INF/jsp/com/TagLibraries.jsp" %>
<head>
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" />
<style>
body {
	height: 100%;
	margin: 0;
	/* background: url(assets/img/books.jpg); */
	background-size: 1440px 800px;
	background-repeat: no-repeat;
	display: compact;
}
</style>

<script>

function fn_goToSignup() {
    console.log("Redirecting to signup...");
    window.location.href = "${contextPath}signup"
}

function fn_goToProgram() {
    console.log("Redirecting to Program...");
    window.location.href = "${contextPath}program"
}




/* function fn_goToSignup(){	
	    console.log("hello");
		var frm = document.frm_myPageSuplrSearch;			
		frm.action = "<c:url value='/signup'/>";
		frm.submit(); 

	//alert("aimable");
		
	} */

/* function fn_previewTerms(){
	var w=820;
	var h=600;
	var LeftPosition =(screen.width -w)/2;
	var TopPosition =(screen.height -w)/2;
	var openParam = "toolbar=no,menubar=no,resizable=no,scrollbars=yes,copyhistory=no,location=no,z-lock=no, width=" + w + ",height=" + h + ", top=" + TopPosition + ", left=" + LeftPosition;
	var retVal = window.open('','mainPop', openParam);
	var form = document.moveFormTerms;
    form.action = "<c:url value='/ec/cnw/viewTerms.do'/>";
    form.target = "mainPop";
    form.submit();
    retVal.focus();
} */

</script>

</head>
<body>
	<div class="navbar navbar-default">

		<div class="navbar-header">
			<img src="assets/img/logo-header.png" alt="Header Image" style="width: 100%; height: auto;">	
		</div>
	</div>
	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Welcome to MEIS DASHBOARD!</h1>
				<p>To get started, you need to click on those buttons below</p>
			</div>
			<form:form id="frm_myPageSuplrSearch" name="frm_myPageSuplrSearch" modelAttribute="Student" method="GET">
			    <!-- <a class="btn btn-primary" href="signup.html">SOCIAL PROTECTION(SP) » </a>  -->
			    <a class="btn btn-primary" href="javascript:void(0);" onClick="javascript:fn_goToSignup();">SOCIAL PROTECTION(SP) 1»</a> 		
				<a class="btn btn-primary" href="javascript:void(0);" onClick="javascript:fn_goToProgram();" >PROGRAM » </a>
				<a class="btn btn-primary" href="login.html">PROJECT » </a>
				<a class="btn btn-primary" href="login.html">FINANCE » </a>
				
				
			</form:form>	
			 
		</div>

		<div></div>
	</div>
	<script src="jquery-1.8.3.js">
</script>

	<script src="bootstrap/js/bootstrap.js">
</script>

</body>
</html>