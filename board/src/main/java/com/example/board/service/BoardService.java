package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dao.BoardDao;
import com.example.board.dto.BoardDto;
import com.example.board.form.BoardForm;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	// ��� ��ȸ
	public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.getBoardList(boardForm);
	}
	
	// �� ��ȸ
	public BoardDto getBoardDetail(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		BoardDto boardDto = new BoardDto();
		 
        String searchType = boardForm.getSearch_type();
 
        if("S".equals(searchType)){
            
            int updateCnt = boardDao.updateBoardHits(boardForm);
        
            if (updateCnt > 0) {
                boardDto = boardDao.getBoardDetail(boardForm);
            }
            
        } else {
            
            boardDto = boardDao.getBoardDetail(boardForm);
        }
        
		return boardDto;
	}
	
	// ���
	public BoardDto insertBoard(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		BoardDto boardDto = new BoardDto();
		 
        int insertCnt = boardDao.insertBoard(boardForm);
 
        if (insertCnt > 0) {
            boardDto.setResult("SUCCESS");
        } else {
            boardDto.setResult("FAIL");
        }
 
        return boardDto;
	}
	
	// ����
	public BoardDto deleteBoard(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		BoardDto boardDto = new BoardDto();
		 
        int deleteCnt = boardDao.deleteBoard(boardForm);
 
        if (deleteCnt > 0) {
            boardDto.setResult("SUCCESS");
        } else {
            boardDto.setResult("FAIL");
        }
 
        return boardDto;
	}
	
	// ����
	public BoardDto updateBoard(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		BoardDto boardDto = new BoardDto();
		 
        int updateCnt = boardDao.updateBoard(boardForm);
 
        if (updateCnt > 0) {
            boardDto.setResult("SUCCESS");
        } else {
            boardDto.setResult("FAIL");
        }
 
        return boardDto;
	}

}
