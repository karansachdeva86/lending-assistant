<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chromium Log Analyzer</title>
<!--  Responsive Elements START -->
<link rel="stylesheet" href="${path.http}/chromium-log-analyzer/css/skel-noscript.css" />
<link rel="stylesheet" href="${path.http}/chromium-log-analyzer/css/style.css" />
<link rel="stylesheet" href="${path.http}/chromium-log-analyzer/css/style-desktop.css" />

<script src="${path.http}/chromium-log-analyzer/js/jquery/jquery-1.11.1.min.js"></script>
<script src="${path.http}/chromium-log-analyzer/js/config.js"></script>
<script src="${path.http}/chromium-log-analyzer/js/skel.min.js"></script>
<script src="${path.http}/chromium-log-analyzer/js/skel-panels.min.js"></script>
		<!--[if lte IE 9]><link rel="stylesheet" href="${path.http}/chromium-log-analyzer/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><script src="${path.http}/chromium-log-analyzer/js/html5shiv.js"></script><![endif]-->
<!--  Responsive Elements END -->
		
</head>
<body class='body'>
	<div id="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="12u">
						
						<header id="header">
							<h1><a href="#" id="logo">Chromium Log Analyzer</a></h1>
							<nav id="nav">
								<a href="index.html" class="current-page-item">Home</a>
								<a href="${path.http}/cTrac/search">Black List</a>
							</nav>
						</header>
					
					</div>
				</div>
			</div>
		</div>	
		<div class="body">
	<div style="margin: 0 auto;padding: 30px 15px;width: 90%;color: #000000;">
	
		  Search Results For: ${queryStr}
		    </div>
		    </div>
         <div class="cleaner_h160"></div> 

</body>
</html>