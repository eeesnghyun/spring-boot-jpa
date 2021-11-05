package com.example.demo.board.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Entity(name="board")
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long boardno;
	
	@Column(nullable = false, length = 50)
	private String title;
	
	@Column(nullable = false, length = 500)
	private String content;
	
	public Board(String title, String content) {
		this.title   = title;
		this.content = content;
	}
	
}
