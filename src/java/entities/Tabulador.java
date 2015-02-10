/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juan.calderon
 */
@Entity
@Table(name = "tabulador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tabulador.findAll", query = "SELECT t FROM Tabulador t"),
    @NamedQuery(name = "Tabulador.findById", query = "SELECT t FROM Tabulador t WHERE t.id = :id"),
    @NamedQuery(name = "Tabulador.findByCode", query = "SELECT t FROM Tabulador t WHERE t.code = :code"),
    @NamedQuery(name = "Tabulador.findByName", query = "SELECT t FROM Tabulador t WHERE t.name = :name")})
public class Tabulador implements Serializable {
//    @OneToMany(mappedBy = "idTabulador")
//    private Collection<Empleado> empleadoCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "code")
    private String code;
    @Size(max = 100)
    @Column(name = "name")
    private String name;

    public Tabulador() {
    }

    public Tabulador(Integer id) {
        this.id = id;
    }

    public Tabulador(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabulador)) {
            return false;
        }
        Tabulador other = (Tabulador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tabulador[ id=" + id + " ]";
    }

//    @XmlTransient
//    public Collection<Empleado> getEmpleadoCollection() {
//        return empleadoCollection;
//    }
//
//    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
//        this.empleadoCollection = empleadoCollection;
//    }
    
}
