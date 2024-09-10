document.addEventListener('DOMContentLoaded', function () {

   const goNickname = document.getElementById("go-nickname");

   //닉네임 화면 반환
   goNickname.addEventListener("click", () => {
       window.location.href = '/go-nickname';
   });
});