package com.example.demo.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.entity.Board;
import com.example.demo.board.entity.BoardRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private final BoardRepository boardRepository;
	
	@GetMapping("list")
	public List<Board> findAllBoard() {
		return boardRepository.findAll();
	}
	
	@PostMapping("new")
	public Board newContents() { 
		final Board board = Board.builder()
				.title("TEST 제목")
				.content("TEST 내용")
				.build();
		return boardRepository.save(board);
	}
	
}