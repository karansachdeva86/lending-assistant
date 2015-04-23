<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LendingClub</title>
<!--  Responsive Elements START -->
<link rel="stylesheet" href="${contextPath}/css/skel-noscript.css" />
<link rel="stylesheet" href="${contextPath}/css/style.css" />
<link rel="stylesheet" href="${contextPath}/css/style-desktop.css" />
<link rel="stylesheet" href="${contextPath}/css/form-elements/form.css">
<link rel="stylesheet" href="${contextPath}/css/form-elements/style.css">
<script src="${contextPath}/js/jquery/jquery-1.11.1.min.js"></script>
<script src="${contextPath}/js/jquery/jquery.validate.min.js"></script>
<script src="${contextPath}/js/config.js"></script>
<script src="${contextPath}/js/skel.min.js"></script>
<script src="${contextPath}/js/skel-panels.min.js"></script>
		<!--[if lte IE 9]><link rel="stylesheet" href="${contextPath}/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><script src="${contextPath}/js/html5shiv.js"></script><![endif]-->
<!--  Responsive Elements END -->
<script>
	$().ready(function() {

		// validate signup form on keyup and submit
		$("#masterForm").validate({
			rules: {
				amtToInvest: {
					required: true,
					number: true
				},
				stateId: "required",
				resultNo: {
					required: true,
					number: true
				}
			},
			messages: {
				agree: "Please accept our policy"
			}
		});

	});
	</script>		
</head>
<body class='body'>
	<div id="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">
						
						<header id="header">
							<h1><a href="#" id="logo">LendingAssistant</a></h1>
							<nav id="nav">
								<a href="${contextPath}" class="current-page-item">Home</a>
								
							</nav>
						</header>
					
					</div>
				</div>
			</div>
		</div>	
	<div class="body">
		<div style="margin: 0 auto;padding: 30px 15px;width: 90%;color: #000000;">
		
			  	<div id="templatemo_content_wrapper">
			 			<form:form commandName="masterForm" id="masterForm"  name="masterForm" method="post" action="${contextPath}/smart-agent/submit">
							<div id="templatemo_content">
										<br/>
										<!-- Search Params -->
								 		<fieldset class="coolfieldxset wide" id="parameters">
								 		
										<legend class="desc">
											Search
										</legend>
										<div>
										<ul>
											<li class="leftFourth">
												<label class="desc">Amount To Invest
												<form:input cssClass="field text small"  id="amtToInvest" path="amtToInvest"/>
							 					</label>
											</li>
											<li class="middleFourth">
												<label class="desc">State
												<form:select path="stateId" id="stateId" cssClass="field select large">
													<form:option value="">--Select--</form:option>
													<c:forEach items="${masterForm.stateList}" var="stateVal">
														<form:option value="${stateVal.stateCode}">${stateVal.stateName} (${stateVal.stateCode})</form:option>
													</c:forEach>	
												</form:select>
							 					</label>
											</li>
											<li class="middleFourth">
												<label class="desc">No. of Listings
													<form:input cssClass="field text small"  id="resultNo" path="resultNo"/>
							 					</label>
											</li>
											<li class="rightFourth">
												<label class="desc">Loan Purpose
													<form:select path="purpose" id="purpose" cssClass="field select small">
													<form:option value="">--Select--</form:option>
													<form:option value='car'>Car Buying</form:option>
													<form:option value='credit_card'>Credit Card Payment</form:option>
													<form:option value='debt_consolidation'>Debt Consolidation</form:option>
													<form:option value='educational'>Educational</form:option>
													<form:option value='home_improvement'>Home Improvement</form:option>
													<form:option value='house'>House</form:option>
													<form:option value='major_purchase'>Major Purchase</form:option>
													<form:option value='medical'>Medical</form:option>
													<form:option value='moving'>Moving</form:option>
													<form:option value='other'>Other</form:option>
													<form:option value='renewable_energy'>Renewable Energy</form:option>
													<form:option value='small_business'>Small Business</form:option>
													<form:option value='vacation'>Vacation</form:option>
													<form:option value='wedding'>Wedding</form:option>
												</form:select>
							 					</label>
											</li>
										</ul>
										
											<div align="center"><input type="submit" id="submitMasterForm" class="custom-submit" value="Submit"></div>
											</div>
										</fieldset>
										</div>
							</form:form>		
							
								<br/>
							<c:if test="${searchResults!= null || fn:length(searchResults) > 0 }">
							 		<div id="details" class="datagrid">
						            	<table id="contractSearchResults" class="gradeA" style="border: 1px solid black;border-collapse:collapse;width: 100%">
						            		<thead>
						            			<tr>
						            				<th style="font-weight: bold">Loan Amount</th>
						            				<th style="font-weight: bold">Purpose</th>
						            				<th style="font-weight: bold">Interest Rate</th>
						            				<th style="font-weight: bold">Desc</th>
						            				<th style="font-weight: bold">Details</th>
						            			</tr>
						            		</thead>
						            		<tbody>
						            			<c:forEach items="${searchResults}" var="searchResult" varStatus="ctr">
						            				<c:choose>
						            					<c:when test="${ctr.count %2 ==0}">
										            				<tr class="">
						            					</c:when>
						            					<c:otherwise>
						            								<tr class="alt">
						            					</c:otherwise>
						            				</c:choose>
							            				<td style="font-weight: bold">${searchResult.loanAmnt}</td>
							            				<td style="font-weight: bold">${searchResult.purpose}</td>
							            				<td style="font-weight: bold">${searchResult.intRate}</td>
							            				<td style="font-weight: bold">${searchResult.desc}</td>
					            						<td style="font-weight: bold"><a href="https://www.lendingclub.com/browse/loanDetail.action?loan_id=${searchResult.id}" target="_blank"><img src='${contextPath}/images/detail_icon.png'/></a></td>
						            				</tr>
						            			</c:forEach>	
						            		</tbody>
						            	</table>
						            	</div>
						            </c:if>	
		    	</div>
	    </div>
    </div>
    <div class="cleaner_h160"></div> 

</body>
</html>