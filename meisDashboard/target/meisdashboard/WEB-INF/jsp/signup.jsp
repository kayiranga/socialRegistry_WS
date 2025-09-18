<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ include file="/WEB-INF/jsp/com/TagLibraries.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Social Protection(sp)</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="datepicker/css/datepicker.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

<style>
.green {
	font-weight: bold;
	color: green;
}
.message {
	margin-bottom: 10px;
}
.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

.mb10 { margin-bottom:10px !important}
.mb20 { margin-bottom:20px}
/* article table*/
.article_table { }
.article_table th, .article_table td{padding:6px 10px;word-wrap:break-word;}
.article_table tr:hover{background: #fffdea;transition: all 0.1s ease-in-out;}

/* form table*/	
.article_table {}
.article_table thead th{background:#eee;text-align:center; color:#666; border:1px solid #d0d2d2;}
.article_table tbody th{background:#f7f7f7; }
.article_table td{background:#fff; height:24px;border:1px solid #d0d2d2;}
.important{display:inline-block;width:9px;height:8px;color:#F60;}



</style>
<script type="text/javaScript">
this.window.name='main';
function fn_Search(){

	console.log("start search");
	
	var form = document.dashboardFilterForm;
	
	form.action = "${contextPath}signup";
	form.target = "main";
	form.submit();
}


</script>

</head>
<body>

	<div class="navbar navbar-default">
		

		<div class="navbar-header">
			<img src="assets/img/logo-header.png" alt="Header Image" style="width: 100%; height: auto;">	
		</div>

		
	</div>

	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<script src="datepicker/js/bootstrap-datepicker.js">
		
	</script>

	<c:if test="${not empty message}">
		<div class="message green">${message}</div>
	</c:if>

	<div class="col-lg-6 col-lg-offset-3">
	
	
	
	<!-- Filter Bar (District Name + Fiscal year) -->
	<form:form id="dashboardFilterForm" name="dashboardFilterForm" method="get" action="signup" modelAttribute="student">
		<div class="container" style="margin-top: 15px; margin-bottom: 15px; text-align: center;width:100% " >
			<div class="row" style="background: #fff8dc; border: 1px solid #f0e0a0; padding: 15px; border-radius: 4px;">
				<div class="col-md-8">
					<div class="form-group">
					    <label for="districtName">District Name</label>
					    <form:select path="districtNo" class="form-control" id="districtNo"  placeholder="Enter district name">
							
							<form:option value="0" >All</form:option>
							<form:option value="1">NYARUGENGE</form:option>
							<form:option value="2">GASABO</form:option>
							<form:option value="3">KICUKIRO</form:option>
							<form:option value="4">NYANZA</form:option>
							<form:option value="5">GISAGARA</form:option>
							<form:option value="6">NYARUGURU</form:option>
							<form:option value="7" >HUYE</form:option>
							<form:option value="8">NYAMAGABE</form:option>
							<form:option value="9">RUHANGO</form:option>
							<form:option value="10" >MUHANGA</form:option>
							<form:option value="11">KAMONYI</form:option>
							<form:option value="12">KARONGI</form:option>
							<form:option value="13" >RUTSIRO</form:option>
							<form:option value="14">RUBAVU</form:option>
							<form:option value="15">NYABIHU</form:option>
							<form:option value="16" >NGORORERO</form:option>
							<form:option value="17">RUSIZI</form:option>
							<form:option value="18">NYAMASHEKE</form:option>
							<form:option value="19" >RULINDO</form:option>
							<form:option value="20">GAKENKE</form:option>
							<form:option value="21">MUSANZE</form:option>
							<form:option value="22" >BURERA</form:option>
							<form:option value="23">GICUMBI</form:option>
							<form:option value="24">RWAMAGANA</form:option>
							<form:option value="25" >NYAGATARE</form:option>
							<form:option value="26">GATSIBO</form:option>
							<form:option value="27">KAYONZA</form:option>
							<form:option value="28" >KIREHE</form:option>
							<form:option value="29">NGOMA</form:option>
							<form:option value="30">BUGESERA</form:option>
						</form:select>
					    
					   <%--  <input type="text" class="form-control" id="districtName" name="districtName" placeholder="Enter district name" value="${empty param.districtName ? selectedDistrictName : param.districtName}"> --%>
					</div>
					<div class="form-group">
						<label for="fiscYr">Fiscal year</label>
						<form:select path="fiscYr" class="form-control" id="fiscYr" >
							<form:option value="0">All</form:option>
							<form:option value="19">2025-2026</form:option>
							<form:option value="18">2024-2025</form:option>
							<form:option value="16">2023-2024</form:option>
							<form:option value="15" >2022-2023</form:option>
						</form:select>
					</div>
				</div>
				<div class="col-md-4" style="display: flex; align-items: center; justify-content: flex-end;">
					<!-- <button type="submit" class="btn btn-warning btn-lg" id="searchButton" style="padding: 10px 20px;">
						<span class="glyphicon glyphicon-search"></span> Search
					</button> -->
					<a href="javascript:void(0)" class="btn btn-warning btn-lg" id="searchButton" style="padding: 10px 20px;" onclick="javascript:fn_Search();">
					<span class="glyphicon glyphicon-search"></span>Search</a>
					
				</div>
			</div>
		</div>
	</form:form>
		
		
		<!-- Key Performance indication in cPW -->	
 			<form:form name="frm_myPagePe" modelAttribute="ECCSPMyPageVO" method="post">
 			
				 <div class="titlealign">			
       				<h4>1. CLASSIC PUBLIC WORKS</h4>
				</div>
 				
 				<p class="list_L">A. Key Performance indicators in cPW</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>cPW Indicators</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">Number of sectors covered</td> 		
							<td class="tC">${indicatorsCPW.numberOfSectorsCovered}</td> 		
						</tr>
						<tr>
							<td class="tC">Working days per HH</td> 		
							<td class="tC">${indicatorsCPW.allWDays}</td> 		
						</tr>
						<tr>
							<td class="tC">Working days per HH headed by Male</td> 		
							<td class="tC">${indicatorsCPW.maleAllWDays}</td> 		
						</tr>
						<tr>
							<td class="tC">Working days per HH headed by Female</td> 		
							<td class="tC">${indicatorsCPW.femaleAllWDays}</td> 		
						</tr>
						<tr>
							<td class="tC">Total HHs employed</td> 		
							<td class="tC">${indicatorsCPW.totalCount}</td> 		
						</tr>
						<tr>
							<td class="tC">Female-headed HHs</td> 		
							<td class="tC">${indicatorsCPW.femaleCount}</td> 		
						</tr>
						<tr>
							<td class="tC">Male headed HHs</td> 		
							<td class="tC">${indicatorsCPW.maleCount}</td> 		
						</tr>
						<tr>
							<td class="tC">Share of climate-smart cPW projects as a proportion of all cPW projects</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Timeliness of payment</td> 		
							<td class="tC"></td> 		
						</tr>															
					</tbody>
				</table>
				
				<!-- b.	CPW recipients per districts  -->	
				<br>
 				<p class="list_L">B. CPW recipients per districts </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Male Headed HH</th>
							<th>Female Headed HH</th>
							<th>Total recipients</th>
							<th>Amount paid to female</th>
							<th>Amount paid to male</th>
							<th>Total Amount</th>
							
						</tr>
					</thead>
					<tbody>	
					<c:choose>
					<c:when test="${totlistOfDistricts > 0 }">		
					<c:forEach items="${listOfDistricts}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.totalPaidByMale }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByAll }</td> 		
						</tr>
					</c:forEach>
					 <tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="7" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
																	
					</tbody>
				</table>
				<br>
				<!-- c.	HHs participating in cPW by project type  -->	
				
 				<p class="list_L">C. HHs participating in cPW by project type </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>Type of projects </th>
							<th>Female Headed HH</th>
							<th>Female Headed HH</th>
							<th>Total HH</th>
							
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">Progressive terraces </td> 		
							<td class="tC">${listOfPWProjType.maleCountPT }</td>
							<td class="tC">${listOfPWProjType.femaleCountPT }</td> 		
							<td class="tC">${listOfPWProjType.totalCountPT }</td>
									
						</tr>
						<tr>
							<td class="tC">Radical terraces </td> 		
							<td class="tC">${listOfPWProjType.maleCountRT }</td>
							<td class="tC">${listOfPWProjType.femaleCountRT }</td> 		
							<td class="tC">${listOfPWProjType.totalCountRT }</td>
								
						</tr>
							<tr>
							<td class="tC">Road rehabilitation and tree plantation </td> 		
							<td class="tC">${listOfPWProjType.maleCountRR }</td>
							<td class="tC">${listOfPWProjType.femaleCountRR }</td> 		
							<td class="tC">${listOfPWProjType.totalCountRR}</td>
								
						</tr>
								
						
						<tr>
							<td class="tC">River Gully Protection</td> 		
							<td class="tC">${listOfPWProjType.maleCountRG }</td>
							<td class="tC">${listOfPWProjType.femaleCountRG }</td> 		
							<td class="tC">${listOfPWProjType.totalCountRG }</td>
								
						</tr>
								
						
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
								
						</tr>
						
																	
					</tbody>
				</table>
				
				<br>
				<!-- d.	Number Households benefiting from Climate-sensitive Public Works  -->	
				
 				<p class="list_L">D. Number Households benefiting from Climate-sensitive Public Works</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">							
					</colgroup>
					<thead>
						 <tr>				
							<th rowspan="2">District</th>
							<th colspan="3">Direct benefited</th>
							<th colspan="3">Indirect benefited</th>		
						</tr>
					
						<tr>				
							
							<th>Male Headed HH</th>
							<th>Female Headed HH</th>
							<th>Total HH</th>
							<th>Male Headed HH</th>
							<th>Female Headed HH</th>
							<th>Total HH</th>
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistricts > 0 }">
					<c:forEach items="${listOfDistricts}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">-</td> 		
							<td class="tC">-</td>
							<td class="tC">-</td> 		
						</tr>
					</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="7" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
																	
					</tbody>
				</table>
				
				<br><br>
				
				 <div class="titlealign">			
       				<h4>2. EXPANDED PUBLIC WORKS (ePW)</h4>
				</div>
 				
 				<p class="list_L">A. Expended Public Works Key Performance Indicators</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>cPW Indicators</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">Number of sectors covered</td> 		
							<td class="tC">${indicatorsEPW.numberOfSectorsCovered}</td> 		
						</tr>
						<tr>
							<td class="tC">Average working months per HH</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Average amount paid per HH</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Female-headed HHs</td> 		
							<td class="tC">${indicatorsEPW.femaleCount}</td> 		
						</tr>
						<tr>
							<td class="tC">Male headed HHs</td> 		
							<td class="tC">${indicatorsEPW.maleCount}</td> 		
						</tr>
						<tr>
							<td class="tC">Total HHs employed</td> 		
							<td class="tC">${indicatorsEPW.totalCount}</td> 		
						</tr>
						
						<tr>
							<td class="tC">Total amount paid to recipients</td> 		
							<td class="tC">${indicatorsEPW.totalPaidByAll}</td> 		
						</tr>
						<tr>
							<td class="tC">Average wage rate</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Timely Payment</td> 		
							<td class="tC"></td> 		
						</tr>															
					</tbody>
				</table>
				<br>
				<!-- b.	Number of beneficiaries participated in ePW (LB and HBECD) and amount paid by District -->	
				
 				<p class="list_L">B. Number of beneficiaries participated in ePW (LB) and amount paid by District </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Male Headed HH</th>
							<th>Female Headed HH</th>
							<th>Total HHs</th>
							<th>Amount to Female HH</th>
							<th>Amount to male HH</th>
							<th> Total Amount paid  </th>
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsEPW > 0 }">
					<c:forEach items="${listOfDistrictsEPW}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.totalPaidByMale }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByAll }</td> 		
						</tr>
					</c:forEach>		
						
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="7" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
																	
					</tbody>
				</table>
				<br>
				<!-- b.	CPW recipients per districts  -->	
				
 				<%-- <p class="list_L">C. Expanded Public Works - LB  Number of recipients participating in ePW LB by District </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Male </th>
							<th>Female </th>
							<th>Total HHs   </th>
							<th>Amount paid to Female HH</th>
							<th>Amount paid to male HH</th>
							<th>Total Amount paid</th>
							
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${listOfDistrictsEPwLB}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.totalPaidByMale }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByAll }</td>  		
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
																	
					</tbody>
				</table> --%>
				
				<br>
					<!-- d. Expanded Public Works service based  -->	
				
 				<p class="list_L">C. Expanded Public Works service based(ECD)</p>
 				<p>Number of Caregivers supported and children served by District</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">						
					</colgroup>
					<thead>
					  <tr>				
							<th rowspan="2">District</th>
							<th rowspan="2">Nbr C/HBECD </th>
							<th colspan="6">Caregivers </th>
							<th colspan="3">Children</th>		
						</tr>
						<tr>				
							
							<th>Female </th>
							<th>Male</th>
							<th>Total</th>
							<th>Amount paid for Female </th>
							<th>Amount paid for male</th>
							<th>Total Amount paid</th>
							<th>Girls</th>
							<th>Boys</th>
							<th>Total</th>
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsEPwECD > 0 }">
					<c:forEach items="${listOfDistrictsEPwECD}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.chbecd}</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.totalPaidByMale }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByAll }</td>  
							<td class="tC">${district.totalGirlsChildren }</td> 		
							<td class="tC">${district.totalBoysChildren }</td>
							<td class="tC">${district.totalChildren }</td> 	 		
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="11" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
																	
					</tbody>
				</table>
				<br><br>
				 <div class="titlealign">			
       				<h4>3. NORMAL DS</h4>
				</div>
 				
 				<p class="list_L">A. Key Performance Indicators in DS </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>cPW Indicators</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">No of sectors covered by DS</td> 		
							<td class="tC">${indicatorsDS.numberOfSectorsCovered }</td> 		
						</tr>
						<tr>
							<td class="tC">No of eligible households supported from DS</td> 		
							<td class="tC">${indicatorsDS.numberOfEligibleHousehold }</td> 		
						</tr>
						<tr>
							<td class="tC">Total number of females headed HHs</td> 		
							<td class="tC">${indicatorsDS.femaleCount }</td> 		
						</tr>
						<tr>
							<td class="tC">Total number of males headed HHs</td> 		
							<td class="tC">${indicatorsDS.maleCount }</td> 		
						</tr>
						<tr>
							<td class="tC">Total payments to DS clients</td> 		
							<td class="tC">${indicatorsDS.totalPaidByMale }</td> 		
						</tr>
						<tr>
							<td class="tC">Total payments to Female headed HH</td> 		
							<td class="tC">${indicatorsDS.totalPaidByFemale }</td> 		
						</tr>
						<tr>
							<td class="tC">Total payments to Male headed HH</td> 		
							<td class="tC">${indicatorsDS.totalPaidByMale}</td> 		
						</tr>
						<tr>
							<td class="tC">Average payment per HH</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Average number of months paid</td> 		
							<td class="tC"></td> 		
						</tr>															
					</tbody>
				</table>
				
				<!-- b.	CPW recipients per districts  -->	
				
 				<p class="list_L">B. Number of DS recipients by District </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">								
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>No of sectors covered by DS</th>
							<th>No of eligible households supported from DS</th>
							<th>Total number of females headed HHs</th>
							<th>Total number of males headed HHs</th>
							<th>Total payments to DS clients</th>
							<th>Total payments to Female headed HH</th>
							<th>Total payments to Male headed HH</th>
							<th>Timeliness payments</th>
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsDS > 0 }">
					<c:forEach items="${listOfDistrictsDS}" var="district">
					
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.numberOfSectorsCovered }</td>
							<td class="tC">${district.numberOfEligibleHousehold }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.totalPaidByAll }</td>
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByMale }</td>
							<td class="tC"></td>  		
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
																	
					</tbody>
				</table>
				
				<!-- DISABILITY REPORT ON DS by DISTRICT  -->	
				
 				<br><br>
				 <div class="titlealign">			
       				<h4>4. DISABILITY REPORT ON DS BY DISTRICT</h4>
				</div>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total HHs with PWDs</th>
							<th>Total HHs headed by female</th>
							<th>Total HHs headed by male</th>
							<th>Total payments to HHs with PWDs</th>
							<th>Total payments to HHs headed by female</th>
							<th>Total payments to HHs headed by male</th>
							<th>Timeliness payments</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsDSWithDisability > 0 }">
					<c:forEach items="${listOfDistrictsDisability}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.maleCount }</td> 		
							<td class="tC">${district.femaleCount }</td>
							<td class="tC">${district.totalPaidByAll }</td> 		
							<td class="tC">${district.totalPaidByMale }</td>
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC"></td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
									
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				
				<br><br>
				<!-- 5. DS WITH UNDER AGE BY DISTRICT  -->	
				
 				
				 <div class="titlealign">			
       				<h4>5. DS WITH UNDER AGE BY DISTRICT</h4>
				</div>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total HHs Headed by children (under 18)</th>
							<th>Total HHs headed by female (under 18)</th>
							<th>Total HHs headed by male (under 18)</th>
							<th>Total payments to HHs headed by children (under 18)</th>
							<th>Total payments to HHs headed by female (under 18)</th>
							<th>Total payments to HHs headed by male (under 18)</th>
							<th>Timeliness payments</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsDisabilityUnderAge > 0 }">
					<c:forEach items="${listOfDistrictsDisabilityUnderAge}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.totalPaidByAll }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByMale }</td>
							<td class="tC"></td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
									
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				<br><br>
				
				<!-- 6. OAG  -->	
				
 				
				 <div class="titlealign">			
       				<h4>6. OAG</h4>
				</div>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total HHs </th>
							<th>Total HHs headed by female</th>
							<th>Total HHs headed by male </th>
							<th>Total Individual Recipients (Female) </th>
							<th>Total individual Recipients (Male)</th>
							<th>Total payments to Female Recipients </th>
							<th>Total payments to Male Recipients</th>
							<th>Timeliness payments</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsAOG > 0 }">
					<c:forEach items="${listOfDistrictsAOG}" var="district">
					
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.femaleHHCount }</td> 		
							<td class="tC">${district.maleHHCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByMale }</td>
							<td class="tC"></td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td>
									
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				
				<!--7.  SKILLS DEVELOPMENT  -->	
				
 				<br><br>
				 <div class="titlealign">			
       				<h4>7.  SKILLS DEVELOPMENT</h4>
				</div>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total Recipients support  </th>
							<th>Total female Supported </th>
							<th>Total male Supported </th>
							<th>Total PWD Supported  </th>
							<th>Amount paid to Female recipient</th>
							<th>Amount paid to Male recipient </th>
							<th>Amount paid to PWD recipient</th>
							<th>Total amount paid</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsSkills > 0 }">
					<c:forEach items="${listOfDistrictsSkills}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.disabilityCount }</td> 		
							<td class="tC">${district.totalPaidByFemale }</td>
							<td class="tC">${district.totalPaidByMale }</td>
							<td class="tC">${district.totalBudgetDisability}</td>
							<td class="tC">${district.totalPaidByAll }</td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td>
									
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				
				
				
				<!-- 8. PRODUCTIVE ASSETS  -->	
				
 				<br><br>
				 <div class="titlealign">			
       				<h4>8. PRODUCTIVE ASSETS</h4>
				</div>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
					
						<tr>				
							<th rowspan="2">District</th>
							<th rowspan="2">Participants</th>
							<th rowspan="2">HH Headed by Female </th>
							<th rowspan="2">HH Headed by Male</th>
							<th rowspan="2">HHs With PWD Benefited</th>
							<th colspan="2">HHs received </th>
							<th colspan="3">Productive assets distributed </th>
							<th>Total</th>
							
							
							
						</tr>
						<tr>				
							
							<!-- <th>HH Headed by Female </th>
							<th>HH Headed by Male</th> -->
							<!-- <th>HHs With PWD Benefited</th> -->
							<th> Small live stock</th>
							<th>Startup toolkit </th>
							<th>Total</th>
							<th>Small Livestock</th>
							<th>Startup toolkit</th>
							<th>Total amount</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsAsset > 0 }">
					<c:forEach items="${listOfDistrictsAsset}" var="district">
					
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.femaleCount }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.disabilityCount }</td> 		
							<td class="tC">${district.HHLivestock }</td>
							<td class="tC">${district.HHStartup }</td>
							<td class="tC">${district.totalQuantity }</td>
							<td class="tC">${district.quantityLivestock }</td>
							<td class="tC">${district.totalQuantity }</td>
							<td class="tC">${district.quantityStartup }</td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td>
							<td class="tC"></td>
							<td class="tC"></td>
									
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="11" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				<br>
				<!-- A.	Type of small livestock distributed by District  -->	
				
 				<p class="list_L">A. Type of small livestock distributed by District </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">								
					</colgroup>
					<thead>
					 <tr>				
							<th rowspan="2">District</th>
							<th rowspan="2">HHs </th>
							<th colspan="7">Type of small livestock distributed</th>
							
							
						</tr>
						<tr>				
							<!-- <th>District</th>
							<th>HHs </th> -->
							<th>GOATS</th>
							<th>SHEEP</th>
							<th>PIGS</th>
							<th>CHICKEN</th>
							<th>Rabbit</th>
							<th>TOTAL</th>
							<th>Total Amount</th>
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsLivestock > 0 }">
					<c:forEach items="${listOfDistrictsLivestock}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.HHLivestock }</td>
							<td class="tC">${district.nbrGoats }</td> 		
							<td class="tC">${district.nbrSheeps }</td>
							<td class="tC">${district.nbrPigs }</td> 		
							<td class="tC">${district.nbrChickens }</td>
							<td class="tC">${district.nbrRabbits }</td>
							<td class="tC">${district.quantityLivestock }</td>
							<td class="tC">${district.totalCost }</td>  		
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td> 		
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="9" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				<br>
				
				<!-- b.	Detailed start up toolkits provided in district according to trades by District  -->	
				
 				<p class="list_L">B. Detailed start up toolkits provided in district according to trades by District </p>
				
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
					<col style="width: 20%">
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>HHs covered</th>
							<th>Building/masonry tools</th>
							<th>Carpentry Tools</th>
							<th>Electricity Tools </th>
							<th>Hair dressing/Beauty salon tool</th>
							<th>Mechanics Tool</th>
							<th>Sewing/Tailoring Tools</th>
							<th>Shoes making Tool</th>
							<th>Welding Tool</th>
							<th>Total toolkits</th>
							<th>Total amount</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsStartup > 0 }">
					<c:forEach items="${listOfDistrictsStartup}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.HHStartup }</td>
							<td class="tC">${district.nbrBuildingMasonry }</td> 		
							<td class="tC">${district.nbrCarpentry }</td>
							<td class="tC">${district.nbrElectricity }</td> 		
							<td class="tC">${district.nbrHairdressing }</td>
							<td class="tC">${district.nbrMechanics }</td>
							<td class="tC">${district.nbrSewing }</td>
							<td class="tC">${district.nbrShoesmaking }</td>
							<td class="tC">${district.nbrWelding }</td>
							<td class="tC">${district.quantityStartup }</td>
							<td class="tC">${district.nbrBuildingMasonry }</td>
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
							<td class="tC"></td>
							<td class="tC"></td>
							<td class="tC"></td>
							<td class="tC"></td>
							<td class="tC"></td>								
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="12" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				
				<br><br>
				 <div class="titlealign">			
       				<h4>9. FINANCIAL SERVICES</h4>
				</div>
 				
 				<p class="list_L">A. Key Performance Indicators in FS </p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>cPW Indicators</th>
							<th>Realized as at (Today)</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">No of sectors covered by FS</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Number of FS microcredit loans financed</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Number of recipients benefiting from VUP FS</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Female beneficiaries</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Male beneficiaries</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Cumulative Loan amount disbursed</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Cumulative amount to be recovered (FRW) as at (Today)</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Amount recovered (Frw) as at  (Today)</td> 		
							<td class="tC"></td> 		
						</tr>
						<tr>
							<td class="tC">Repayment rate ast at (Today)</td> 		
							<td class="tC"></td> 		
						</tr>															
					</tbody>
				</table>
				
				<!-- Loan by District  -->	
				
 				<p class="list_L">B. Loan by District</p>
				
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total loans</th>
							<th>Female Clients</th>
							<th>Percentage (Female)</th>
							<th>Male Clients</th>
							<th>Percentage (Male)</th>
							<th>Total Clients</th>
							
							
							
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td>
						
							
									
						</tr>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
															
						</tr>
																	
					</tbody>
				</table>
				<br><br>
				<!-- SHOCK RESPONSIVE SOCIAL PROTECTION  -->	
				<div class="titlealign">			
       				<h4>10. SHOCK RESPONSIVE SOCIAL PROTECTION</h4>
				</div>
				
 				
				
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 20%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">	
					<col style="width: 20%">
					<col style="width: 20%">
					
												
					</colgroup>
					<thead>
						<tr>				
							<th>District</th>
							<th>Total HHs</th>
							<th>Total Amount</th>
							<th>Female HH Headed</th>
							<th>Amount paid to Female HH Headed</th>
							<th>Male HH Headed</th>
							<th>Amount paid to Male HH Headed</th>
							
							
							
						</tr>
					</thead>
					<tbody>
					<c:choose>
					<c:when test="${totlistOfDistrictsShock > 0 }">
					<c:forEach items="${listOfDistrictsShock}" var="district">
						<tr>
							<td class="tC">${district.districtName }</td> 		
							<td class="tC">${district.totalCount }</td>
							<td class="tC">${district.totalPaidByAll }</td> 		
							<td class="tC">${district.femaleCount }</td>
							<td class="tC">${district.totalPaidByFemale }</td> 		
							<td class="tC">${district.maleCount }</td>
							<td class="tC">${district.totalPaidByMale }</td>
						
							
									
						</tr>
						</c:forEach>
						<tr>
							<td class="tC">Total</td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 		
							<td class="tC"></td>
							<td class="tC"></td> 
															
						</tr>
						</c:when>
								<c:otherwise>
									<tr>
										<td colspan="7" align="center">
											No Data
										</td>
									</tr>
								</c:otherwise>
						</c:choose>
																	
					</tbody>
				</table>
				<br>
				<p class="list_L">A. Performance indicators (Urgency)</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>Performance indicators (Urgency)</th>
							<th>Male</th>
							<th>Female</th>
							<th>Amount paid</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">Supported HHs with Not urgent shock</td> 		
							<td class="tC">${srIndicator.maleCountNU }</td> 	
							<td class="tC">${srIndicator.femaleCountNU }</td> 
							<td class="tC">${srIndicator.totalPaidNU }</td> 	
						</tr>
						<tr>
							<td class="tC">Supported HHs with Moderately urgent shock</td> 		
							<td class="tC">${srIndicator.maleCountMU }</td> 
							<td class="tC">${srIndicator.femaleCountMU }</td> 
							<td class="tC">${srIndicator.totalPaidMU }</td> 		
						</tr>
						<tr>
							<td class="tC">Supported HHs with Very urgent shock</td> 		
							<td class="tC">${srIndicator.maleCountVU }</td> 
							<td class="tC">${srIndicator.femaleCountVU }</td> 
							<td class="tC">${srIndicator.totalPaidVU }</td> 		
						</tr>
						
																		
					</tbody>
				</table>
				<br>
				<p class="list_L">B. Performance indicators (Type of shock)</p>
				<table class="article_table mb10">
					<colgroup>
					<col style="width: 40%">
					<col style="width: 20%"> 
					<col style="width: 20%">	
					<col style="width: 20%">							
					</colgroup>
					<thead>
						<tr>				
							<th>Performance indicators(Type of shock))</th>
							<th>Male</th>
							<th>Female</th>
							<th>Amount paid</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="tC">Serious injury of HH bread winner</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountDHHBW }</td> 	
							<td class="tC">${srIndicatorTypeofShock.femaleCountDHHBW }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidDHHBW }</td> 	
						</tr>
						<tr>
							<td class="tC">Death of HH bread winner</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountSIHHBW }</td> 
							<td class="tC">${srIndicatorTypeofShock.femaleCountSIHHBW }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidSIHHBW }</td> 		
						</tr>
						<tr>
							<td class="tC">Partial loss of shelter</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountPLS }</td> 
							<td class="tC">${srIndicatorTypeofShock.femaleCountPLS }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidPLS }</td> 	 		
						</tr>
						<tr>
							<td class="tC">Complete loss of shelter</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountCLS }</td> 
							<td class="tC">${srIndicatorTypeofShock.femaleCountCLS }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidCLS }</td> 	 		
						</tr>
						<tr>
							<td class="tC">Loss of domestic animals</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountLDA }</td> 
							<td class="tC">${srIndicatorTypeofShock.femaleCountLDA }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidLDA }</td> 			
						</tr>
						<tr>
							<td class="tC">Loss of crops</td> 		
							<td class="tC">${srIndicatorTypeofShock.maleCountLC }</td> 
							<td class="tC">${srIndicatorTypeofShock.femaleCountLC }</td> 
							<td class="tC">${srIndicatorTypeofShock.totalPaidLC }</td> 			
						</tr>
						
																		
					</tbody>
				</table>
				
	</form:form>
						
				<div class="pagination mb20">
				</div>			
 				</div>
 				
		
		</div>


	<script>
		$(function() {
			$('#dateOfBirthInput').datepicker();
		});
	</script>

	<script>
		$(function() {
			var yesButton = $("#yesbutton");
			var progress = $("#doitprogress");
			yesButton.click(function() {
				yesButton.button("loading");
				var counter = 0;
				var countDown = function() {
					counter++;
					if (counter == 11) {
						yesButton.button("complete");
					} else {
						progress.width(counter * 10 + "%");
						setTimeout(countDown, 100);
					}
				};
				setTimeout(countDown, 100);
			});
		});
	</script>


</body>
</html>