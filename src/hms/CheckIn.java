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
@Table(name = "check_in", catalog = "hms", schema = "")
@NamedQueries({
    @NamedQuery(name = "CheckIn.findAll", query = "SELECT c FROM CheckIn c"),
    @NamedQuery(name = "CheckIn.findByRoomNo", query = "SELECT c FROM CheckIn c WHERE c.roomNo = :roomNo"),
    @NamedQuery(name = "CheckIn.findByGuestID", query = "SELECT c FROM CheckIn c WHERE c.guestID = :guestID"),
    @NamedQuery(name = "CheckIn.findByGuestName", query = "SELECT c FROM CheckIn c WHERE c.guestName = :guestName"),
    @NamedQuery(name = "CheckIn.findByDateIn", query = "SELECT c FROM CheckIn c WHERE c.dateIn = :dateIn"),
    @NamedQuery(name = "CheckIn.findByDateOut", query = "SELECT c FROM CheckIn c WHERE c.dateOut = :dateOut")})
public class CheckIn implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "RoomNo")
    private int roomNo;
    @Id
    @Basic(optional = false)
    @Column(name = "GuestID")
    private String guestID;
    @Basic(optional = false)
    @Column(name = "GuestName")
    private String guestName;
    @Basic(optional = false)
    @Column(name = "DateIn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIn;
    @Basic(optional = false)
    @Column(name = "DateOut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOut;

    public CheckIn() {
    }

    public CheckIn(String guestID) {
        this.guestID = guestID;
    }

    public CheckIn(String guestID, int roomNo, String guestName, Date dateIn, Date dateOut) {
        this.guestID = guestID;
        this.roomNo = roomNo;
        this.guestName = guestName;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        int oldRoomNo = this.roomNo;
        this.roomNo = roomNo;
        changeSupport.firePropertyChange("roomNo", oldRoomNo, roomNo);
    }

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        String oldGuestID = this.guestID;
        this.guestID = guestID;
        changeSupport.firePropertyChange("guestID", oldGuestID, guestID);
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        String oldGuestName = this.guestName;
        this.guestName = guestName;
        changeSupport.firePropertyChange("guestName", oldGuestName, guestName);
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        Date oldDateIn = this.dateIn;
        this.dateIn = dateIn;
        changeSupport.firePropertyChange("dateIn", oldDateIn, dateIn);
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        Date oldDateOut = this.dateOut;
        this.dateOut = dateOut;
        changeSupport.firePropertyChange("dateOut", oldDateOut, dateOut);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestID != null ? guestID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CheckIn)) {
            return false;
        }
        CheckIn other = (CheckIn) object;
        if ((this.guestID == null && other.guestID != null) || (this.guestID != null && !this.guestID.equals(other.guestID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hms.CheckIn[ guestID=" + guestID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
