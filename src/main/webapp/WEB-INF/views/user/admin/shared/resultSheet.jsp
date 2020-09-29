<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<a href="${contextRoot}/result/viewallresults/${user.id}" class="btn btn-primary">View All Result </a>
<a href="${contextRoot}/report/resultreport/${user.id}" class="btn btn-primary"> Result Report </a>
<br/>

<c:if test="${submit==true}"   >
    <h4 Style="color:green"> Result has been added successfully. </h4>
</c:if>
<c:if test="${submit==false}">
    <h4 Style="color:red;  ">&emsp;Result data input  error <br/>or, Student doesn't exist <br/>or, Something went wrong. 
        <a href="${contextRoot}/result/gotoresultpanel/${user.id}">
            Try again.</a> </h4>
        </c:if>

<c:if test="${update == true}"   >
    <h4 Style="color:green"> Result has been updated successfully. </h4>
</c:if>
<c:if test="${update==false}">
    <h4 Style="color:red;  ">&emsp;Result data input  error <br/>or, Student doesn't exist <br/>or, Something went wrong. 
        <a href="${contextRoot}/result/gotoresultpanel/${user.id}">
            Try again.</a> </h4>
        </c:if>






<c:if test="${resultInputpanel==true}"  > 
    <h2 style="color: black"> Search Student Result: </h2>

    <form:form action="${contextRoot}/result/viewstudentresult/${user.id}" method="post" modelAttribute="resultObject">
        <span class="btn btn-primary"> Student ID</span> 
        <form:input    path="studentId" placeholder="Type Student ID"
                       style="font-weight: bold; height: 30px; padding-left:10pt" required="true"/> &emsp;
        <span class="btn btn-primary"> Semester</span> 
        <form:select    path="semester" style="font-weight: bold; height: 30px" required="true" >
            <option   value="sm" >Select Semester  </option>
            <option value="semester01"> 1 st Semester</option>
            <option value="semester02"> 2 nd Semester</option>
            <option value="semester03"> 3 rd Semester</option>
            <option value="semester04"> 4 th Semester</option>
            <option value="semester05"> 5 th Semester</option>
            <option value="semester06"> 6 th Semester</option>
            <option value="semester07"> 7 th Semester</option>
            <option value="semester08"> 8 th Semester</option>
            <option value="final"> &emsp; &emsp; Final</option>
        </form:select>
        <button class="btn btn-success"  >Submit</button> 
        &emsp;
    </form:form>


    <center> <br/>
        <span class="btn btn-primary"> Result Input Form 
        </span>   </center><br/>


    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-6"> 
            <!--enctype="multipart/form-data"--> 

            <form:form action="${contextRoot}/result/submitmarks/${user.id}"  method="post" modelAttribute="resultObject"   >

                <form:label class=" form-group" path="studentId">Student ID : </form:label>
                    <div>
                    <form:input  class="form-control"  path="studentId" placeholder="Student ID" required="true" /> 
                </div>                 <br/>
                <form:label class=" form-group" path="dept_id">Department ID  : </form:label>
                    <div >
                    <form:input class="form-control"   path="dept_id" required="true" placeholder="Department ID"/> 
                </div>                 <br/>

                <form:label class=" form-group" path="subject_code">Subject Code : </form:label>
                    <div>
                    <form:input  class="form-control"  path="subject_code" placeholder="Subject  Code" required="true" /> 
                </div>                 <br/>



                <form:label class=" form-group" path="semester"> Select Semester  : </form:label>

                    <div>   
                    <form:select  class="form-control" path="semester" placeholder="Select">
                        <option  selected="true" disabled="true">Select Semester  </option>
                        <option value="semester01"> 1 st Semester</option>
                        <option value="semester02"> 2 nd Semester</option>
                        <option value="semester03"> 3 rd Semester</option>
                        <option value="semester04"> 4 th Semester</option>
                        <option value="semester05"> 5 th Semester</option>
                        <option value="semester06"> 6 th Semester</option>
                        <option value="semester07"> 7 th Semester</option>
                        <option value="semester08"> 8 th Semester</option>
                        <option value="final">&emsp;&emsp; Final</option>
                    </form:select>
                </div> 
                <br/>


                <form:label class=" form-group" path="marks"> Student Marks : </form:label>
                    <div >
                    <form:input class="form-control"  path="marks"  placeholder="Type Student Marks" required="true" /> </div> 
                <br/>
                <center>
                    <span>
                        <form:button type="submit" class="btn btn-primary ">Submit</form:button>
                        </span>
                    </center> 
                    <br/>
            </form:form>

        </div>


        <div class="col-md-3">

        </div>
    </div>


</c:if> 

<!--#######################-----RESULT UPDATE FORM------###########################################################-->

<c:if test="${resultUpdatePanel==true}"  > 


    <center> <br/>
        <span class="btn btn-primary"> Result Update Form 
        </span>   </center><br/>


    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-6"> 
            <!--enctype="multipart/form-data"--> 

            <form:form action="${contextRoot}/result/updateresult/${user.id}"  method="post" modelAttribute="resultObject"   >

                <form:label class=" form-group" path="id">Result ID : </form:label>
                    <div>
                    <form:input  class="form-control"  path="id" placeholder="Result ID"   required="true" readonly="true" /> 
                </div>                 <br/>
                <form:label class=" form-group" path="studentId">Student ID : </form:label>
                    <div>
                    <form:input  class="form-control"  path="studentId" placeholder="Student ID" required="true" /> 
                </div>                 <br/>
                <form:label class=" form-group" path="dept_id">Department ID  : </form:label>
                    <div >
                    <form:input class="form-control"   path="dept_id" required="true" placeholder="Department ID"/> 
                </div>                 <br/>

                <form:label class=" form-group" path="subject_code">Subject Code : </form:label>
                    <div>
                    <form:input  class="form-control"  path="subject_code" placeholder="Subject  Code" required="true" /> 
                </div>                 <br/>


                <form:label class=" form-group" path="semester"> Select Semester  :: ${resultObject.semester} </form:label>

                    <div>   
                    <form:select value="${resultObject.semester}"  class="form-control" path="semester" placeholder="Select">
                        <option  selected="true" disabled="true">Select Semester  </option>
                        <option value="semester01"> 1 st Semester</option>
                        <option value="semester02"> 2 nd Semester</option>
                        <option value="semester03"> 3 rd Semester</option>
                        <option value="semester04"> 4 th Semester</option>
                        <option value="semester05"> 5 th Semester</option>
                        <option value="semester06"> 6 th Semester</option>
                        <option value="semester07"> 7 th Semester</option>
                        <option value="semester08"> 8 th Semester</option>
                        <option value="final">&emsp;&emsp; Final</option>
                    </form:select>
                </div> 
                <br/>


                <form:label class=" form-group" path="marks"> Student Marks : </form:label>
                    <div >
                    <form:input class="form-control"  path="marks"  placeholder="Type Student Marks" required="true" /> </div> 
                <br/>
                <center>
                    <span>
                        <form:button type="submit" class="btn btn-primary ">Submit</form:button>
                        </span>
                    </center> 
                    <br/>
            </form:form>

        </div>


        <div class="col-md-3">

        </div>
    </div>


</c:if>

<!--#########################################################################################-->

<c:if test="${resultList != null}"> 

    <center>
        <br/>

        <span class="btn btn-primary">
            Result  Records 




        </span>
        <br/> <br/>
    </center> 

    <table id="count_it" style="width: 80%">

        <tr class="pro5" >
            <td class="pro5" style="width:5%; text-align: center"> ID    </td>
            <td class="pro5" style="width:15%; text-align: center">Student ID   </td>
            <td class="pro5" style="width:15%; text-align: center" > Department ID   </td>
            <td class="pro5" style="width:15%; text-align: center">Semester   </td>
            <td class="pro5" style=" text-align: center"> Subject Code   </td>
            <td class="pro5" style="width:10%; text-align: center"> Marks(CGPA)   </td>
            <td class="pro5" style="width:20%; text-align: center"  > Action     </td>

        </tr>            
        <c:forEach var="rl" items="${resultList}"> 



            <tr class="pro3">
                <td class="pro3" > ${rl.id}    </td>
                <td class="pro3" > ${rl.studentId}   </td>
                <td class="pro3" > ${rl.dept_id}    </td>
                <td class="pro3" > ${rl.semester}    </td>
                <td class="pro3" > ${rl.subject_code}    </td>
                <td class="pro3" > ${rl.marks}  </td>

                <td class="pro3" style="width:10%; padding-top: 5px; padding-bottom: 5px " > 


                    <form:form action="${contextRoot}/result/deletestudentresult/${user.id}" method="post" modelAttribute="resultObject" >
                        <a href="${contextRoot}/result/updateresult/${user.id}/${rl.id}" class="btn btn-primary"> Modify</a>
                        <form:input hidden="true" path="id" value="${rl.id}" ></form:input>
                        <form:input hidden="true" path="studentId" value="${rl.studentId}" ></form:input>
                        <form:input hidden="true" path="dept_id" value="${rl.dept_id}" ></form:input>
                        <form:input hidden="true" path="semester" value="${rl.semester}" ></form:input>
                        <form:input hidden="true" path="subject_code" value="${rl.subject_code}" ></form:input>
                            <button class="btn btn-primary"> Delete</button>
                    </form:form>
                </td>

            </tr>

        </c:forEach>
        <tr class="pro3">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td class="pro3" style="font-weight: bolder">Total CGPA</td>
            <td class="pro3" style="font-weight: bolder">${cgpa}</td>
            <td></td>
        </tr>
    </table>
</c:if> 




<c:if test="${allResultList != null}"> 

    <center>
        <br/>

        <span class="btn btn-primary">
            Result  Records 




        </span>
        <br/> <br/>
    </center> 

    <table id="count_it" style="width: 80%">

        <tr class="pro5" >
            <td class="pro5" style="width:5%; text-align: center"> ID    </td>
            <td class="pro5" style="width:15%; text-align: center">Student ID   </td>
            <td class="pro5" style="width:15%; text-align: center" > Department ID   </td>
            <td class="pro5" style="width:15%; text-align: center">Semester   </td>
            <td class="pro5" style="text-align: center"> Subject Code   </td>
            <td class="pro5" style="width:10%; text-align: center"> Marks(CGPA)   </td>
            <td class="pro5" style="width:20%; text-align: center"  > Action     </td>

        </tr>            
        <c:forEach var="rl" items="${allResultList}"> 



            <tr class="pro3">
                <td class="pro3" > ${rl.id}    </td>
                <td class="pro3" > ${rl.studentId}   </td>
                <td class="pro3" > ${rl.dept_id}    </td>
                <td class="pro3" > ${rl.semester}    </td>
                <td class="pro3" > ${rl.subject_code}    </td>
                <td class="pro3" > ${rl.marks}  </td>

                <td class="pro3" style="width:10%; padding-top: 5px; padding-bottom: 5px " > 
                    <a href="${contextRoot}/result/updateresult/${user.id}/${rl.id}" class="btn btn-primary"> Modify</a>
                    <a href="${contextRoot}/result/deleteresult/${user.id}/${rl.id}" class="btn btn-primary"> Delete</a>
                </td>

            </tr>

        </c:forEach>

    </table>
</c:if>

<c:if test="${resultReport==true}">
    <br/>

    <p class="btn btn-success ">Student ID : </p> &emsp; 
    <input id="studentId"   style="font-size:16pt ;padding-left: 10pt;font-weight:bolder ;height: 33px;background-color: #86cfda; color:black" type="number"/>
    &emsp; <p class= "btn btn-success ">Semester :</p>  &emsp;

    <select id="semester" style="text-align: center ;padding-left: 10px; width:175px ;height: 33px;background-color: #86cfda; color:black">
        <option value="null"> Select Semester</option>
        <option value="semester01"> 1 st Semester</option>
        <option value="semester02"> 2 nd Semester</option>
        <option value="semester03"> 3 rd Semester</option>   
        <option value="semester04"> 4 th Semester</option>
        <option value="semester05"> 5 th Semester</option>
        <option value="semester06"> 6 th Semester</option>
        <option value="semester07"> 7 th Semester</option>
        <option value="semester08"> 8 th Semester</option>
        <option value="final"     > &emsp;&emsp;     Final   </option>

    </select>
    &emsp;
    <button type="button" onclick="getResultReport()"  class="btn btn-success"> Submit</button>
<!--<button onclick="test()" class="btn btn-primary">Test</button>-->
  
<embed id="pdfResult" src="" type="application/pdf" width="80%" height="1200px" />  


</c:if>




