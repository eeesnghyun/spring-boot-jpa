package com.example.demo.board.entity;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.board.entity.Board;
import com.example.demo.board.entity.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	public void postAdd() throws Exception {
		String title = "테스트 제목2";
		String content = "안녕하세요2";
		
		boardRepository.save(Board.builder()
				.title(title)
				.content(content)
				.build());
		
		List<Board> list = boardRepository.findAll();
		Board board = list.get(0);
		
		assertThat(board.getTitle()).isEqualTo(title);
		assertThat(board.getContent()).isEqualTo(content);
	}
	
}
