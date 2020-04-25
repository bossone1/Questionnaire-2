package com.computer.network.service;

import com.computer.network.vo.PaperVO;
import com.computer.network.vo.ResponseVO;

public interface PaperService {

    ResponseVO addPaper(PaperVO paperVO);

    ResponseVO updatePaper(PaperVO paperVO);

    ResponseVO invalidatePaper(int paperId);

    ResponseVO getUserPapers(int userId);
}
