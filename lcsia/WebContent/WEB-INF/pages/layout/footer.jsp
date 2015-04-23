<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="year" value="${now}" pattern="yyyy" />

<!--100% div -->
    	<div id="footerbig">
        <!--footer start -->
          <div id="footer">
                 <p>Copyright ${year} ST Kinetics All Rights Reserved</p>
				 <p>Powered by <a href="#" target="_blank" title="Business Solutions">Business Solutions</a></p>
          </div>
        <!--footer end -->
    </div>
    <!--100% footer end -->