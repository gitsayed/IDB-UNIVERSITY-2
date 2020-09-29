<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<<<<<<< HEAD

=======
<style>
    .wid{
        
        width: 150px;
        text-align: left;
    }
</style>
>>>>>>> 7619d62... first commit

<div class="col-md-2" style="">
                <div class="panel panel-default">
                    <div style="border-radius: 10px ; background-color:#048277; color: white" class="panel-heading">
                        <center> <span class="glyphicon glyphicon-list-alt"></span>
                            &nbsp; <b> 
                                
                                
<<<<<<< HEAD
                                About Us
=======
                                Student : ${user.username}
>>>>>>> 7619d62... first commit
                            </b>
                        </center>
                    
                    
                    
                    </div>
                    <div class="noitce-panel-body container-fluid">
                        <div class="row">
                            <div class="col-xs-12">
                                <ul class="demo3" style="overflow-y: hidden; height: 1000px;">
                                    <li class="news-item">
                                        <table border="0" cellpadding="0">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading ">
<<<<<<< HEAD
                                                            <a href="${contextRoot}/s/getmyprofile" class="btn btn-primary"> My Profile </a> 
=======
                                                            <a href="${contextRoot}/s/getmyprofile/${user.id}" class=" wid btn btn-primary"> My Profile </a> 
>>>>>>> 7619d62... first commit
                                                        </div>
                                                        
                                                    </td>
                                                </tr>
                                                
<<<<<<< HEAD
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
                                                        <a href="${contextRoot}/s/getinboxmessage" class="btn btn-primary"> Inbox </a> 
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
=======
                                            
>>>>>>> 7619d62... first commit
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
<<<<<<< HEAD
                                                        <a href="${contextRoot}/s/applicationform"  class="btn btn-primary"> Application </a> 
=======
                                                        <a href="${contextRoot}/s/applicationform/${user.id}"  class=" wid btn btn-primary"> Application </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
<<<<<<< HEAD
                                                        <a href="${contextRoot}/s/payfeeform" class="btn btn-primary"> Pay Fee </a> 
=======
                                                        <a href="${contextRoot}/s/payfeeform/${user.id}" class=" wid btn btn-primary"> Pay Fee </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/s/checkduepayment" class="btn btn-primary">  Due Payment  </a> 
=======
                                                            <a href="${contextRoot}/s/checkduepayment/${user.id}" class=" wid btn btn-primary">  Due Payment  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
<<<<<<< HEAD
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
                                                            <a href="${contextRoot}/" class="btn btn-primary" >  My Class Schedules  </a> 
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
                                                            <a href="${contextRoot}/" class="btn btn-primary" >  My Class Schedules  </a> 
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
=======
                                              
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
                                                            <a href="${contextRoot}/s/getschedule/${user.id}" class=" wid btn btn-primary" > Class Schedules  </a> 
                                                       
                                                        </div>
                                                      
>>>>>>> 7619d62... first commit
                                                    </td>
                                                </tr>
                                                
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/futureplan" class="btn btn-primary"> My Result Status </a> 
=======
                                                            <a href="#" class=" wid btn btn-primary"> My Result Status </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                       
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/futureplan" class="btn btn-primary"> Syllabus </a> 
=======
                                                            <a href="#" class=" wid btn btn-primary"> Syllabus </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                       
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/futureplan" class="btn btn-primary"> Book List</a> 
=======
                                                            <a href="#" class=" wid btn btn-primary"> Book List</a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                       
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/futureplan" class="btn btn-primary">Log Out </a> 
=======
                                                            <a href="${contextRoot}/home" class=" wid btn btn-primary">Log Out </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                       
                                                    </td>
                                                </tr>
                                                
                                            </tbody>
                                        </table>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div> 
                    
                    
<!--                    <div class="panel-footer"> 
                        <ul class="pagination pull-right" style="margin: 0px;">
                            <li><a href="home" class="prev">
                                    <span class="glyphicon glyphicon-chevron-down"></span>
                                </a></li><li><a href="home" class="next">
                                        <span class="glyphicon glyphicon-chevron-up"></span>
                                    </a></li></ul><div class="clearfix">
                            
                                    </div>
                            
                    </div>
                    -->
                    
                </div>
            </div> 

                                                                   


