package com.clb.library.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@Column(name = "book_id")
	private int BookId;
	@Column(name = "book_name")
	private String BookName;
	@Column(name = "book_author")
	private String BookAuthor;
	@Column(name = "book_price")
	private double BookPrice;

	@ManyToOne
	private Admin admin;

}
