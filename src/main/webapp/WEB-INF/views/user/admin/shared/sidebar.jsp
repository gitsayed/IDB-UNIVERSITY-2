<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<<<<<<< HEAD

=======
>>>>>>> 7619d62... first commit
<div class="col-md-2" style="">
                <div class="panel panel-default">
                    <div style="border-radius: 10px ; background-color:#048277; color: white" class="panel-heading">
                        <center> <span class="glyphicon glyphicon-list-alt"></span>
                            &nbsp; <b> 
                                
                                
<<<<<<< HEAD
                                Admin :${user.username}
=======
                                ${user.user_role} : ${user.username}
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
                                                            <a href="${contextRoot}/adm/viewprofile/${user.id}/${user.role_id}" modelAttribute=${user} class="btn btn-primary"> Admin Profile </a> 
=======
                                                            <a  href="${contextRoot}/adm/viewprofile/${user.id}/${user.role_id}" modelAttribute=${user}  class =" wid btn btn-primary" > Admin Profile </a> 
>>>>>>> 7619d62... first commit
                                                        </div>
                                                        
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
<<<<<<< HEAD
                                                        <a href="${contextRoot}/a" class="btn btn-primary"> Inbox </a> 
=======
                                                        <a href="${contextRoot}/dispatch/gotoinbox/${user.id}" class=" wid btn btn-primary"> Inbox </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
<<<<<<< HEAD
                                                        <a href="${contextRoot}/adm/viewpayments/${user.id}"  class="btn btn-primary"> Payments  </a> 
=======
                                                        <a href="${contextRoot}/adm/viewpayments/${user.id}"  class="wid  btn btn-primary"> Payments  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
<<<<<<< HEAD
=======
<!--                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
                                                        <a href="$a{contextRoot}/report/payment_report/$a{user.id}"  class="wid  btn btn-primary"> Payment Report  </a> 
                                                       
                                                        </div>
                                                    </td>
                                                </tr>-->
>>>>>>> 7619d62... first commit
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading">
<<<<<<< HEAD
                                                        <a href="${contextRoot}/a/" class="btn btn-primary">Teachers  </a> 
=======
                                                        <a href="${contextRoot}/adm/gototeachers/${user.id}" class=" wid btn btn-primary">Teachers  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/adm/" class="btn btn-primary"> Students  </a> 
=======
                                                            <a href="${contextRoot}/adm/gotostudents/${user.id}" class=" wid btn btn-primary"> Students  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/adm/" class="btn btn-primary" > Departments  </a> 
=======
                                                            <a href="${contextRoot}/adm/gotodepartments/${user.id}" class=" wid btn btn-primary" > Departments  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/" class="btn btn-primary" >Class Schedules  </a> 
=======
                                                            <a href="${contextRoot}/adm/gotoschedule/${user.id}" class=" wid btn btn-primary" >Class Schedules  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/" class="btn btn-primary" >  Results  </a> 
=======
                                                            <a href="${contextRoot}/result/gotoresultpanel/${user.id}"class=" wid btn btn-primary" >  Results  </a> 
>>>>>>> 7619d62... first commit
                                                       
                                                        </div>
                                                         <!--<p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>-->                                              
                                                        <!--<a href="#">Read more...</a>-->
                                                    </td>
                                                </tr>
                                                
                                                
                                                <tr>
                                                    <td>
                                                        <div class="list-group-item-heading"> 
<<<<<<< HEAD
                                                            <a href="${contextRoot}/futureplan" class="btn btn-primary"> News & Notices </a> 
=======
                                                            <a href="${contextRoot}/dispatch/gotonotice/${user.id}" class=" wid btn btn-primary"> News & Notices </a> 
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
                                                            <a href="${contextRoot}/home" class="btn btn-primary">Log Out </a> 
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

                                                                   


