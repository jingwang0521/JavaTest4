package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class FilmServiceImpl implements FilmService {


	@Autowired
	private FilmMapper filmMapper;

	@Transactional(rollbackFor = SQLException.class)
	public void insert(FilmE filmE) throws SQLException {

		try {
			int re = filmMapper.insert(filmE);
			if (re != 0) {
				System.out.println("插入一条成功");
			}

		} catch (Exception e) {
			System.out.println("回滚");

		}
	}
}
