document.addEventListener('DOMContentLoaded', function () {
    // 미러 DOM 요소를 가져옴
    let selectedMirrorIndex = 0; // 선택된 미러의 인덱스 (0: 왼쪽, 1: 가운데, 2: 오른쪽)
    const mirrors = document.querySelectorAll('.mirror-img');
    const mirrorAngles = [0, 0, 0]; // 각 미러의 각도 저장

    // 선택된 미러 강조 (선택된 미러에 빨간 테두리 표시)
    function updateSelectedMirror() {
        mirrors.forEach((mirror, index) => {
            mirror.classList.remove('selected'); // 모든 미러의 선택 해제
            if (index === selectedMirrorIndex) {
                mirror.classList.add('selected'); // 선택된 미러에 선택된 스타일 적용
            }
        });
    }

    // 키보드 입력 처리
    document.addEventListener('keydown', function(event) {
        switch (event.key) {
            case 'ArrowLeft':
                selectedMirrorIndex = (selectedMirrorIndex - 1 + mirrors.length) % mirrors.length; // 이전 미러 선택
                updateSelectedMirror();
                break;
            case 'ArrowRight':
                selectedMirrorIndex = (selectedMirrorIndex + 1) % mirrors.length; // 다음 미러 선택
                updateSelectedMirror();
                break;
            case 'ArrowUp':
                mirrorAngles[selectedMirrorIndex] += 5; // 위쪽 방향키로 각도를 5도 증가
                mirrors[selectedMirrorIndex].style.transform = `rotate(${mirrorAngles[selectedMirrorIndex]}deg)`;
                break;
            case 'ArrowDown':
                mirrorAngles[selectedMirrorIndex] -= 5; // 아래쪽 방향키로 각도를 5도 감소
                mirrors[selectedMirrorIndex].style.transform = `rotate(${mirrorAngles[selectedMirrorIndex]}deg)`;
                break;
            default:
                break;
        }
    });

    // 이전 버튼 클릭 이벤트 처리
    document.getElementById("previous").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 이동
    });

    // 다음 버튼 클릭 이벤트 처리
    document.getElementById("next").addEventListener("click", function() {
        window.location.href = "/custom-temperature"; // 다음 페이지로 이동
    });
});
