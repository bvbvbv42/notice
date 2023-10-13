package com.gdu.myapp.service;

import java.util.List;

import com.gdu.myapp.dao.NoticeDAO;
import com.gdu.myapp.dto.NoticeDTO;

public class NoticeService {
    private NoticeDAO noticeDAO;

    public void createNotice(NoticeDTO notice) {
        noticeDAO.createNotice(notice);
    }

    public NoticeDTO getNoticeById(int no) {
        return noticeDAO.getNoticeById(no);
    }

    public List<NoticeDTO> getAllNotices() {
        return noticeDAO.getAllNotices();
    }

    public void updateNotice(NoticeDTO notice) {
        noticeDAO.updateNotice(notice);
    }

    public void deleteNotice(int id) {
        noticeDAO.deleteNotice(id);
    }
}

