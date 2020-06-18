package br.com.alloy.cadastrodvdapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dvd")
public class Dvd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="TITULO")
	private String titulo;
	@Column(name="COD_BARRAS")
	private String codBarras;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the codBarras
	 */
	public String getCodBarras() {
		return codBarras;
	}
	/**
	 * @param codBarras the codBarras to set
	 */
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	
}
