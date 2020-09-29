<<<<<<< HEAD

=======
>>>>>>> 7619d62... first commit
package org.idb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="department")
public class Department {
   
    @Id
    @Column(name="id") 
    private int id;
    @Column(name="dept_name")
=======
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

>>>>>>> 7619d62... first commit
    private String dept_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

<<<<<<< HEAD
    
    
    
=======
>>>>>>> 7619d62... first commit
    public Department() {
    }

    public Department(int id, String dept_name) {
        this.id = id;
        this.dept_name = dept_name;
    }
<<<<<<< HEAD
    
    
=======

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", dept_name=" + dept_name + '}';
    }

>>>>>>> 7619d62... first commit
}
