document.addEventListener('DOMContentLoaded', function () {
   console.log("자스로드")

   const loginBtn = document.querySelector(".login-button");
   const registerLink = document.querySelector(".register-link")

   // 플라스크 이동
   loginBtn.addEventListener("click", () => {
       console.log("로그인")
       window.location.href = '/show-flask-page';
   });

   // 닉네임 설정하러 이동
   registerLink.addEventListener("click", () => {
         console.log("회원가입")
          window.location.href = '/set-nickname';
      });
});