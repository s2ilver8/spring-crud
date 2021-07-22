package com.example.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.board.dto.BoardDto;
import com.example.board.form.BoardForm;

@Repository
public class BoardDao {

	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.example.board.boardMapper";
	
	// 목록 수
	public int getBoardCount(BoardForm boardForm) throws Exception {		
        return sqlSession.selectOne(NAMESPACE + ".getBoardCount", boardForm);
    }
	
	// 목록 조회
	public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE + ".getBoardList", boardForm);
	}
	
	// 조회 수 수정
	public int updateBoardHits(BoardForm boardForm) throws Exception {
        
        return sqlSession.update(NAMESPACE + ".updateBoardHits", boardForm);
    }
	
	// 상세 조회
    public BoardDto getBoardDetail(BoardForm boardForm) throws Exception {
        
        return sqlSession.selectOne(NAMESPACE + ".getBoardDetail", boardForm);
    }
	
	// 등록
    public int insertBoard(BoardForm boardForm) throws Exception {
        return sqlSession.insert(NAMESPACE + ".insertBoard", boardForm);
    }
    
    // 트랜잭션 테스트(등록 실패) 
    public int insertBoardFail(BoardForm boardForm) throws Exception {
        return sqlSession.insert(NAMESPACE + ".insertBoardFail", boardForm);
    }
	
	// 삭제
    public int deleteBoard(BoardForm boardForm) throws Exception {
        
        return sqlSession.delete(NAMESPACE + ".deleteBoard", boardForm);
    }
	
	// 수정
    public int updateBoard(BoardForm boardForm) throws Exception {
        
        return sqlSession.update(NAMESPACE + ".updateBoard", boardForm);
    }
    
}
