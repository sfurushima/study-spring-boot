package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// ���̃A�m�e�[�V���������邱�ƂŁASpring�ɂ��̃N���X��Controller���ƒ�`����
@Controller
public class IndexController {

    // GET�̃g�b�v�y�[�W�ƕR�Â������̂�GET�}�b�s���O���s��
    @GetMapping
    // Response Body��t�^���邱�ƂŁA�߂�l�̕���String�ɒ�`���邱�Ƃ��ł���
    @ResponseBody
    public String index() {
        return "<h1>Hello World!!</h1>";
    }
}
