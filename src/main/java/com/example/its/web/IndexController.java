package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// ���̃A�m�e�[�V���������邱�ƂŁASpring�ɂ��̃N���X��Controller���ƒ�`����
@Controller
public class IndexController {

    // GET�̃g�b�v�y�[�W�ƕR�Â������̂�GET�}�b�s���O���s��
    @GetMapping
    public String index() {
        // JSP���Ɗg���q���L�ڂ��Ă������ASpring MVC���g���q��ۊǂ��A�r���[�y�[�W��\�����邽�ߊg���q�͕s�v
        return "index";
    }
}
