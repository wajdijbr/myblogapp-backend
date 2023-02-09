
package com.blog.demo.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts implements Serializable {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPost;
	private String nomPost;
	private String titlePost;
	private String urlPost;
	@Column(columnDefinition = "TEXT")

	private String imgPost;
	private String Sub1;

	@Column(columnDefinition = "TEXT")
	private String parag1;
	private String Sub2;

	@Column(columnDefinition = "TEXT")
	private String parag2;
	private String Sub3;

	@Column(columnDefinition = "TEXT")
	private String parag3;
	private String Sub4;

	@Column(columnDefinition = "TEXT")
	private String parag4;
	private Date date;
	@OneToMany
	private List<Comment> comments;

}
