document.addEventListener('DOMContentLoaded', function () {

   const goIcon = document.getElementById("go-icon");

   // 닉네임 저장, 아이콘 화면 가기
   goIcon.addEventListener("click", () => {
       const username = document.getElementById("nickname").value;
       fetch(`/go-icon?username=${encodeURIComponent(username)}`, {
           method: "POST",
       })
       .then(response => response.text()) // 응답을 텍스트로 처리
       .then(data => {
           console.log("서버 응답:", data);
           window.location.href = '/go-icon'; // 페이지 이동
       })
       .catch((error) => {
           console.error("Error:", error);
       });
   });
});