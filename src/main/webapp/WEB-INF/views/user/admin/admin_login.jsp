<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<spring:url var="a"        value="/assets/"/>   

<spring:url var="css"     value="/css/"/>
<spring:url var="js"      value="/js/"/>
<spring:url var="images"  value="/images/"/> 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <link rel = "icon" type = "image/png" href ="${a}/index2_files/idb-bisew.png">
        <title>

            IDB UNIVERSITY |  Bangladesh  </title>

        <link rel="stylesheet" href="${a}/index2_files/jquery.dataTables.min.css">
        <link rel="stylesheet" href="${a}/index2_files/bootstrap.min.css">
        <link rel="stylesheet" href="${a}/index2_files/style.css">
        <link rel="stylesheet" href="${a}/index2_files/tabs.css">
        <link rel="stylesheet" href="${a}/index2_files/style3.css">
        <link rel="stylesheet" href="${a}/index2_files/owl.carousel.css">
        <link rel="stylesheet" href="${a}/index2_files/owl.theme.css">
        <link rel="stylesheet" href="${a}/index2_files/font-awesome.min.css">
        <link rel="stylesheet" href="${a}/index2_files/style(1).css">
        <link rel="stylesheet" href="${a}/index2_files/jquery.mCustomScrollbar.css">
        <link rel="stylesheet" href="${a}/index2_files/jquery.bxslider.min.css">
        <link rel="stylesheet" href="${a}/index2_files/jquery.dataTables.min.css">
        <link rel="stylesheet" href="${a}/index2_files/css" >
        <link rel="stylesheet" href="${a}/index2_files/animate.css" >
        <link rel="stylesheet" href="${a}/index2_files/bootsnav.css" >
        <link rel="stylesheet" href="${a}/index2_files/navstyle.css" >

<<<<<<< HEAD
=======
        <style>



            .pro{
                border: 1px solid black;
                border-collapse: collapse;
                width: 30%;  
                text-align: left; 
                color: black;
            }
            .pro3{
                border: 1px solid black;
                border-collapse: collapse;
                /*width: 30%;*/  
                text-align: center; 
                color: black;
                padding-left:  5px; 
            }
            .pro2{
                border: 1px solid black;
                border-collapse: collapse;
                text-align: left;  
                /*padding: 10px;*/  
                padding-left:  10px;  
                font-weight:  bold;
                width: 50%;
                color: black;
            }  

            .pro4{
                border: 1px solid black;
                border-collapse: collapse;
                text-align: center;  
                /*padding: 10px;*/  
                padding-left:  10px;  
                font-weight:  bold;
                /*width: 50%;*/
                color: black;
            }  

            .pro5{
                border: 1px solid black;
                border-collapse: collapse;
                text-align: left;  
                /*padding: 10px;*/  
                padding-left:  5px;  
                font-weight:  bold;
                /*width: 50%;*/
                color: black;
            }
            .pro6{
                border: 1px solid black;
                border-collapse: collapse;
                text-align: center;  
                /*padding: 10px;*/  
                padding-left:  5px;  
                font-weight:  bold;
                /*width: 50%;*/
                color: black;
            }
            .wid{

                width: 150px;
                text-align: left;
            }
        </style>
>>>>>>> 7619d62... first commit


    </head>

    <body  oncontextmenu="return false" style="background-color: ">
<<<<<<< HEAD
     
        
        <%@include file="shared/navbar.jsp"  %>
     <div class="container-fluid"> 
=======


        <%@include file="shared/navbar.jsp"  %>
        <div class="container-fluid"> 
>>>>>>> 7619d62... first commit
            <div class="row">
                <%@include file="shared/sidebar.jsp"  %>
                <%@include file="shared/details.jsp"  %>


            </div>
        </div>
<<<<<<< HEAD
                
                
        <%@include file="shared/footer.jsp"  %>
    
    
        
        
        
        
        
        
        
       <script>
            var tds = document.getElementById('count_it').getElementsByTagName('td');
           
            var paid = 0;
            var due = 0;
            for(var i = 0; i < tds.length; i ++) {
                if(tds[i].className === 'paid') {
                    paid += isNaN(tds[i].innerHTML) ? 0 : parseInt(tds[i].innerHTML);
                }
            }
            document.getElementById('countit').innerHTML += '<tr>\n\
                    <td></td> <td></td> <td></td> \n\
                    <td class="pro3">Total</td><td>' + paid + '</td></tr>';
        </script>  
    
=======


        <%@include file="shared/footer.jsp"  %>









        <!--       <script>
                    var tds = document.getElementById('count_it').getElementsByTagName('td');
                   
                    var paid = 0;
                    var due = 0;
                    for(var i = 0; i < tds.length; i ++) {
                        if(tds[i].className === 'paid') {
                            paid += isNaN(tds[i].innerHTML) ? 0 : parseInt(tds[i].innerHTML);
                        }
                    }
                    document.getElementById('countit').innerHTML += '<tr>\n\
                            <td></td> <td></td> <td></td> \n\
                            <td class="pro3">Total</td><td>' + paid + '</td></tr>';
                </script>  -->


        <script>
            function getPdfReport() {
                var request = new XMLHttpRequest();
                url = "http://localhost:8080/idb.edu/report/payment_report2";
                request.open("GET", url, true);
                request.responseType = "blob";
                request.setRequestHeader("Content-type", "application/pdf");
                request.send();
                request.onload = function () {
                    var file = window.URL.createObjectURL(this.response);
                    document.getElementById("embedPdf").src = file;
//                    document.getElementById("objectid").data = file;
//                    document.getElementById("iframeid").src = file;
                };
            }


            function getResultReport() {
                var studentId = document.getElementById("studentId").value;
                var semester = document.getElementById("semester").value;
                if (studentId === ( null || "") )            
                {
                    window.alert("Please Input Student ID Number");
                } else if (studentId <= 0){
                    window.alert(" Student ID must be Positive Integer.");
                } else if (semester === "null"){
                    window.alert("Please Select Semester.");
                } else {
                    url = "http://localhost:8080/idb.edu/report/resultreport/" + semester + "/" + studentId;
                    var request = new XMLHttpRequest();
                    request.open("GET", url, true);
                    request.responseType = "blob";
                    request.setRequestHeader("Content-type", "application/pdf");
                    request.send();
                    request.onload = function () {
                        var file = window.URL.createObjectURL(this.response);
                        document.getElementById("pdfResult").src = file;
                    };
                }
                console.log("function called getResultReport");
                console.log(" student ID =" + studentId);
                console.log("semester =" + semester);
            }



//window.alert("Error :: Student ID and Semester can't be Empty");
            function test() {

                window.alert("Error :: Student ID and Semester can't be Empty");
            }

            function getResultReportq() {
//        var studentId = document.getElementById("studentId").value;
//        var semester = document.getElementById("semester").value;
//        if (semester === "null" || studentId === (0 || null || "")) {
//      
                window.alert("Error :: Student ID and Semester can't be Empty");
            }

        </script>     




>>>>>>> 7619d62... first commit
    </body>
</html>