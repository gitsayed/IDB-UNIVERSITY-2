<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid">
<<<<<<< HEAD
<div class="row">

 
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div style="border-radius: 10px solid #000; background-color:#048277; color: white" class="panel-heading">
                        <center> <span class="glyphicon glyphicon-list-alt"></span> &nbsp; <b>LATEST NEWS</b> </center></div>
                    <div class="noitce-panel-body">
                        <div class="row">
                            <div class="col-xs-12">
                                <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                                    <li class="news-item">
                                        <table border="0" cellpadding="0">
                                            <tbody><tr>
                                                    <td>
                                                        <div class="list-group-item-heading">ঢাকা বিশ্ববিদ্যালয়ে প্রস্তুতকৃত হ্যান্ড  স্যানিটাইজার বিতরণ শুরু</div>
                                                         <p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>                                              
                                                        <a href="#">Read more...</a>
                                                    </td>
                                                </tr>
                                            </tbody></table>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;"><li><a href="home" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="home" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
                </div>
            </div> 
            
            
            
            
            
            
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div style="border-radius: 10px solid #0000; background-color:#048277; color: white" class="panel-heading">
                        <center> <span class="glyphicon glyphicon-list-alt"></span> &nbsp; <b> EVENTS</b> </center></div>
                    <div class="noitce-panel-body">
                        <div class="row">
                            <div class="col-xs-12">
                                <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                                    <li class="news-item">
                                        <table border="0" cellpadding="0">
                                            <tbody><tr>
                                                    <td>
                                                        <div class="list-group-item-heading">ঢাকা বিশ্ববিদ্যালয়ে প্রস্তুতকৃত হ্যান্ড  স্যানিটাইজার বিতরণ শুরু</div>
                                                        <p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>                                            
                                                        <a href="#">Read more...</a>
                                                    </td>
                                                </tr>
                                            </tbody></table>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;">
                            <li><a href="home" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li>
                                <a href="home" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
                </div>
            </div> 
            
            
            
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div style="border-radius: 10px solid #000; background-color:#048277; color: white" class="panel-heading">
                        <center><span class="glyphicon glyphicon-list-alt"></span> &nbsp;<b>NOTICE BOARD</b> </center></div> 
                        
                    <div class="noitce-panel-body">
                        <div class="row">
                            <div class="col-xs-12">
                                <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                                    <li class="news-item">
                                        <table border="0" cellpadding="0">
                                            <tbody><tr>
                                                    <td>
                                                        <div class="list-group-item-heading">ঢাকা বিশ্ববিদ্যালয়ে প্রস্তুতকৃত হ্যান্ড  স্যানিটাইজার বিতরণ শুরু</div><p class="list-group-item-text" style="font-size:11px;">16 Mar 2020 </p>                                                <a href="https://www.du.ac.bd/latest_news/single_news/2658">Read more...</a>
                                                    </td>
                                                </tr>
                                            </tbody></table>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;"><li><a href="#" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="#" class="next">
                                    <span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
                </div>
            </div> 
=======
    <div class="row">


        <div class="col-md-4">
            <div class="panel panel-default">
                <div style="border-radius: 10px solid #000; background-color:#048277; color: white" class="panel-heading">
                    <center> <span class="glyphicon glyphicon-list-alt"></span> &nbsp; <b>LATEST NEWS</b> </center></div>
                    <div class="noitce-panel-body" style="padding: 15px">
                    <div class="row">
                        <div class="col-xs-12">
                            <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                          <marquee id="mq3"  direction ="up" scrollamount="8"
                                         onmouseover="document.getElementById('mq3').stop()"
                                         onmouseout="document.getElementById('mq3').start()">

                                    <c:if test="${noticepanel == true}"> 
                                        <c:forEach var="n" items="${newslist}"> 

                                            <!--<tbody >-->
                                            <div type="hidden" style="font-weight: bolder; " > &nbsp; ID :${n.id} => ${n.title}        </div>
                                            <div style="font-weight: bolder">  ${n.subject}     </div>
                                            <div >&nbsp;   ${n.body}      </div>
                                            <div style="font-weight: bolder">Published :  ${n.p_date}     </div>
                                            <div><a href="${contextRoot}/home/gotodetailsnotice/${n.id}" style="font-weight: bolder"> Read More . . . </a>          </div>
                                            <div>______________________________________________          </div>


                                        </c:forEach>

                                    </c:if>

                                </marquee >

                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;"><li><a href="home" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="home" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
            </div>
        </div> 






        <div class="col-md-4">



            <div class="panel panel-default">
                <div style="border-radius: 10px solid #0000; background-color:#048277; color: white" class="panel-heading">
                    <center> <span class="glyphicon glyphicon-list-alt"></span> &nbsp; <b> EVENTS</b> </center> 
                </div> 

                <!--<marquee direction ="up">-->
                <div class="noitce-panel-body" style="padding: 15px">
                    <div class="row">
                        <div class="col-xs-12">
                            <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                                <marquee id="mq2"  direction ="up" scrollamount="8"
                                         onmouseover="document.getElementById('mq2').stop()"
                                         onmouseout="document.getElementById('mq2').start()">

                                    <c:if test="${noticepanel == true}"> 
                                        <c:forEach var="n" items="${eventlist}"> 

                                            <!--<tbody >-->
                                            <div style="font-weight: bolder; " > &nbsp; ID :${n.id} => ${n.title}        </div>
                                            <div style="font-weight: bolder">  ${n.subject}     </div>
                                            <div >&nbsp;   ${n.body}      </div>
                                            <div style="font-weight: bolder">Published :  ${n.p_date}     </div>
                                            <div><a href="${contextRoot}/home/gotodetailsnotice/${n.id}" style="font-weight: bolder"> Read More . . . </a>          </div>
                                            <div>______________________________________________          </div>


                                        </c:forEach>

                                    </c:if>

                                </marquee>

                            </ul>
                        </div>
                    </div>
                </div>
                <!--</marquee>-->
                <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;">
                        <li><a href="home" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li>
                            <a href="home" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
            </div>
        </div> 



        <div class="col-md-4">
            <div class="panel panel-default">
                <div style="border-radius: 10px solid #000; background-color:#048277; color: white" class="panel-heading">
                    <center><span class="glyphicon glyphicon-list-alt"></span> &nbsp;<b>NOTICE BOARD</b> 
                    </center>
                </div> 

                <div class="noitce-panel-body" style="padding: 10px">
                    <div class="row">
                        <div class="col-xs-12"> 
                            <ul class="demo3" style="overflow-y: hidden; height: 548px;">
                                <!--<li class="news-item"> &nbsp;-->
                                <marquee id="mq"  direction ="up" scrollamount="8"
                                         onmouseover="document.getElementById('mq').stop()"
                                         onmouseout="document.getElementById('mq').start()">

                                    <c:if test="${noticepanel == true}"> 
                                        <c:forEach var="n" items="${noticelist}"> 

                                            <!--<tbody >-->
                                            <div style="font-weight: bolder; " > &nbsp; ID :${n.id} => ${n.title}        </div>
                                            <div style="font-weight: bolder">  ${n.subject}     </div>
                                            <div >&nbsp;   ${n.body}      </div>
                                            <div style="font-weight: bolder">Published :  ${n.p_date}     </div>
                                            <div><a href="${contextRoot}/home/gotodetailsnotice/${n.id}" style="font-weight: bolder"> Read More . . . </a>          </div>
                                            <div>______________________________________________          </div>


                                        </c:forEach>

                                    </c:if>

                                </marquee >



                            </ul> 




                        </div>
                    </div>
                </div>
                <div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;"><li><a href="#" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="#" class="next">
                                <span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
            </div>
        </div> 
>>>>>>> 7619d62... first commit










<<<<<<< HEAD
        </div>
    </div>
=======
    </div>
</div>
>>>>>>> 7619d62... first commit
