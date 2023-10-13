package com.gdu.myapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdu.myapp.dto.NoticeDTO;
import com.gdu.myapp.service.NoticeService;

@RestController
@RequestMapping("/notices")
public class NoticeController {
    private final NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @PostMapping
    public void createNotice(@RequestBody NoticeDTO notice) {
        noticeService.createNotice(notice);
    }

    @GetMapping("/{no}")
    public NoticeDTO getNotice(@PathVariable int no) {
        return noticeService.getNoticeById(no);
    }

    @GetMapping
    public List<NoticeDTO> getAllNotices() {
        return noticeService.getAllNotices();
    }

    @PutMapping
    public void updateNotice(@RequestBody NoticeDTO notice) {
        noticeService.updateNotice(notice);
    }

    @DeleteMapping("/{no}")
    public void deleteNotice(@PathVariable int no) {
        noticeService.deleteNotice(no);
    }
}