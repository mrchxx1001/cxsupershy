document.addEventListener('DOMContentLoaded', function () {
    const slider = document.getElementById('humiditySlider');
    const humidityDisplay = document.getElementById('humidity');

    // 초기 값 설정
    let humidity = 50;
    updateHumidity(humidity);

    // 슬라이더 조작 시 습도 업데이트
    slider.addEventListener('input', (e) => {
        humidity = e.target.value;
        updateHumidity(humidity);
    });

    // 키보드 방향키로 습도 조절
    document.addEventListener('keydown', (e) => {
        if (e.key === 'ArrowUp' && humidity < 90) {
            humidity++;
            updateHumidity(humidity);
        } else if (e.key === 'ArrowDown' && humidity > 10) {
            humidity--;
            updateHumidity(humidity);
        }
    });

    // 습도 업데이트 함수
    function updateHumidity(hum) {
        humidityDisplay.textContent = `${hum}%`;
        slider.value = hum;
    }

    // 이전 버튼 클릭 이벤트 처리
    document.getElementById("previous").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 이동
    });

    // 다음 버튼 클릭 이벤트 처리
    document.getElementById("next").addEventListener("click", function() {
        window.location.href = "/show-flask-page"; // 다음 페이지로 이동 (URL에 맞게 수정)
    });
});
