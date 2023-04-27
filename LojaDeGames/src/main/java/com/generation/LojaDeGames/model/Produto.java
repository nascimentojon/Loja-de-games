package com.generation.LojaDeGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


	@Entity
	@Table(name = "tb_produtos")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		@ManyToOne
		@JsonIgnoreProperties("produto")
		
		private Categoria categoria;

		
		@NotBlank(message = "A descrição do produto é obirgatória!") 
		@Size(min = 5, max = 255, message = "A descrição deve conter no mínimo 05 e no máximo 255 caracteres")
		private String genero; 
		@Size(min = 5, max = 255, message = "A plataforma deve conter no mínimo 05 e no máximo 255 caracteres")
		private String console;
		@Size(min = 5, max = 255, message = "A plataforma deve conter no mínimo 05 e no máximo 255 caracteres")
		private String jogo;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getConsole() {
			return console;
		}
		public void setConsole(String console) {
			this.console = console;
		}
		public String getJogo() {
			return jogo;
		}
		public void setJogo(String jogo) {
			this.jogo = jogo;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
		
}
	
