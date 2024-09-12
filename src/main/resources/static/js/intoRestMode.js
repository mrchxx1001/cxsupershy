document.addEventListener('DOMContentLoaded', function() {
    // 3초 후에 다음 페이지로 자동 이동
    setTimeout(function() {
        window.location.href = "/rest-mode"; // 다음 페이지의 URL로 변경
    }, 3000); // 3000ms = 3초
});