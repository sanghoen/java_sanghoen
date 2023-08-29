package kr.kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kh.spring.service.MemberService;
import kr.kh.spring.util.Message;
import kr.kh.spring.vo.MemberVO;

@Controller
public class MemberController {
	
	// = private MemberService memberService = new MemberserviceImp; 
	@Autowired
	private MemberService memberService;
	
	//@RequestMapping - url을 찾아줌. 핸들러 맵핑에 sighup을 등록.
	@RequestMapping(value="/member/signup", method=RequestMethod.GET)
	public String signup() { //sighup을 찾아서 호출
		
		return "member/signup"; //뷰 리졸버가 리턴값이 멤버 사인업인 값을 반환
	}							//디스패쳐가 전달받음
	
	@RequestMapping(value="/member/signup", method=RequestMethod.POST)
	public String signupPost(MemberVO member, Model model) { 
		Message msg = new Message("/member/signup", "회원 가입에 실패했습니다.");

		if(memberService.signup(member)) {
			msg = new Message("/","회원 가입에 성공했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message"; 
	}	
	@GetMapping(value="/member/login")
	public String memberLogin() {
		return "member/login";
	}
	@PostMapping(value="/member/login")
	public String memberLoginPost(MemberVO member, Model model) {
		Message msg = new Message("/member/login", "로그인에 실패했습니다.");
		
		MemberVO user = memberService.login(member);
		if(user != null) {
			msg = new Message("/", "로그인에 성공했습니다.");
		}
		model.addAttribute("user", user);
		model.addAttribute("msg", msg);
		return "message";
	}
	@GetMapping("/member/logout")
	public String memberLogout(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)session.getAttribute("user");
		Message msg = new Message("/", null);
		if(user != null) {
			session.removeAttribute("user");
			msg.setMsg("로그아웃에 성공했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message";
	}
	
}











