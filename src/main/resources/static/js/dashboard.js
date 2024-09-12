document.addEventListener('DOMContentLoaded', function() {
    // 이미지 클릭 시 다른 페이지로 이동하는 함수
    function navigateTo(url) {
        window.location.href = url;  // 주어진 URL로 이동
    }
    // 이미지에 클릭 이벤트 추가
    document.querySelector('img[alt="Home"]').addEventListener('click', function() {
        navigateTo('/dashboard');  // home 페이지로 이동
    });

    document.querySelector('img[alt="Air Conditioning"]').addEventListener('click', function() {
        navigateTo('/custom-temperature');  // 온도 설정 페이지로 이동
    });

    document.querySelector('img[alt="Humidity"]').addEventListener('click', function() {
        navigateTo('/custom-humid');  // 습도 설정 페이지로 이동
    });

    document.querySelector('img[alt="Seat"]').addEventListener('click', function() {
        navigateTo('/custom-seat');  // 좌석 설정 페이지로 이동
    });

    document.querySelector('img[alt="Profileimg"]').addEventListener('click', function() {
        navigateTo('/switch-profile');  // 프로필 전환
    });

    document.querySelector('img[alt="Destination"]').addEventListener('click', function() {
            navigateTo('/kakao_map');  // 길찾기 전환
        });

    // 'Kids App'을 클릭하면 아이들나라로 이동
    document.querySelector('img[alt="Kids App"]').addEventListener('click', function() {
        console.log("아이들나라로 가라고!")
        navigateTo('https://www.i-nara.co.kr');  // 아이들나라 페이지로 이동
    });

    document.querySelector('img[alt="Duolingo"]').addEventListener('click', function() {
        navigateTo('https://www.duolingo.com/');  // Duolingo 페이지로 이동
    });

    document.querySelector('img[alt="Rest Mode"]').addEventListener('click', function() {
        console.log("휴식으로 가라구!!!")
        navigateTo('/into-rest-mode');  // 휴식 모드 페이지로 이동
    });
});
