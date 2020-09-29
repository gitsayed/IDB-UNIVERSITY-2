<%-- 
    Document   : report_page
    Created on : Aug 6, 2020, 8:18:49 PM
    Author     : SAYED
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body onload="getPdfReport()">
        

 
        
        
        <embed id="embedPdf" src="" type="application/pdf" width="80%" height="1200px" />  
        
        
        
        
        
<!--        
        <script>




            function getPdfReport() {
                 request = new XMLHttpRequest();
                url = "http://localhost:8080/idb.edu/report/payment_report2";
                request.open("GET", url, true);
                
                request.responseType = "blob";
                request.setRequestHeader("Content-type", "application/pdf");
                request.send();
                request.onload = function () {
                    var file = window.URL.createObjectURL(this.response);
                    document.getElementById("embedPdf").src = file;
                    document.getElementById("objectid").data = file;
                    document.getElementById("iframeid").src = file;
                };
            }
        </script>   -->
    </body>
</html>
