package org.idb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sound.midi.Sequencer;


@Entity
@Table
public class Result implements Serializable{
 
    @Id
    int id;
    int studentId;
    String dept_id;
    String subject_code;
    String semester;
    Double marks;

    public Result() {
    }

    public Result(int id, int studentId, String dept_id, String subject_code, String semester, Double marks) {
        this.id = id;
        this.studentId = studentId;
        this.dept_id = dept_id;
        this.subject_code = subject_code;
        this.semester = semester;
        this.marks = marks;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Result {" + "id=" + id + ", studentId=" + studentId + ", dept_id=" + dept_id + ", subject_code=" + subject_code + ", semester=" + semester + ", marks=" + marks + '}';
    }



}

