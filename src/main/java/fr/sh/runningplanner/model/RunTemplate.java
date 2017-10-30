package fr.sh.runningplanner.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "runtemplate")
public class RunTemplate implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 
	@Column(name = "timewarmup")
	private int timewarmup;

	@Column(name = "timeminrun")
	private int timeminrun;
	
	@Column(name = "timesecrun")
	private int timesecrun;
	
	@Column(name = "nblap")
	private int nblap;
	
	@Column(name = "timeminrecov")
	private int timeminrecov;
	
	@Column(name = "timesecrecov")
	private int timesecrecov;
	
	@Column(name = "nbrepeat")
	private int nbrepeat;
	
	@Column(name = "timeinterseries")
	private int timeinterseries;

	@Column(name = "timefinalrecov")
	private int timefinalrecov;

	@Column(name = "label")
	private String label;
	
	protected RunTemplate() {
	}
 
	public RunTemplate(int id, int timewarmup, int timeminrun, int timesecrun, int nblap, int timeminrecov,
			int timesecrecov, int nbrepeat, int timeinterseries, int timefinalrecov, String label) {
		super();
		this.id = id;
		this.timewarmup = timewarmup;
		this.timeminrun = timeminrun;
		this.timesecrun = timesecrun;
		this.nblap = nblap;
		this.timeminrecov = timeminrecov;
		this.timesecrecov = timesecrecov;
		this.nbrepeat = nbrepeat;
		this.timeinterseries = timeinterseries;
		this.timefinalrecov = timefinalrecov;
		this.label = label;
	}
	
	@Override
	public String toString() {
		return String.format("RunTemplate[id=%d, label='%s']",id,this.label);
	}
	/*@Override
	public String toString() {
		return String.format("Template[id=%d, this.timewarmup=%d, this.timeminrun=%d, this.timesecrun=%d, this.nblap=%d,this.timeminrecov,\r\n" + 
				"				this.timesecrecov, \r\n" + 
				"				this.nbrepeat, \r\n" + 
				"				this.timeinterseries,\r\n" + 
				"				this.timefinalrecov,\r\n" + 
				"				this.labelfirstName='%s', lastName='%s']", id, 
				this.timewarmup, 
				this.timeminrun,
				this.timesecrun,
				this.nblap,
				this.timeminrecov,
				this.timesecrecov, 
				this.nbrepeat, 
				this.timeinterseries,
				this.timefinalrecov,
				this.label);
	}*/
}
