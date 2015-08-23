/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Samitha
 */
@Entity
@Table(name = "reg", catalog = "hms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reg.findAll", query = "SELECT r FROM Reg r"),
    @NamedQuery(name = "Reg.findByUserName", query = "SELECT r FROM Reg r WHERE r.userName = :userName"),
    @NamedQuery(name = "Reg.findByUserType", query = "SELECT r FROM Reg r WHERE r.userType = :userType"),
    @NamedQuery(name = "Reg.findByPassword", query = "SELECT r FROM Reg r WHERE r.password = :password"),
    @NamedQuery(name = "Reg.findByFullName", query = "SELECT r FROM Reg r WHERE r.fullName = :fullName"),
    @NamedQuery(name = "Reg.findByContactNo", query = "SELECT r FROM Reg r WHERE r.contactNo = :contactNo"),
    @NamedQuery(name = "Reg.findByEmail", query = "SELECT r FROM Reg r WHERE r.email = :email"),
    @NamedQuery(name = "Reg.findByRegisteredDate", query = "SELECT r FROM Reg r WHERE r.registeredDate = :registeredDate")})
public class Reg implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @Column(name = "UserType")
    private String userType;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private int contactNo;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "RegisteredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredDate;

    public Reg() {
    }

    public Reg(String userName) {
        this.userName = userName;
    }

    public Reg(String userName, String userType, String password, String fullName, int contactNo, String email, Date registeredDate) {
        this.userName = userName;
        this.userType = userType;
        this.password = password;
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.email = email;
        this.registeredDate = registeredDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        String oldUserName = this.userName;
        this.userName = userName;
        changeSupport.firePropertyChange("userName", oldUserName, userName);
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        String oldUserType = this.userType;
        this.userType = userType;
        changeSupport.firePropertyChange("userType", oldUserType, userType);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        int oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        Date oldRegisteredDate = this.registeredDate;
        this.registeredDate = registeredDate;
        changeSupport.firePropertyChange("registeredDate", oldRegisteredDate, registeredDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reg)) {
            return false;
        }
        Reg other = (Reg) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hms.Reg[ userName=" + userName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
