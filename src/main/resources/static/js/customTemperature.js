document.addEventListener('DOMContentLoaded', function () {
    const slider = document.getElementById('temperatureSlider');
    const temperatureDisplay = document.getElementById('temperature');

    // 초기 값 설정
    let temperature = 23;
    updateTemperature(temperature);

    // 슬라이더 조작 시 온도 업데이트
    slider.addEventListener('input', (e) => {
        temperature = e.target.value;
        updateTemperature(temperature);
    });

    // 키보드 방향키로 온도 조절
    document.addEventListener('keydown', (e) => {
        if (e.key === 'ArrowUp' && temperature < 40) {
            temperature++;
            updateTemperature(temperature);
        } else if (e.key === 'ArrowDown' && temperature > 10) {
            temperature--;
            updateTemperature(temperature);
        }
    });

    // 온도 업데이트 함수
    function updateTemperature(temp) {
        temperatureDisplay.textContent = `${temp}°C`;
        slider.value = temp;
    }

    // 이전 버튼 클릭 이벤트 처리
    document.getElementById("prevBtn").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 이동
    });

    // 다음 버튼 클릭 이벤트 처리
    document.getElementById("nextBtn").addEventListener("click", function() {
        window.location.href = "/custom-humid"; // 다음 페이지로 이동 (URL에 맞게 수정)
    });
});
