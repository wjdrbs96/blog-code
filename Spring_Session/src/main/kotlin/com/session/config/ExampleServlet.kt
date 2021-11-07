package com.session.config

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * created by Gyunny 2021/10/20
 */
class ExampleServlet : HttpServlet() {

    private lateinit var thisIsNOTThreadSafe: Any //쓰레드에 안전하지 않은 변수

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val thisIsThreadSafe: Any  // 쓰레드에 안전한 지역변수
        thisIsNOTThreadSafe = req!!.getParameter("foo");   // BAD!! 모든 request가 공유합니다.
        thisIsThreadSafe = req.getParameter("foo");      // OK, 이건 쓰레드에 안전합니다.
    }
}