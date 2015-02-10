/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juan.calderon
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findById", query = "SELECT e FROM Empleado e WHERE e.id = :id"),
    @NamedQuery(name = "Empleado.findByCode", query = "SELECT e FROM Empleado e WHERE e.code = :code"),
    @NamedQuery(name = "Empleado.findByConsecutivo", query = "SELECT e FROM Empleado e WHERE e.consecutivo = :consecutivo"),
    @NamedQuery(name = "Empleado.findByStatus", query = "SELECT e FROM Empleado e WHERE e.status = :status"),
    @NamedQuery(name = "Empleado.findByCurp", query = "SELECT e FROM Empleado e WHERE e.curp = :curp"),
    @NamedQuery(name = "Empleado.findByRfc", query = "SELECT e FROM Empleado e WHERE e.rfc = :rfc"),
    @NamedQuery(name = "Empleado.findByImss", query = "SELECT e FROM Empleado e WHERE e.imss = :imss"),
    @NamedQuery(name = "Empleado.findByIdProyecto", query = "SELECT e FROM Empleado e WHERE e.idProyecto = :idProyecto"),
    @NamedQuery(name = "Empleado.findByCuentaBanco", query = "SELECT e FROM Empleado e WHERE e.cuentaBanco = :cuentaBanco"),
    @NamedQuery(name = "Empleado.findByUrlPhoto", query = "SELECT e FROM Empleado e WHERE e.urlPhoto = :urlPhoto"),
    @NamedQuery(name = "Empleado.findByName", query = "SELECT e FROM Empleado e WHERE e.name = :name"),
    @NamedQuery(name = "Empleado.findByApellidoPaterno", query = "SELECT e FROM Empleado e WHERE e.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Empleado.findByApellidoMaterno", query = "SELECT e FROM Empleado e WHERE e.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Empleado.findByNombre", query = "SELECT e FROM Empleado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleado.findByIdClinica", query = "SELECT e FROM Empleado e WHERE e.idClinica = :idClinica"),
    @NamedQuery(name = "Empleado.findByHasCredito", query = "SELECT e FROM Empleado e WHERE e.hasCredito = :hasCredito"),
    @NamedQuery(name = "Empleado.findByNumCredito", query = "SELECT e FROM Empleado e WHERE e.numCredito = :numCredito"),
    @NamedQuery(name = "Empleado.findByCuentaCimav", query = "SELECT e FROM Empleado e WHERE e.cuentaCimav = :cuentaCimav"),
    @NamedQuery(name = "Empleado.findByIdBanco", query = "SELECT e FROM Empleado e WHERE e.idBanco = :idBanco"),
    @NamedQuery(name = "Empleado.findByIdSede", query = "SELECT e FROM Empleado e WHERE e.idSede = :idSede"),
    @NamedQuery(name = "Empleado.findByIdTipoEmpleado", query = "SELECT e FROM Empleado e WHERE e.idTipoEmpleado = :idTipoEmpleado"),
    @NamedQuery(name = "Empleado.findByIdTipoContrato", query = "SELECT e FROM Empleado e WHERE e.idTipoContrato = :idTipoContrato"),
    @NamedQuery(name = "Empleado.findByFechaIngreso", query = "SELECT e FROM Empleado e WHERE e.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Empleado.findByFechaInicioContrato", query = "SELECT e FROM Empleado e WHERE e.fechaInicioContrato = :fechaInicioContrato"),
    @NamedQuery(name = "Empleado.findByFechaFinContrato", query = "SELECT e FROM Empleado e WHERE e.fechaFinContrato = :fechaFinContrato"),
    @NamedQuery(name = "Empleado.findByFechaBaja", query = "SELECT e FROM Empleado e WHERE e.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Empleado.findByIdTipoAntiguedad", query = "SELECT e FROM Empleado e WHERE e.idTipoAntiguedad = :idTipoAntiguedad"),
    @NamedQuery(name = "Empleado.findByFechaAntiguedad", query = "SELECT e FROM Empleado e WHERE e.fechaAntiguedad = :fechaAntiguedad"),
    @NamedQuery(name = "Empleado.findByIdTipoSni", query = "SELECT e FROM Empleado e WHERE e.idTipoSni = :idTipoSni"),
    @NamedQuery(name = "Empleado.findByNumSni", query = "SELECT e FROM Empleado e WHERE e.numSni = :numSni"),
    @NamedQuery(name = "Empleado.findByFechaSni", query = "SELECT e FROM Empleado e WHERE e.fechaSni = :fechaSni")})
public class Empleado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Size(max = 5)
    @Column(name = "code")
    private String code;
    
    @Column(name = "consecutivo")
    private Integer consecutivo;
    
    @Column(name = "status")
    private Short status;
    
    @Size(max = 100)
    @Column(name = "curp")
    private String curp;
    
    @Size(max = 50)
    @Column(name = "rfc")
    private String rfc;
    
    @Size(max = 100)
    @Column(name = "imss")
    private String imss;
    
    @Column(name = "id_proyecto")
    private Short idProyecto;
    
    @Size(max = 40)
    @Column(name = "cuenta_banco")
    private String cuentaBanco;
    
    @Size(max = 300)
    @Column(name = "url_photo")
    private String urlPhoto;
    
    @Size(max = 40)
    @Column(name = "name")
    private String name;
    
    @Size(max = 40)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Size(max = 40)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    
    @Size(max = 40)
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "id_clinica")
    private Integer idClinica;
    
    @Column(name = "has_credito")
    private Boolean hasCredito;
    
    @Size(max = 30)
    @Column(name = "num_credito")
    private String numCredito;
    
    @Size(max = 60)
    @Column(name = "cuenta_cimav")
    private String cuentaCimav;
    
    @Column(name = "id_banco")
    private Short idBanco;
    
    @Column(name = "id_sede")
    private Short idSede;
    
    @Column(name = "id_tipo_empleado")
    private Short idTipoEmpleado;
    
    @Column(name = "id_tipo_contrato")
    private Short idTipoContrato;
    
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    
    @Column(name = "fecha_inicio_contrato")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioContrato;
    
    @Column(name = "fecha_fin_contrato")
    @Temporal(TemporalType.DATE)
    private Date fechaFinContrato;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    
    @Column(name = "id_tipo_antiguedad")
    private Short idTipoAntiguedad;
    
    @Column(name = "fecha_antiguedad")
    @Temporal(TemporalType.DATE)
    private Date fechaAntiguedad;
    
    @Column(name = "id_tipo_sni")
    private Short idTipoSni;
    
    @Size(max = 30)
    @Column(name = "num_sni")
    private String numSni;
    
    @Column(name = "fecha_sni")
    @Temporal(TemporalType.DATE)
    private Date fechaSni;

    @XmlElement(name = "tabulador")
    @JoinColumn(name = "id_tabulador", referencedColumnName = "id")
    @ManyToOne
    private Tabulador idTabulador;
    
    @XmlElement(name = "grupo")
    @JoinColumn(name = "id_grupo", referencedColumnName = "id")
    @ManyToOne
    private Grupo idGrupo;
    
    @XmlElement(name = "departamento")
    @JoinColumn(name = "id_departamento", referencedColumnName = "id")
    @ManyToOne
    private Departamento idDepartamento;

    public Empleado() {
    }

    public Empleado(Integer id) {
        this.id = id;
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

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getImss() {
        return imss;
    }

    public void setImss(String imss) {
        this.imss = imss;
    }

    public Short getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Short idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getCuentaBanco() {
        return cuentaBanco;
    }

    public void setCuentaBanco(String cuentaBanco) {
        this.cuentaBanco = cuentaBanco;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Integer idClinica) {
        this.idClinica = idClinica;
    }

    public Boolean getHasCredito() {
        return hasCredito;
    }

    public void setHasCredito(Boolean hasCredito) {
        this.hasCredito = hasCredito;
    }

    public String getNumCredito() {
        return numCredito;
    }

    public void setNumCredito(String numCredito) {
        this.numCredito = numCredito;
    }

    public String getCuentaCimav() {
        return cuentaCimav;
    }

    public void setCuentaCimav(String cuentaCimav) {
        this.cuentaCimav = cuentaCimav;
    }

    public Short getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Short idBanco) {
        this.idBanco = idBanco;
    }

    public Short getIdSede() {
        return idSede;
    }

    public void setIdSede(Short idSede) {
        this.idSede = idSede;
    }

    public Short getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(Short idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public Short getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Short idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Short getIdTipoAntiguedad() {
        return idTipoAntiguedad;
    }

    public void setIdTipoAntiguedad(Short idTipoAntiguedad) {
        this.idTipoAntiguedad = idTipoAntiguedad;
    }

    public Date getFechaAntiguedad() {
        return fechaAntiguedad;
    }

    public void setFechaAntiguedad(Date fechaAntiguedad) {
        this.fechaAntiguedad = fechaAntiguedad;
    }

    public Short getIdTipoSni() {
        return idTipoSni;
    }

    public void setIdTipoSni(Short idTipoSni) {
        this.idTipoSni = idTipoSni;
    }

    public String getNumSni() {
        return numSni;
    }

    public void setNumSni(String numSni) {
        this.numSni = numSni;
    }

    public Date getFechaSni() {
        return fechaSni;
    }

    public void setFechaSni(Date fechaSni) {
        this.fechaSni = fechaSni;
    }

    public Tabulador getIdTabulador() {
        return idTabulador;
    }

    public void setIdTabulador(Tabulador idTabulador) {
        this.idTabulador = idTabulador;
    }

    public Grupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Grupo idGrupo) {
        this.idGrupo = idGrupo;
    }

//    public Empleado getIdJefe() {
//        return idJefe;
//    }
//
//    public void setIdJefe(Empleado idJefe) {
//        this.idJefe = idJefe;
//    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
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
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Empleado[ id=" + id + " ]";
    }

}
