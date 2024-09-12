document.addEventListener('DOMContentLoaded', function () {
    // 시트와 등받이 DOM 요소를 가져옴
    const seat = document.getElementById('seat');
    const backrest = document.getElementById('backrest');

    // 초기 좌표와 각도 값 설정
    let seatPositionX = 50; // 시트의 초기 좌우 위치 (중앙)
    let backrestAngle = 0;  // 등받이의 초기 각도

    // 시트 이동 범위 제한
    const minSeatPositionX = 50 - 20;  // 시트는 앞으로 20%까지만 이동 가능 (50%에서 30%까지)
    const maxSeatPositionX = 100;      // 시트는 뒤로 최대 100%까지 이동 가능

    // 등받이 각도 제한
    const minBackrestAngle = -10;    // 등받이 최소 각도 (수직)
    const maxBackrestAngle = 180;  // 등받이 최대 각도 (완전히 뒤로)



    // 키보드 입력으로 시트와 등받이 조정
    document.addEventListener('keydown', (e) => {
        // 좌/우 방향키로 시트 좌우 이동
        if (e.key === 'ArrowLeft' && seatPositionX > minSeatPositionX) {
            seatPositionX -= 1; // 왼쪽으로 1% 이동
            seat.style.left = `${seatPositionX}%`;
        } else if (e.key === 'ArrowRight' && seatPositionX < maxSeatPositionX) {
            seatPositionX += 1; // 오른쪽으로 1% 이동
            seat.style.left = `${seatPositionX}%`;
        }

        // 위/아래 방향키로 등받이 각도 조절
        if (e.key === 'ArrowUp'&& backrestAngle > minBackrestAngle) {
            backrestAngle -= 2; // 등받이를 앞쪽으로 기울임
            backrest.style.transform = `rotate(${backrestAngle}deg) translateX(-50%)`;
        } else if (e.key === 'ArrowDown'&& backrestAngle < maxBackrestAngle) {
            backrestAngle += 2; // 등받이를 뒤쪽으로 기울임
            backrest.style.transform = `rotate(${backrestAngle}deg) translateX(-50%)`;
        }
    });

    // 이전 버튼 클릭 이벤트 처리
    document.getElementById("previous").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 이동
    });

    // 다음 버튼 클릭 이벤트 처리
    document.getElementById("next").addEventListener("click", function() {
        window.location.href = "/custom-mirror"; // 미러 설정 페이지로 이동
    });
});
