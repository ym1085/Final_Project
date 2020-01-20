package com.fp.delight.ann.model;

import java.util.List;

public interface AnnDAO {
	int annInsert(AnnVO annVo);
	List<AnnVO> annList(AnnVO annVo);
	int normalTotal(AnnVO annVo);
	List<AnnVO> eventSearch(AnnVO annVo);
	int eventTotal(AnnVO annVo);
	int normalDel(int annSeq);
	int annExposure(int annSeq);
	
}
