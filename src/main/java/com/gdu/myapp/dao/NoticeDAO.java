package com.gdu.myapp.dao;

import java.util.List;

import com.gdu.myapp.dto.NoticeDTO;

public interface NoticeDAO {
    void createNotice(NoticeDTO notice);
    NoticeDTO getNoticeById(int no);
    List<NoticeDTO> getAllNotices();
    void updateNotice(NoticeDTO notice);
    void deleteNotice(int no);
}
