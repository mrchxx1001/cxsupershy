document.addEventListener('DOMContentLoaded', function () {
   console.log("자스로드");

   const previousPage = () => {
        window.location.href = '/';
   };

   const nextPage = () => {
        window.location.href = '/select-profile-icon';
//           const username = document.querySelector("div>input").value
//           console.log("")
//           fetch(`/save-nickname?username=${encodeURIComponent(username)}`, {
//                      method: "POST",
//                  })
//           .then(response => response.text()) // 응답을 텍스트로 처리
//           .then(data => {
//                      console.log("서버 응답:", data);
//                      window.location.href = '/select-profile-icon';
//           })
//           .catch((error) => {
//                      console.error("Error:", error);
//           });
   };

   document.querySelector(".previous").addEventListener("click", previousPage);
   document.querySelector(".next").addEventListener("click", nextPage);

});