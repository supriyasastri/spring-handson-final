package org.springmvc.controller;

import org.springmvc.model.BookInfo;
import org.springmvc.model.UserBookInfo;
import org.springmvc.service.BookInfoService;

import org.springmvc.service.UserBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookInfoController {

    @Autowired
    public BookInfoService bookInfoService;

    @Autowired
    public UserBookInfoService userBookInfoService;

    @RequestMapping(value = "/myBookInfo", method = RequestMethod.GET)
    public ModelAndView showRegister() {
        ModelAndView mav = new ModelAndView("bookInfo");
        mav.addObject("bookInfo", new BookInfo());
        return mav;
    }

    @RequestMapping(value = "/saveUserBookInfo", method = RequestMethod.POST)
    public ModelAndView addBookInfo(@ModelAttribute("bookInfo") BookInfo bookInfo) {
        bookInfoService.save(bookInfo);
        final UserBookInfo userBookInfo = getUserBookInfo(bookInfo.getUsername());
        ModelAndView mav = new ModelAndView("userbookinfo");
        mav.addObject("firstName", userBookInfo.getFirstName());
        mav.addObject("lastName", userBookInfo.getLastName());
        mav.addObject("bookName", userBookInfo.getBookName());
        mav.addObject("bookDescription", userBookInfo.getBookDescription());
        return mav;
    }

    private UserBookInfo getUserBookInfo(final String username) {
        if(username != null) {
            return userBookInfoService.getUserBookDetails(username);
        }
        return null;
    }
}
